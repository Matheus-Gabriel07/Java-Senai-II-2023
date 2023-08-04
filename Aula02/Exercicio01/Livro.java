package Aula02.Exercicio01;

public class Livro {
    String titulo;
    String autor;
    int paginas;
    int anoPublicado;

    public Livro(String titulo, String autor, int paginas, int anoPublicado) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.anoPublicado = anoPublicado;
    }

    public void exibir() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Paginas: " + paginas);
        System.out.println("Ano de Publicação: " + anoPublicado);
    }

    public void verfificar(){
        if (anoPublicado <= 2000){
            System.out.println("Muito antigo este livro");
        } else {
            System.out.println("Tá novnho");
        }
    }
}
