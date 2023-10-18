package Aula09.Exercicios;

abstract class Veiculo {
    String modelo;
    double velocidade;

    public Veiculo(String modelo, double velocidade) {
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    public abstract double calcularVelocidadeMaxima();

    public abstract void imprimirDescricao();
}

class Carro extends Veiculo {
    String cor;
    double potencia;

    public Carro(String modelo, double velocidade, String cor, double potencia) {
        super(modelo, velocidade);
        this.cor = cor;
        this.potencia = potencia;
    }

    @Override
    public double calcularVelocidadeMaxima() {
        double velocidadeMaxma = (potencia/ 100) * velocidade;
        return velocidadeMaxma;
    }

    @Override
    public void imprimirDescricao() {
        System.out.println("== Carro ==" +
                "\nModelo: " + modelo +
                "\nCor: " + cor +
                "\nVelocidade Atual: " + velocidade +
                "\nVelociade máxima: " + calcularVelocidadeMaxima());
    }
}

class Bicicleta extends Veiculo {
    int marcha;

    public Bicicleta(String modelo, double velocidade, int marcha) {
        super(modelo, velocidade);
        this.marcha = marcha;
    }

    @Override
    public double calcularVelocidadeMaxima() {
        double velocidadeMaxima = (velocidade * marcha);
        return velocidadeMaxima;
    }

    @Override
    public void imprimirDescricao() {
        System.out.println("== Bicicleta ==" +
                "\nModelo: " + modelo +
                "\nMarcha atual: " + marcha +
                "\nVelocidade Atual: " + velocidade +
                "\nVelociade máxima: " + calcularVelocidadeMaxima());
    }
}