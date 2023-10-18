package Aula09.Exemplo01;

public class Circulo extends Figura {
    double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    public double calcularArea() {
        return (Math.PI * Math.pow(raio, 2));
    }
}
