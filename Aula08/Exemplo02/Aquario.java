package Aula08.Exemplo02;

public class Aquario {
    public static void main(String[] args) {
        System.out.println(Tartaruga.aquario());
        Tartaruga donatello = new Tartaruga(15);
        System.out.println(donatello.getIdade());
    }
}
