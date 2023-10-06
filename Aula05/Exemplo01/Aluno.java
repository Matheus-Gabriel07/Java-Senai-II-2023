package Exemplo01;
//Sub-classe de Pessoa

public class Aluno extends Pessoa {
    int matricula;

    public Aluno(String nome, int cpf, int matricula){
        super(nome, cpf);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}