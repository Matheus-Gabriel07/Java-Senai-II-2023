package Aula01;

/**
 * Criação da Classe (Modelo)
 */

public class heroi {
    //Criação dos Atributos (Características dos Objetos/Propriedades)

    String nomeHeroi;
    int idade;
    char sexo;
    String poder;
    String armadura;
    double altura;
    double peso;

    /**
     *  Métodos: Ações dos objetos
     *      - Void não tem retorno númerico
     */

    void voar() {
        System.out.println("O herói está voando");
    }

    void lutar() {
        System.out.println("O herói está lutando");
    }

    void falar() {
        System.out.println("O herói está falando");
    }

    void correr() {
        System.out.println("O herói está correndo");
    }
}