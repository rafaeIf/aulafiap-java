import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner leitorDeDados = new Scanner(System.in);

        System.out.println("Digite a idade do usuário: ");
        int idade = leitorDeDados.nextInt();
        System.out.println("Digite o salario do usuário: ");
        double salario = leitorDeDados.nextDouble();
        System.out.println("Digite o sexo do usuário: ");
        char sexo = leitorDeDados.next().charAt(0);
        System.out.println("Digite se o usuário está casado ou n: ");
        boolean casado = leitorDeDados.nextBoolean();
        System.out.println("Digite o nome do usuário: ");
        String nome = leitorDeDados.next();

        leitorDeDados.close();

        Usuario umUsuario = new Usuario(idade, salario, sexo, casado, nome);

        umUsuario.exibir();

    }
}
