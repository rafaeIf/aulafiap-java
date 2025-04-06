package pacote;

public class Cliente {
    String login;
    String senha;

    public Cliente(String login, String senha){
        this.login = login;
        this.senha = senha;
    }

    public boolean verificacaoSenha(String loginAcesso,
                                    String senhaAcesso) {
        boolean a = login.equals(loginAcesso);
        boolean b = senha.equals(senhaAcesso);

        return a && b;
    }
}
