public class ContaCorrente {
    double saldo;

    ContaCorrente(double saldoInicial){
        this.saldo = saldoInicial;
    }

    void sacar(double valor){
        saldo = saldo - valor;
    }

    void depositar(double valor){
        saldo = saldo + valor;
    }

    double saldo(){
        return saldo;
    }
}
