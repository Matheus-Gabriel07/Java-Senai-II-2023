package Aula10.Exemplo01;

public class Pocoes {
    public static void main(String[] args) {
        LovePotion lovePotion = new LovePotion();
        InvisiblityPotion invisiblityPotion = new InvisiblityPotion();
        StrengthPotion strengthPotion = new StrengthPotion();
        GlidingPotion glidingPotion = new GlidingPotion();

        System.out.println("\t**Preparando as poções**\n\n"
                + "**Preparando a poção do amor**");
        lovePotion.mix();
        lovePotion.heat();
        lovePotion.drink();

        System.out.println("\n**Preparando a poção de invisibilidade");
        invisiblityPotion.mix();
        invisiblityPotion.heat();
        invisiblityPotion.drink();

        System.out.println("\n**Preparando a poção de força");
        strengthPotion.mix();
        strengthPotion.heat();
        strengthPotion.drink();

        System.out.println("\n**Preparando a poção para planar");
        glidingPotion.mix();
        glidingPotion.heat();
        glidingPotion.drink();
    }
}
