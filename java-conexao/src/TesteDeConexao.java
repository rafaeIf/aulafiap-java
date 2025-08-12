import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

public class TesteDeConexao {

    public static void main(String[] args) throws SQLException {
        ConnectionFactory connectionFactory = new ConnectionFactory();

        Connection conexao = connectionFactory.obterConexao();
        System.out.println("Conectado!!");

        String sqlInsert = "INSERT INTO funcionarios (nome, cracha, data_nascimento) VALUES( ?, ?, ?)";

        PreparedStatement preparedStatement = conexao.prepareStatement(sqlInsert);
        preparedStatement.setString(1,"Cristiano Ronaldo");
        preparedStatement.setString(2,"34756");
        preparedStatement.setDate(3, Date.valueOf(LocalDate.of(2000, 6, 6)));
        preparedStatement.execute();
        preparedStatement.close();
        conexao.close();
        System.out.println("Desconectado...");
    }
}
