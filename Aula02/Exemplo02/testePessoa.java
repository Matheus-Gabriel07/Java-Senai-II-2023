package Aula02.Exemplo02;

public class testePessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Kaique", 17, "AA");
        Pessoa pessoa2 = new Pessoa("Rafael", 20, "Estudante");
        Pessoa pessoa3 = new Pessoa("Lolo", 23, "AA");
        Pessoa pessoa4 = new Pessoa("Ted Mosby", 20, "Estudante");

        pessoa1.exibir();
        pessoa2.exibir();
        pessoa3.exibir();
        pessoa4.exibir();

    }
}
