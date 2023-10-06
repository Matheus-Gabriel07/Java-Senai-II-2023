package Exemplo01;
public class Formando extends Aluno {
    private int ano;

    Formando(String nome, int cpf, int matricula, int ano){
        super(nome, cpf, matricula);
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
