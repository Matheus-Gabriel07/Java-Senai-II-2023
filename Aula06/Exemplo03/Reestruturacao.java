package Exemplo03;

public class Reestruturacao {
    public static void main(String[] args) {
        Empregado promovido;
        Empregado e1 = new Empregado("Kaique", "Estágiario", 3);
        Empregado e2 = new Empregado("Rafael", "Chefe", 2);
        Empregado e3 = new Empregado("Willian", "Diretor", 4);
        Empregado e4 = new Empregado("Heloisa", "Engenheira", 5);
        Promocao promocao = new Promocao();
        promovido = promocao.promocao(e1, e2, e3, e4);

        System.out.println("O colaborador " + promovido.getNome() + " foi promovido");
    }
}
