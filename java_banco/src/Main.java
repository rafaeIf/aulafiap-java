import pacote.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor da cobrança: ");
        double valorCobranca = leitor.nextDouble();

        System.out.println("Inserindo Cartão...");
        System.out.print("Digite a senha: ");
        int senhaCartao = leitor.nextInt();

        Cartao cartao = new Cartao("1234234534564567", 1234, 1000);
        ServicoDeAutorizacao servico = new ServicoDeAutorizacao(senhaCartao);
        boolean testeSenha = servico.verificarSenha(senhaCartao, cartao);
        boolean testeSaldo = servico.verificarSaldo(valorCobranca, cartao);

        if (testeSaldo && testeSenha){
            System.out.println("Êxito na compra!");
            System.out.println("Saldo na conta: "+cartao.mostrarSaldo());
        }
        else{
            System.out.println("Recusado!");
            System.out.println("Saldo na conta: "+cartao.mostrarSaldo());
        }
    }
}