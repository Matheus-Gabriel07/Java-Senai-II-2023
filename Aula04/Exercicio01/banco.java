package Aula04.Exercicio01;
import java.util.Scanner;

//@Matheus
/**
 * Modificadores de Acesso
 * Servem para definir a visibilidade que o determinada classe,
 * ou membro, terá diante de outras. Elese estão relacionados ao
 * conceito de ENCAPSULAMENTO (Segurança). Tendo os seguintes
 * modificadores:
 * - public: Torna uma classe visível para qualquer outra
 * classe. [SEM ENCAPSULAMENTO];
 * - protected: Torna um membro acessível as classes do mesmo
 * pacote atráves da herança.
 * - private: Torna um membro acessível apenas pra classe que o
 * contém. [ENCAPSULAMENTO + Restrito];
 */

public class banco {
    private double saldo; // O saldo não pode ser alterado em qualquer lugar do programa
    private String nomeTitular;
    private int numeroConta;

    Scanner sc = new Scanner(System.in);

    public banco(double saldo, String nomeTitular, int numeroConta) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo inicial Inválido. O saldo deve ser maior, ou igual, a 0.");
        }
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        System.out.println("Aguarde...");
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
            System.out.println("Saque de R$" + valor + ", realizado com sucesso. Extrato restante: R$" + saldo + " \n");
            return true;
        } else {
            System.out.println("Saque inválido. Saldo insuficiente, ou valor invalido\n");
            return false;
        }
    }

    // Metódo PIX
    public void pix(String cpf, int valor) {
        if(saldo < valor) {
            System.out.println("Valor insuficiente, ou valor invalido\n");
        } else {
            saldo -= valor;
            System.out.println("\t=================\n" +
                   "\nPIX feito para: " + cpf + "\n" +
                   "\sValor: R$" + valor + "\n" +
                   "\sSaldo da conta: R$" + saldo + "\n" +
                   "\t=================\n");
        }
   }

    // Exibição de dados
    public void informacoes() {
        System.out.println("\t=================\n" +
                "\sTitular da conta: " + nomeTitular + "\n" +
                "\sSaldo disponivel: R$" + saldo + "\n" +
                "\sNúmero da Conta: " + numeroConta + "\n" +
                "\t=================\n");
    }

    public void menu() {
        System.out.print("\t======= SENAI Bank =======\n" +
                "\sOpções:\n" +
                "\s 01) Consultar Extrato\n" +
                "\s 02) Sacar\n" +
                "\s 03) Depositar\n" +
                "\s 04) PIX\n" +
                "\s 05) Sair\n" +
                "\s Digite uma opção:");
    }

    public void menuIniciar(){
        boolean continuar = true;
        do {
            menu();
            int opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Aguarde... \n");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }

                    System.out.print("Seu saldo atual é: " + consultarExtrato() + " \n");
                    break;

                case 2:
                    System.out.println("Quanto deseja sacar?\n");
                    int saqueValor = sc.nextInt();
                    sacar(saqueValor);
                    break;

                case 3:
                    System.out.println("Quanto deseja depositar?\n");
                    int depositoValor = sc.nextInt();
                    deposito(depositoValor);
                    break;

                case 4:
                    System.out.println("Insira o CPF da pessoa?\n");
                    String cpfDestinatario = sc.next();
                    System.out.println("Insira o valor do pix:");
                    int valorPix = sc.nextInt();

                    System.out.println("Aguarde... \n");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }

                    pix(cpfDestinatario, valorPix);
                    break;

                case 5:
                    System.out.println("Obrigado por utilizar\n");
                    continuar = false;
                    break;

                default:
                    try {
                        Thread.sleep(1000);
                        System.out.println("Está opção não é valida\n");
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                    break;
            }
        } while (continuar);
    }
}