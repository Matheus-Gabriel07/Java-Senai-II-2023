package Aula09.Exemplo01;

//Subclasse de Figura
public class Quadrado extends Figura {
    double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    // Declarando o calculo de área do quadrado
    // Sobreposição do método da Classe Base
    public double calcularArea(){
        return lado * lado;
    }
}
