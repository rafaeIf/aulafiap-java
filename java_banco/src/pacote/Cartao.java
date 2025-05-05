package pacote;

public class Cartao {
    private String numero;
    private int senha;
    protected double saldo; //só o pacote tem acesso

    public Cartao(String numero, int senha, double saldo) {
        this.numero = numero;
        this.senha = senha;
        this.saldo = saldo;
    }

    protected int mostrarSenha(){
        return(senha);
    }

    public double mostrarSaldo(){
        return(saldo);
    }
}
