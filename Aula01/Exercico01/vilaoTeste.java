package Aula01.Exercico01;

public class vilaoTeste {
    public static void main(String[] args) {
        vilao vespertino = new vilao();
        vespertino.nomeVilao = "Adam Lima";
        vespertino.altura = 1.92;
        vespertino.forcaPoder = 10.5;
        vespertino.idade = 34;
        vespertino.item = "Cartas com face do Sol e Lua";
        vespertino.poder = "Controlar as emoções das pessoas";

        vilao adagua = new vilao();
        adagua.nomeVilao = "Ghost Endo";
        adagua.altura = 1.75;
        adagua.forcaPoder = 42.3;
        adagua.idade = 24;
        adagua.item = "Katana";
        adagua.poder = "Fazer as pessoas se transformarem em pó";

        System.out.println(adagua.nomeVilao + ", chegou no pedaço");
        adagua.pegadinha();
        adagua.lutar();

        System.out.println("\n" + vespertino.poder + ", é o Vespertino! Ele está na área!");
        vespertino.entrar();
        vespertino.pegadinha();
    }
}
