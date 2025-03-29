package models;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas;

    public Banco() {
        contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void aplicarImpostos() {
        for (Conta conta : contas) {
            if (conta instanceof Imposto) {
                double imposto = ((Imposto) conta).calcularImposto();
                System.out.println("Imposto da " + conta.getClass().getSimpleName() + ": " + imposto);
            }
        }
    }

    public void aplicarRendimentos() {
        for (Conta conta : contas) {
            if (conta instanceof Rentavel) {
                double rendimento = ((Rentavel) conta).calcularRendimento();
                System.out.println("Rendimento da " + conta.getClass().getSimpleName() + ": " + rendimento);
            }
        }
    }
}
