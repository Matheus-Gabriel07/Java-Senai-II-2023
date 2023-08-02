package Aula01.Lista.Exercicio02;

public class testeCachorro {
    public static void main(String[] args) {
        cachorro floquinho = new cachorro();
        floquinho.nome = "floquinho";
        floquinho.tamanho = 16;

        cachorro subasca = new cachorro();
        subasca.nome = "subasca";
        subasca.tamanho = 10;

        cachorro portePont = new cachorro();
        portePont.nome = "porte Pont";
        portePont.tamanho = 90;

        System.out.println(subasca.nome + " late assim, ");
        subasca.latir();
        System.out.println("\n");

        System.out.println(floquinho.nome + " late assim, ");
        floquinho.latir();
        System.out.println("\n");

        System.out.println(portePont.nome + " late assim, ");
        portePont.latir();
        System.out.println("\n");

    }
}
