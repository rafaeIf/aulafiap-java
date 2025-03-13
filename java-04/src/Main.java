import java.util.Scanner; // importação do scanner

public class Main {

    public static void main(String[] args){

        Scanner leitorDeDados = new Scanner(System.in); // variavel scanner

        System.out.print("Digite a idade da pessoa: ");
        int idade = leitorDeDados.nextInt();
        // exemplo de entrada de dados

        System.out.println("A idade da pessoa é: " + idade);

        System.out.print("Agora, digite o salário da pessoa: ");
        double salario = leitorDeDados.nextDouble();

        System.out.println("O salário reajustado da pessoa é: " + salario*1.10);

        System.out.print("Para finalizar, digite o nome da pessoa: ");
        String nome = leitorDeDados.next();

        System.out.println("O nome da pessoa é: " + nome);

    }

}