package Desafio5;

public class ContaCorrente extends ContaBancaria{
    public ContaCorrente(int id) {
        this.id = id;
        this.saldo = 300;
    }

    public double consultarSaldo() {
        return saldo;
    }
    public void depositar(double valor) {
        saldo += valor;
    }
}
