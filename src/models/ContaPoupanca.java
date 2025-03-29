package models;

public class ContaPoupanca extends Conta implements Rentavel {
    public ContaPoupanca(String numeroConta, double saldoInicial) {
        super(numeroConta, saldoInicial);
    }

    @Override
    public double calcularRendimento() {
        return saldo * 0.05; // Exemplo: 5% de rendimento sobre o saldo
    }
}
