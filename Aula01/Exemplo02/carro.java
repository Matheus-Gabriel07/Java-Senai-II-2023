package Aula01.Exemplo02;

public class carro {
    // Declaração dos atributos
    boolean ligado;
    double velocidadeAtual;
    double velocidadeMax;
    double velocidadeAtualizada;

    // Declaração dos métodos
    void ligar() {
        ligado = true;
        System.out.println("O carro está ligado");
    }

    void desligar() {
        ligado = false;
        System.out.println("O carro está desligado");
    }

    void bozinar() {
        System.out.println("Bi Bi!");
    }

    // Método de aceleração do carro
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