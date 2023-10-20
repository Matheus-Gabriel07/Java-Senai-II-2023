package Aula10.Exemplo02;

public class TestaHeroi {
    public static void main(String[] args) {
        Flash flash = new Flash();
        Speedster flashReverso = new Speedster();
        
        System.out.println("\tFlash, o super-herói da velocidade: ");
        flash.runFast();
        flash.savePeople();
        flash.usePower();

        System.out.println("\n\tFlash Reverso, o super-herói da velocidade: ");
        flashReverso.runFast();
        flashReverso.savePeople();
        flashReverso.usePower();
    }
}