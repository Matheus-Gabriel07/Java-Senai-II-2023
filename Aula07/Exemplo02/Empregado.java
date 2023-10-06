package Aula07.Exemplo02;

public class Empregado {
    private String nome = "Willian";
    private String cargo;
    private int tempoDeCasa;
    private static String empresaInstituicao = "SENAI";

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

    public String getEmpresaInstituicao() {
        return empresaInstituicao;
    }

    public void setEmpresaInstituicao(String empresaInstituicao) {
        Empregado.empresaInstituicao = empresaInstituicao;
    }
}
