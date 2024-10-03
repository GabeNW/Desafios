package Desafio5;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1);
        ContaPoupanca cp = new ContaPoupanca(2);

        System.out.println("Saldo da conta corrente: " + cc.consultarSaldo());
        System.out.println("Saldo da conta poupança: " + cp.consultarSaldo());

        cc.depositar(100);
        cp.depositar(100);

        System.out.println("Saldo da conta corrente: " + cc.consultarSaldo());
        System.out.println("Saldo da conta poupança: " + cp.consultarSaldo());
    }
}
