package Aula04.Exercicio01;

import java.util.*;

public class testeBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = 1000;
        int max = 9999;
        int numeroUser = (int) Math.floor(Math.random() * (max - min + 1) + min);

        System.out.print("=== Seja bem-vindo ao SENAI Bank ===\n" +
                "- Necessito que digite o seu nome\n");
        String nomeUsuario = sc.nextLine();
        System.out.println("- Agora necessito que insira seu saldo: ");
        double saldoInial = sc.nextDouble();
        banco newUser = new banco(saldoInial, nomeUsuario, numeroUser);
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
