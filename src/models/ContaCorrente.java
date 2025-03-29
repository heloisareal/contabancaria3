package models;

public class ContaCorrente extends Conta implements Imposto {
    public ContaCorrente(String numeroConta, double saldoInicial) {
        super(numeroConta, saldoInicial);
    }

    @Override
    public double calcularImposto() {
        return saldo * 0.01; // Exemplo: 1% de imposto sobre o saldo
    }
}
