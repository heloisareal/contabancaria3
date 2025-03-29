package main;

import models.*;

public class Main {
    public static void main(String[] args) {
        // Criando contas
        ContaCorrente contaCorrente = new ContaCorrente("001", 1000);
        ContaPoupanca contaPoupanca = new ContaPoupanca("002", 1000);

        // Banco
        Banco banco = new Banco();
        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPoupanca);

        // Operações
        contaCorrente.depositar(200);
        contaPoupanca.depositar(500);

        contaCorrente.sacar(400);
        contaPoupanca.sacar(100);

        // Exibindo Saldo
        System.out.println("Saldo Conta Corrente: " + contaCorrente.getSaldo());
        System.out.println("Saldo Conta Poupança: " + contaPoupanca.getSaldo());

        // Aplicando impostos e rendimentos
        banco.aplicarImpostos();
        banco.aplicarRendimentos();

        // Mostrando o saldo após rendimento
        System.out.println("Saldo Conta Poupança após rendimento: " + contaPoupanca.getSaldo());
    }
}
