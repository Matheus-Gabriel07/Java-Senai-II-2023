package Exemplo02;

public class Batalha {
    public static void main(String[] args) {
        Vingadores Kaique = new Vingadores("Kaique", "tiozão", 1.32, 99999, "beber", true);
        Vilao Rafael = new Vilao("Rafael", "Steve", 1.60, 120, "Construir", false);

        Kaique.atirar();
        Rafael.atirar();
    }
}
