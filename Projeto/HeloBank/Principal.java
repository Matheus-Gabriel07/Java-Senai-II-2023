package HeloBank;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        System.out.println("=== Seja bem vindo ao HeloBank ===");

        System.out.println("Digite seu tipo de conta \n" +
                "1) Conta corrente \n" +
                "2) COnta poupança \n");
        int opc = sc.nextInt();

        switch (opc) {
            case 1:
                System.out.println("\n Conta corrente selecionada...");
                System.out.println("Digite o nome do titular");
                nome = sc.next();

                
                System.out.println("Digite o seu saldo: ");
                double valor = sc.nextDouble();

                ContaCorrente user = new ContaCorrente(valor, nome, 0);
                user.cobrarTaxa(valor);
                user.resultado();
                break;

            case 2:
                System.out.println("\n Conta poupança selecionada...");
                System.out.println("Digite o nome do titular");
                nome = sc.next();
                ContaPolpanca userPolpanca = new ContaPolpanca(1000, nome, 0);

                userPolpanca.Poupanca();

                break;

            default:
                System.out.println("Opção inválida. Encerrando programa.");
                break;
        }
        sc.close();
    }
}
