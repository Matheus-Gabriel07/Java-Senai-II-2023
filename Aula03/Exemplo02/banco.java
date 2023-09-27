package Aula03.Exemplo02;

public class banco {
    private double saldo; // O saldo não pode ser alterado em qualquer lugar do programa
    private String nomeTitular;

    public banco(double saldo, String nomeTitular) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo inicial Inválido. O saldo deve ser maior, ou igual, a 0.");
        }
        this.nomeTitular = nomeTitular;
    }

    // Metódo de consulta de saldo na conta
    public double consultarExtrato() {
        return saldo;
    }

    // Metódo de deposito
    public void deposito(int quantia) {
        if (quantia > 0) {
            saldo += quantia;
            System.out.println("Depósito de R$" + quantia + ", realizado com sucesso");
        } else {
            System.out.println("Não é possivel depositar esta quantia");
        }
    }

    // Metódo de sacar
    public boolean sacar(double valor) {
        if (saldo >= valor && valor > 0) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + ", realizado com sucesso. Extrato restante: R$" + saldo);
            return true;
        } else {
            System.out.println("Saque inválido. Saldo insuficiente, ou valor invalido");
            return false;
        }
    }

    // Exibição de dados
    public void informacoes() {
        System.out.println("\t=================\n" +
                "\sTitular da conta: " + nomeTitular + "\n" +
                "\sSaldo disponivel: R$" + saldo + "\n" +
                "\t=================\n");
    }
}