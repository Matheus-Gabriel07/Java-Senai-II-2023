package Aula10.Exemplo01;

// Interface  Poção

interface Potion {
    void mix(); //Método para misturar as poções
    void heat(); //Método para aquecer as poções
    void drink(); //Método para beber as poções
}

class LovePotion implements Potion {

    @Override //Polimorfismo
    public void mix() {
        System.out.println("Misturando os ingredientes da Poção do Amor");
    }

    @Override
    public void heat() {
        System.out.println("");
    }

    @Override
    public void drink() {
        System.out.println("");
    }
} 