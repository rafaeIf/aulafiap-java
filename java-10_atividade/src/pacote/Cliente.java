package pacote;

public class Cliente {
    String login;
    String senha;
    Endereco endereco;

    public Cliente(String login, String senha, Endereco endereco){
        this.login = login;
        this.senha = senha;
        this.endereco = endereco;
    }

}
