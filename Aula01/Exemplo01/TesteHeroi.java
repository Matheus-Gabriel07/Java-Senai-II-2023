package Aula01.Exemplo01;

public class TesteHeroi {

    public static void main(String[] args) {
        // Criação dos heróis
        heroi HomemDeFerro = new heroi();
        HomemDeFerro.nomeHeroi = "Tony Stark";
        HomemDeFerro.altura = 1.85;
        HomemDeFerro.armadura = "MK-1";
        HomemDeFerro.idade = 35;
        HomemDeFerro.peso = 92.2;
        HomemDeFerro.poder = "Voar";
        HomemDeFerro.sexo = 'M';

        heroi HomemAranha = new heroi();
        HomemAranha.nomeHeroi = "Peter Parker";
        HomemAranha.altura = 1.77;
        HomemAranha.armadura = "Iron Spider";
        HomemAranha.idade = 18;
        HomemAranha.peso = 70.3;
        HomemAranha.poder = "Lançar teias";
        HomemAranha.sexo = 'M';

        HomemDeFerro.correr();
        HomemDeFerro.falar();
        System.out.println(HomemAranha.nomeHeroi + ", é o nome do Homem Aranha");
        System.out.println(HomemDeFerro.armadura);

    }
}
