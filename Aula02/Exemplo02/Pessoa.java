package Aula02.Exemplo02;

public class Pessoa {
    String nome;
    int idade;
    String profissao;

    // Método Construtor
    public Pessoa(String nome, int idade, String profissao){
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

    public void exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade:" + idade);
        System.out.println("Profissão: " + profissao);
    }
}
