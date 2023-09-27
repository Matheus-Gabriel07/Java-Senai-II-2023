/** 
 * @author Matheus Gabriel
 * @since 1.1 
*/

package Aula04.Exercicio01;
import java.util.Random;
import java.util.Scanner;

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
        if (saldo < valor) {
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

    // Método de Pagar boleto
    public void menuContas() {
        System.out.print("\t======= Pagar contas =======\n" +
                "\sOpções:\n" +
                "\s 01) Luz\n" +
                "\s 02) Água\n" +
                "\s 03) Cartão de Crédito\n" +
                "\s Digite uma opção:");
    }

    public void iniciarPagarContas() {
        boolean continuar = false;
        menuContas();
        do {
            int opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("== Conta de luz ==");
                    pagarContas(1);
                    break;

                case 2:
                    System.out.println("== Conta de água ==");
                    pagarContas(2);
                    break;

                case 3:
                    System.out.println("== Conta de cartão de crédito ==");
                    pagarContas(3);
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;

            }
        } while (continuar);
    }

    public void pagarContas(int opcConta) {
        Random valorContaLuz = new Random();
        int valorPagarLuz = valorContaLuz.nextInt(400);
        Random valorContaAgua = new Random();
        int valorPagarAgua = valorContaAgua.nextInt(350);
        Random valorContaCartao = new Random();
        int valorPagarCartao = valorContaCartao.nextInt(2500);

        switch (opcConta) {
            case 1:
                System.out.println("Valor da conta é: " + valorPagarLuz);
                validacaoConta(valorPagarLuz);
                break;

            case 2:
                System.out.println("Valor da conta é: " + valorPagarAgua);
                validacaoConta(valorPagarAgua);
                break;

            case 3:
                System.out.println("Valor da conta é: " + valorPagarCartao);
                validacaoConta(valorPagarCartao);
                break;

            default:
                System.out.println("Essa conta não existe");
                break;
        }
    }

    public void validacaoConta(int valorPagar) {
        System.out.println("Deseja pagar? (1- Sim/ 2- Não)");
        int opc = sc.nextInt();
        switch (opc) {
            case 1:
                if (saldo >= valorPagar) {
                    saldo -= valorPagar;
                    System.out.println("Conta paga. Saldo atual é de R$" + saldo);
                } else {
                    System.out.println("Não foi possivel pagar a conta. Valor de saldo insuficiente.");
                }
                break;

            case 2:
                break;

            default:
                System.out.println("Opção inválida");
                break;
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
                "\s 05) Pagar conta\n" +
                "\s 06) Sair\n" +
                "\s Digite uma opção:");
    }

    public void menuIniciar() {
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
                    iniciarPagarContas();
                    break;

                case 6:
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