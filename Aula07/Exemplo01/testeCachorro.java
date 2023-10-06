package Aula07.Exemplo01;
public class testeCachorro {
    public static void main(String[] args) {
        Cachorro au1 = new Cachorro();
        System.out.println(au1.getPeso() + "\n" +
                au1.getIdade() + "\n" +
                au1.getLatido() + "\n");

        Cachorro au2 = new Cachorro(7.6, 6);
        System.out.println(au2.getPeso() + "\n" +
                au2.getIdade() + "\n" +
                au2.getLatido() + "\n");

        Cachorro au3 = new Cachorro(8, 3, "Holf!");
        System.out.println(au3.getPeso() + "\n" +
                au3.getIdade() + "\n" +
                au3.getLatido() + "\n");
    }
}
