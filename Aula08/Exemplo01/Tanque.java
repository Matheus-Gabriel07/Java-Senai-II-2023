package Aula08.Exemplo01;

public class Tanque {
    public static void main(String[] args) {
        Tartaruga donatello = new Tartaruga(14);
        Tartaruga miquelangelo = new Tartaruga(15);
        Tartaruga leonardo = new Tartaruga(16);
        Tartaruga rafael = new Tartaruga(17);

        System.out.println("Donatello: " + donatello.getIdade());
        System.out.println("Miquelange: " + miquelangelo.getIdade());
        System.out.println("Leonardo: " + leonardo.getIdade());
        System.out.println("Rafael: " + rafael.getIdade());

        System.out.println("Comida do Donatello: " + donatello.comida);
        donatello.setIdade(18);
        System.out.println("Idade do miquelangelo: " + miquelangelo.getIdade());
        //donatello.comida = "pizza";
        System.out.println("Comida do miquelangelo: " + miquelangelo.comida);
        System.out.println("A comida das tartarugas é: " + Tartaruga.comida);

        System.out.println(Math.PI);
    }
}
