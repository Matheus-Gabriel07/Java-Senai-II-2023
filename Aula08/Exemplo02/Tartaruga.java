package Aula08.Exemplo02;

public class Tartaruga {
    private int idade;

    public int numeroDoTanque;
    public static int numeroDeTanques = 3;
    public static String comida = "Pizza";

    public Tartaruga(int idade) {
        if(idade > 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida.");
        }
        numeroDoTanque = (int) ((Math.random() * numeroDeTanques) + 1);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static String aquario(){
        return "Eu tenho " + numeroDeTanques + " tanques";
    }
}