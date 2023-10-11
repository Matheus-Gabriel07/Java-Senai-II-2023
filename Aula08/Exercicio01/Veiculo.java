package Aula08.Exercicio01;

public class Veiculo {
    public static String marca = "Pégaso";
    public static String modelo = "Mercúrio";
    public int numChassi;
    public double combustivel;

    public Veiculo(int numChassi, double combustivel){
        this.numChassi = numChassi;
        this.combustivel = combustivel;
    }

    public static String getMarca() {
        return marca;
    }

    public static String getModelo() {
        return modelo;
    }
}
