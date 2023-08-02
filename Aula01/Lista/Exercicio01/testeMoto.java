package Aula01.Lista.Exercicio01;

import java.util.*;

public class testeMoto {
    public static void main(String[] args) {
        moto scooter = new moto();
        scooter.velocidadeMax = 200;
        scooter.combustivel = 40;
        scooter.cilindradas = 50;

        moto trail = new moto();
        trail.velocidadeMax = 120;
        trail.combustivel = 60;
        trail.cilindradas = 100;

        trail.ligar();
        trail.bozinar();
        trail.parar();

        Scanner sc = new Scanner(System.in);
        System.out.println("Quanto deseja acelerar");
        double valor = sc.nextDouble();
        int teste1 = scooter.acelerar(valor);
        int teste2 = trail.acelerar(valor);

        System.out.println("A velociadade atual é: " + scooter.velocidadeAtual + "km/h");
        System.out.println("A velociadade atual é: " + trail.velocidadeAtual + "km/h");

        if (teste1 == -1 || teste2 == -1) {
            System.out.println("CARA, reduza a velocidade");
        } else if (teste1 >= 120 || teste2 >= 120) {
            System.out.println("CARA, reduza a velocidade");
        }

        sc.close();
    }
}