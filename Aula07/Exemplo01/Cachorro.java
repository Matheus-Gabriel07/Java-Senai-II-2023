package Aula07.Exemplo01;

public class Cachorro {
    private double peso;
    private int idade;
    private String latido;

    // @Override
    public Cachorro() {
        peso = 6;
        idade = 4;
        latido = "AU!";
    }

    public Cachorro(double peso,int idade) {
        this.peso = peso;
        this.idade = idade;
        latido = "Norf!";
    }

    public Cachorro(double peso,int idade, String latido) {
        this.peso = peso;
        this.idade = idade;
        this.latido = latido;
    }

    public double getPeso() {
        return peso;
    }

    public int getIdade() {
        return idade;
    }

    public String getLatido() {
        return latido;
    }
}
