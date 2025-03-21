public class Main {
    public static void main(String [] args){

        ContaCorrente contaDoNeymar = new ContaCorrente(10000);
        contaDoNeymar.sacar(1000);
        System.out.println(contaDoNeymar.saldo());

        ContaCorrente contaDoProfessor = new ContaCorrente(500000);
        contaDoProfessor.depositar(100);
        System.out.println(contaDoProfessor.saldo());
    }
}
