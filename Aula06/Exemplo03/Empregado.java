package Exemplo03;

public class Empregado {
    private String nome;
    private String cargo;
    private int tempoDeCasa;

    public Empregado(String nome, String cargo, int tempoDeCasa) {
        this.nome = nome;
        this.cargo= cargo;
        this.tempoDeCasa = tempoDeCasa;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public int getTempoDeCasa() {
        return tempoDeCasa;
    }
}
