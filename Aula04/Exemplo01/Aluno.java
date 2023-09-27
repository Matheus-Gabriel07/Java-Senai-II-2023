/**
 * @author Matheus Gabriel
 * @since 1.0
 */

package Aula04.Exemplo01;

public class Aluno {
    private String nome;
    private int idade;
    private double nota;

    public Aluno(String nome, int idade, double nota){
        setNome(nome);
        setIdade(idade);
        setNota(nota);
    }

    //GET / SET --> Métodos publicos que manipulam os atributos privados
    //Atributo nome
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Atributo idade
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade > 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida\n");
        }
    }

    //Atributo nota
    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if(nota >= 0 && nota <= 10) {
            this.nota = nota;
        } else {
            System.out.println("Nota inválida");
        }
    }
}