package Aula02.Exercicio01;

public class testeLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Jogador Nº1", "Ernest Cline", 450, 2011);
        Livro livro2 = new Livro("O pequeno principe", "Antoine de Saint", 150, 1943);
        Livro livro3 = new Livro("Harry Potter", "J. K. Rowling", 260, 2000);
        Livro livro4 = new Livro("Chronos: Viajantes do Tempo", "Rysa Walker", 320, 2017);

        livro1.exibir();
        livro1.verfificar();
        System.out.println("");

        livro2.exibir();
        livro2.verfificar();
        System.out.println("");

        livro3.exibir();
        livro3.verfificar();
        System.out.println("");

        livro4.exibir();
        livro4.verfificar();
        System.out.println("");

    }
}
