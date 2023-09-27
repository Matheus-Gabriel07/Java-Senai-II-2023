package Aula04.Exercicio01;

import java.util.*;

public class testeBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random numeroUser = new Random();
        int numeroConta = numeroUser.nextInt(9999);

        System.out.print("=== Seja bem-vindo ao SENAI Bank ===\n" +
                "- Digite o seu nome\n");
        String nomeUsuario = sc.nextLine();
        System.out.println("- Agora necessito que insira seu saldo: ");
        double saldoInial = sc.nextDouble();
        banco newUser = new banco(saldoInial, nomeUsuario, numeroConta);
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        newUser.informacoes();
        newUser.menuIniciar();

        sc.close();
    }
}
