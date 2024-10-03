package Desafio5;

public class ContaPoupanca extends ContaBancaria{
    public ContaPoupanca(int id) {
        this.id = id;
        this.saldo = 300;
    }

    public double consultarSaldo() {
        return saldo;
    }
    public void depositar(double valor) {
        valor *= 0.99;
        saldo += valor;
    }
}
