package Aula01.Exemplo02;

import java.util.*;

public class testeCarro {
    public static void main(String[] args) {
        carro fiat = new carro(); // Criando um objeto

        // Chamando os métodos
        fiat.ligar();
        fiat.bozinar();
        fiat.desligar();

        fiat.velocidadeMax = 140;

        Scanner sc = new Scanner(System.in);
        System.out.println("Quanto você quer acelerar?");
        double valor = sc.nextDouble();
        int teste = fiat.acelerar(valor);
        System.out.println("A velociadade atual é: " + fiat.velocidadeAtual + "km/h");

        if (teste == -1) {
            System.out.println("A velocidade é igual ou superior a velocidade máxima");
        }

        // Definindo as marchas do carro;

        if (fiat.velocidadeAtual == 0) {
            System.out.println("O carro está parado");
        } else if (fiat.velocidadeAtual > 0 && fiat.velocidadeAtual <= 25) {
            System.out.println("O carro está na 1º Marcha");
        } else if (fiat.velocidadeAtual > 25 && fiat.velocidadeAtual <= 40) {
            System.out.println("O carro está na 2º Marcha");
        } else if (fiat.velocidadeAtual > 40 && fiat.velocidadeAtual <= 60) {
            System.out.println("O carro está na 3º Marcha");
        } else if (fiat.velocidadeAtual > 60 && fiat.velocidadeAtual <= 80) {
            System.out.println("O carro está na 4º Marcha");
        } else if (fiat.velocidadeAtual >= 80) {
            System.out.println("O carro está na 5º Marcha");
        }

        sc.close();
    }
}