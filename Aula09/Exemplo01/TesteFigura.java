package Aula09.Exemplo01;

public class TesteFigura {
    public static void main(String[] args) {
        Figura newQuadrado = new Quadrado(2);
        Figura newCirculo = new Circulo(2);
        Figura newTriangulo = new Triangulo(3, 5);

        //Polimorfismo
        System.out.println("\tPOLIMORFISMO"
            + "\nÁrea do quadrado: " + newQuadrado.calcularArea() + " cm²"
            + "\nÁrea do circulo: " + newCirculo.calcularArea() + " cm²"
            + "\nÁrea do triângulo: " + newTriangulo.calcularArea() + " cm²");       
    }
}
