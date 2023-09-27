package Aula04.Exemplo01;

public class testaAluno {
    public static void main(String[] args) {
        Aluno newAluno = new Aluno("Matheus", 16, 9.8);
        System.out.println(newAluno.getNome() + " \n" +
                newAluno.getIdade() + " \n" +
                newAluno.getNota());
    }
}
