import banco.FuncionarioDAO;
import dominio.Funcionario;

import java.time.LocalDate;
import java.util.ArrayList;

public class SistemaDeFuncionarios {

    public static void main(String[] args){
        Funcionario mario = new Funcionario("Mario", "12234", LocalDate.of(1245,04,30));
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        funcionarioDAO.adiciona(mario);
        funcionarioDAO.listarTodos();
        funcionarioDAO.fechar();

        ArrayList<Funcionario> funcionarios = funcionarioDAO.listarTodos();

        for (Funcionario Funcionario : funcionarios){
            System.out.println(Funcionario.getNome());
            System.out.println(Funcionario.getCracha());
            System.out.println(Funcionario.getDataNasc());

        }

    }
}
