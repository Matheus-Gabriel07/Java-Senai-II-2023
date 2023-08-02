package Aula01.Lista.Exercicio01;

public class moto {
    boolean ligado;
    double combustivel;
    double cilindradas;
    double velocidadeAtual;
    double velocidadeMax;

    void ligar() {
        ligado = true;
        System.out.println("A moto está ligada");
    }

    void desligar() {
        ligado = false;
        System.out.println("A moto está desligada");
    }

    void bozinar() {
        System.out.println("Bi Bi!");
    }

    void parar() {
        System.out.println("Está aguardando o semafóro abrir");
    }

    int acelerar(double quantidade) {
        double novaVelocidade = velocidadeAtual + quantidade;
        velocidadeAtual = novaVelocidade;

        if (novaVelocidade >= velocidadeMax ) {
            return -1;
        } else {
            return 0;
        }
    }
}
