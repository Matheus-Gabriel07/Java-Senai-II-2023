package Aula03.Exemplo01;

import java.util.Scanner;

public class testeMoto {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String gasolina = "Gasolina";
                String alcool = "Alcool";

                moto scooter = new moto();
                scooter.velocidadeMaxima = 120;
                scooter.velocidadeAtual = 25;
                scooter.ligar();

                System.out.println(".............." +
                                "Moto 1" +
                                "..............");

                System.out.println(scooter.velocidadeAtual);
                System.out.println(".............." +
                                "A moto entrou em movimento, quanto deseja acelerar?" +
                                "..............");
                double velocidade = sc.nextDouble();
                scooter.acelerar(velocidade);

                System.out.println(".............." +
                                "O tanque está baixo, você parou num posto de gasolina, o que deseja colocar? (Gasolina/Alcool)"
                                +
                                "..............");
                String tipoCombustivel = sc.next();

                boolean verificaGasolina = tipoCombustivel.equals(gasolina);
                boolean verificaAlcool = tipoCombustivel.equals(alcool);
                String respostaCombutivel = (verificaGasolina == true || verificaAlcool == true) ? "Ok"
                                : "Combustivel invalido";

                System.out.println(".............." +
                                respostaCombutivel +
                                "..............");
                scooter.buzinar();
                scooter.desligar();

                System.out.println(".............." +
                                "A moto 2" +
                                "..............");

                moto kavasaki = new moto();
                kavasaki.velocidadeMaxima = 150;
                kavasaki.velocidadeAtual = 10;

                System.out.println(kavasaki.velocidadeAtual);
                System.out.println(".............." +
                                "A moto entrou em movimento, quanto deseja acelerar?" +
                                "..............");
                velocidade = sc.nextDouble();
                kavasaki.acelerar(velocidade);

                System.out.println(".............." +
                                "O tanque está baixo, você parou num posto de gasolina, o que deseja colocar? (Gasolina/Alcool)"
                                +
                                "..............");
                tipoCombustivel = sc.next();

                verificaGasolina = tipoCombustivel.equals(gasolina);
                verificaAlcool = tipoCombustivel.equals(alcool);
                respostaCombutivel = (verificaGasolina == true || verificaAlcool == true) ? "Ok"
                                : "Combustivel invalido";

                System.out.println(".............." +
                                respostaCombutivel +
                                "..............");

                kavasaki.buzinar();
                kavasaki.desligar();

                System.out.println(".............." +
                                "A moto 3" +
                                "..............");

                moto harly = new moto();
                harly.velocidadeMaxima = 150;
                harly.velocidadeAtual = 10;

                System.out.println(harly.velocidadeAtual);
                System.out.println(".............." +
                                "A moto entrou em movimento, quanto deseja acelerar?" +
                                "..............");
                velocidade = sc.nextDouble();
                harly.acelerar(velocidade);

                System.out.println(".............." +
                                "O tanque está baixo, você parou num posto de gasolina, o que deseja colocar? (Gasolina/Alcool)"
                                +
                                "..............");
                tipoCombustivel = sc.next();

                verificaGasolina = tipoCombustivel.equals(gasolina);
                verificaAlcool = tipoCombustivel.equals(alcool);
                respostaCombutivel = (verificaGasolina == true || verificaAlcool == true) ? "Ok"
                                : "Combustivel invalido";

                System.out.println(".............." +
                                respostaCombutivel +
                                "..............");

                harly.buzinar();
                harly.desligar();

                sc.close();
        }
}