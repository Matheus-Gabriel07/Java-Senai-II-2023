package Exemplo01;
public class Principal {
    public static void main(String[] args) {
        Pessoa newPessoa = new Pessoa("Rafael", 123456789);
        System.out.println(newPessoa.getNome() + "\n"
                + newPessoa.getCpf() + "\n");

        Aluno newAluno = new Aluno("Matheus", 987654321, 1234);
        System.out.println(newAluno.getNome() + "\n"
                + newAluno.getCpf() + "\n"
                + newAluno.getMatricula());

        Formando newFormando = new Formando("Matheus", 987654321, 1234, 2023);
        System.out.println(newFormando.getNome() + "\n"
                + newFormando.getCpf() + "\n"
                + newFormando.getMatricula() + "\n" 
                + newFormando.getAno());
    }
}
