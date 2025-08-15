package banco;

import dominio.Funcionario;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class FuncionarioDAO {

    private Connection conexao;

    public FuncionarioDAO(){
        conexao = new ConnectionFactory().obterConexao();
    }

    public void adiciona(Funcionario funcionario){
        try{
            String sqlInsert = "INSERT INTO funcionarios (nome, cracha, data_nascimento) VALUES( ?, ?, ?)";
            // comando de inserção = preparedstatement
            PreparedStatement preparedStatement = conexao.prepareStatement(sqlInsert);
            preparedStatement.setString(1, funcionario.getNome());
            preparedStatement.setString(2,funcionario.getCracha());
            preparedStatement.setDate(3, toJavaSqlDate(funcionario.getDataNasc()));
            preparedStatement.execute();
            preparedStatement.close();
            conexao.close();
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    private Date toJavaSqlDate(LocalDate dataNasc) {
        return Date.valueOf(dataNasc);
    }

    public void fechar() {
        try {
            conexao.close();
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Funcionario> listarTodos() {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        String sqlSelect = "SELECT * FROM FUNCIONARIOS";
        try{
            PreparedStatement preparedStatement = conexao.prepareStatement(sqlSelect);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                Funcionario funcionario = new Funcionario();
                funcionario.setNome(resultSet.getString("nome"));
                funcionario.setCracha(resultSet.getString("cracha"));
                funcionario.setDataNasc(resultSet.getDate("data_nascimento").toLocalDate());
                funcionarios.add(funcionario);
            }
            preparedStatement.close(); // comando de inserção de comandos
            resultSet.close(); // comando de seleção
        } catch(SQLException e){
        throw new RuntimeException(e);
        }
        return funcionarios;
    }
}
