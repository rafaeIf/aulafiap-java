import java.util.Scanner; // importação do scanner

public class Main {

    public static void main(String[] args){

        Scanner leitorDeDados = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = leitorDeDados.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = leitorDeDados.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double numero3 = leitorDeDados.nextDouble();

        double media = (numero1+numero2+numero3)/3;
        System.out.println("O média dos números é: "+media);

        leitorDeDados.close();

    }

}