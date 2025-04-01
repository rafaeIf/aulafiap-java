import pacote.Endereco;
import pacote.Cliente;

import java.util.ArrayList;
import java.util.Scanner;
import pacote.Livro;

public class Main {
    public static void main(String[] args) {
        String login, senha, nome, logradouro;
        int id;

        Scanner leitorDeDados = new Scanner(System.in);
        System.out.print("Digite o seu login: ");
        login = leitorDeDados.next();
        System.out.print("Digite a sua senha: ");
        senha = leitorDeDados.next();
        System.out.print("Digite o seu nome: ");
        nome = leitorDeDados.next();
        System.out.print("Olá "+nome+"! Agora, digite aonde você quer receber seus produtos: ");
        logradouro = leitorDeDados.next();

        Endereco novoEndereco = new Endereco(nome, logradouro);
        Cliente novoCliente = new Cliente(login, senha, novoEndereco);

        // criando alguns livros
        Livro pequenoPrincipe = new Livro(1, "O Pequeno Príncipe");
        Livro harryPotter = new Livro(2, "Harry Potter e a Pedra Filosofal");
        Livro hobbit = new Livro(3, "O Hobbit");
        Livro senhoresAneis = new Livro(4, "O Senhor dos Anéis");
        Livro dracula = new Livro(5, "Drácula");

        ArrayList<Livro> livros = new ArrayList<>();
        livros.add(pequenoPrincipe);
        livros.add(harryPotter);
        livros.add(hobbit);
        livros.add(senhoresAneis);
        livros.add(dracula);
    }
}