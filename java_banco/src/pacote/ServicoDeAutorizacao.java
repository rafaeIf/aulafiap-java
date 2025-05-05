package pacote;

public class ServicoDeAutorizacao {

    public int senhaConferir;
    public double saldoGastar;

    public ServicoDeAutorizacao(int senhaConferir){
        this.senhaConferir = senhaConferir;
    }

    public boolean verificarSenha(int senhaConferir, Cartao cartao){
        if (cartao.mostrarSenha() == senhaConferir) {
            return true;
        }
        return false;
    }

    public boolean verificarSaldo(double saldoGastar, Cartao cartao){
        if (saldoGastar < cartao.saldo){
            cartao.saldo = cartao.saldo - saldoGastar;
            return true;
        }
        return false;
    }

}
