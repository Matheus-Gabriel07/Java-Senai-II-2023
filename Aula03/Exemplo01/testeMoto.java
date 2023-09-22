package Aula03.Exemplo01;

import java.util.Scanner;

public class testeMoto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        moto scooter = new moto();
        scooter.velocidadeMaxima = 120;
        scooter.velocidadeAtual = 25;
        scooter.ligar();

        System.out.println(".............." +
                "Moto 1" +
                "..............");

        System.out.println(".............." +
                "A moto entrou em movimento, quanto deseja acelerar?" +
                "..............");
        double velocidade = sc.nextDouble();
        scooter.acelerar(velocidade);

        System.out.println(".............." +
                "O tanque está baixo, você parou num posto de gasolina, o que deseja colocar? (Gasolina/Alcool)" +
                "..............");
        String tipoCombustivel = sc.next();
        System.out.println(".............." +
                "Você colocou 50 litros de " + tipoCombustivel +
                "..............");
        scooter.buzinar();
        scooter.desligar();

        System.out.println(".............." +
                "A moto 2" +
                "..............");

        moto kavasaki = new moto();
        kavasaki.velocidadeMaxima = 150;
        kavasaki.velocidadeAtual = 10;

        System.out.println(".............." +
                "A moto entrou em movimento, quanto deseja acelerar?" +
                "..............");
        velocidade = sc.nextDouble();
        kavasaki.acelerar(velocidade);

        System.out.println(".............." +
                "O tanque está baixo, você parou num posto de gasolina, o que deseja colocar? (Gasolina/Alcool)" +
                "..............");
        tipoCombustivel = sc.next();
        System.out.println(".............." +
                "Você colocou 50 litros de " + tipoCombustivel +
                "..............");
        kavasaki.buzinar();
        kavasaki.desligar();

        System.out.println(".............." +
                "A moto 3" +
                "..............");

        moto harly = new moto();
        harly.velocidadeMaxima = 150;
        harly.velocidadeAtual = 10;

        System.out.println(".............." +
                "A moto entrou em movimento, quanto deseja acelerar?" +
                "..............");
        velocidade = sc.nextDouble();
        harly.acelerar(velocidade);

        System.out.println(".............." +
                "O tanque está baixo, você parou num posto de gasolina, o que deseja colocar? (Gasolina/Alcool)" +
                "..............");
        tipoCombustivel = sc.next();
        System.out.println(".............." +
                "Você colocou 50 litros de " + tipoCombustivel +
                "..............");
        harly.buzinar();
        harly.desligar();

        sc.close();
    }
}
