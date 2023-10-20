package Aula10.Exemplo02;

public class Flash_Heranca {
    String nome;
    int idade;
    String descricao;

    public Flash_Heranca(String nome, int idade, String descricao) {
        this.nome = nome;
        this.idade = idade;
        this.descricao = descricao;
    }

    public void runFast() {
    }

    public void savePeople() {
    }

    public void usePower() {
    }

    public void heroi() {
        System.out.println("\nNome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Descrição:" + descricao);
    }
}

class FlashComHeranca extends Flash_Heranca {
    public FlashComHeranca(String nome, int idade, String descricao) {
        super(nome, idade, descricao);
    }

    @Override
    public void runFast() {
        System.out.println("Flash está correndo em velocidade máxima.");
    }

    @Override
    public void savePeople() {
        System.out.println("Flash está salvando as pessoas em perigo.");
    }

    @Override
    public void usePower() {
        System.out.println("Flash está usando seu superpoder de velocidade.");
    }
}

class SpeedsterComHeranca extends Flash_Heranca {
    public SpeedsterComHeranca(String nome, int idade, String descricao) {
        super(nome, idade, descricao);
    }

    @Override
    public void runFast() {
        System.out.println("O Speedster está correndo muito rápido.");
    }

    @Override
    public void savePeople() {
        System.out.println("O Speedster está salvando vidas com sua velocidade.");
    }

    @Override
    public void usePower() {
        System.out.println("O Speedster está usando a super velocidade.");
    }
}