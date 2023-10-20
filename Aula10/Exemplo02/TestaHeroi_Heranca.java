package Aula10.Exemplo02;

public class TestaHeroi_Heranca {
    public static void main(String[] args) {
        Flash_Heranca flash = new FlashComHeranca("Flash", 19, "Ele tem o superpoder de velocidade");
        Flash_Heranca flashReverso = new SpeedsterComHeranca("Flash Reverso", 18,
                "Ele tem o superpoder de velocidade invertida");

        flash.heroi();
        System.out.println("\n\tFlash, o super-herói da velocidade: ");
        flash.runFast();
        flash.savePeople();
        flash.usePower();

        flashReverso.heroi();
        System.out.println("\n\tFlash Reverso, o super-herói da velocidade: ");
        flashReverso.runFast();
        flashReverso.savePeople();
        flashReverso.usePower();
    }
}
