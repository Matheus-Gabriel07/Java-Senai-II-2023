package Aula03.Exemplo01;

public class moto {
    int cilindradas;
    String combustivel;
    boolean ligada;
    double velocidadeMaxima;
    double velocidadeAtualizada;
    double velocidadeAtual;

    void ligar() {
        ligada = true;
        System.out.println("A moto está ligada");
    }
    
    void desligar() {
        ligada = false;
        System.out.println("A moto está desligada");
    }

    void buzinar() {
        System.out.println("Bi bi");
    }

    void parar() {
        velocidadeAtual = 0;
        System.out.println("A moto parou");
    }

    int acelerar(double quantidade) {
        velocidadeAtualizada = velocidadeAtual + quantidade;
        velocidadeAtual = velocidadeAtualizada;

        if(velocidadeAtual > velocidadeMaxima) {
            System.out.println("A moto está acima da velocidade maxima");
            System.out.println("Você morreu");
            System.exit(0);;
            return 0;
        } else {
            System.out.println("Sua velocidade atual é " + velocidadeAtual);
            return 1;
        }
    }
}