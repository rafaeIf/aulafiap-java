public class Usuario {

    // atributos:

    int idade;
    double salario;
    char sexo;
    boolean casado;
    String nome;

    // construtor:

    public Usuario(int idade, double salario, char sexo, boolean casado, String nome){
        this.idade = idade;
        this.salario = salario;
        this.sexo = sexo;
        this.casado = casado;
        this.nome = nome;
    }

    // métodos:
    void exibir(){
        System.out.println("Nome: "+nome+", Idade: "+idade+", Sexo: "+sexo+", Casado: "+casado+", Salário: "+salario);
    }
}
