package Aula08.Exemplo01;

public class Tartaruga {
    public final static String comida = "Comida  de  Tartaruga";
    private int idade;

    public Tartaruga(int idade) {
        if(idade > 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida.");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}