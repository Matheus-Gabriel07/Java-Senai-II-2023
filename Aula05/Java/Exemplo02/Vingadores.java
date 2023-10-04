package Exemplo02;

public class Vingadores {
    String armadura;
    String nome;
    double altura;
    int idade;
    String habilidade;
    boolean extraterrestre;

    public Vingadores(String nome, String armadura, double altura, int idade, String habilidade,
            boolean extraterrestre) {
        this.nome = nome;
        this.armadura = armadura;
        this.altura = altura;
        this.idade = idade;
        this.habilidade = habilidade;
        this.extraterrestre = extraterrestre;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArmadura() {
        return armadura;
    }

    public void setArmadura(String armadura) {
        this.armadura = armadura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    public boolean getExtraterrestre() {
        return extraterrestre;
    }

    public void setExtraterrestre(boolean extraterrestre) {
        this.extraterrestre = extraterrestre;
    }

    public void atirar() {
        System.out.println("Água");
    }
}