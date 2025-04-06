import pacote.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String login, loginAcesso, senha, senhaAcesso;
        Scanner leitor = new Scanner(System.in);

        System.out.println("\n*=*=* PIZZARIA DO RAFA *=*=*");

        System.out.print("Olá! Crie um login: ");
        login = leitor.next();
        System.out.print("Crie uma senha: ");
        senha = leitor.next();

        Cliente cliente = new Cliente(login, senha);

        System.out.print("\nDigite o login: ");
        loginAcesso = leitor.next();
        System.out.print("Digite a senha: ");
        senhaAcesso = leitor.next();

        boolean fezLogin = cliente.verificacaoSenha(loginAcesso, senhaAcesso);
        if (fezLogin){

            Pizza queijoP = new Pizza(1,"Queijo", "Pequena", 50);
            Pizza queijoM = new Pizza(2,"Queijo", "Média", 60);
            Pizza queijoG = new Pizza(3,"Queijo", "Grande", 70);
            Pizza frangoP = new Pizza(4,"Frango", "Pequena", 60);
            Pizza frangoM = new Pizza(5,"Frango", "Média", 70);
            Pizza frangoG = new Pizza(6,"Frango", "Grande", 80);
            Pizza calabresaP = new Pizza(7,"Calabresa", "Pequena", 55);
            Pizza calabresaM = new Pizza(8,"Calabresa", "Média", 65);
            Pizza calabresaG = new Pizza(9,"Calabresa", "Grande", 75);

            ArrayList<Pizza> pizzas = new ArrayList<>();
            pizzas.add(queijoP);
            pizzas.add(queijoM);
            pizzas.add(queijoG);
            pizzas.add(frangoP);
            pizzas.add(frangoM);
            pizzas.add(frangoG);
            pizzas.add(calabresaP);
            pizzas.add(calabresaM);
            pizzas.add(calabresaG);

            System.out.println("\nPizzas disponíveis:");
            for(Pizza pizza : pizzas){
                System.out.println(pizza.exibir());
            }

            System.out.print("\nSelecione a pizza que você quer: ");
            int indice = leitor.nextInt() - 1;
            Pizza selecionada = pizzas.get(indice);
            System.out.println("Pizza selecionada: "+selecionada.exibir());

        }
        else {
            System.out.println("Credenciais incorretas!");
        }

        leitor.close();
    }
}