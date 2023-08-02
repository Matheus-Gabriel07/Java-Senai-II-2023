package Aula01.Lista.Exercicio02;

public class cachorro {
    String nome;
    double tamanho;

    void latir() {
        if (tamanho >= 14) {
            System.out.println("Ruff!, Ruff");
        }
        if (tamanho >= 60) {
            System.out.println("Woof, Woof");
        }
        if (tamanho < 14) {
            System.out.println("Yip!, Yip");
        }
    }
}
