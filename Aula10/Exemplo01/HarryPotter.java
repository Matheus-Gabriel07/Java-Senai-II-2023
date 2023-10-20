package Aula10.Exemplo01;

// Interface  Poção

interface Potion {
    void mix(); //Método para misturar as poções
    void heat(); //Método para aquecer as poções
    void drink(); //Método para beber as poções
}

//Palavra chave -> implements

class LovePotion implements Potion {

    @Override //Polimorfismo
    public void mix() {
        System.out.println("Misturando os ingredientes da Poção do Amor");
    }

    @Override
    public void heat() {
        System.out.println("Aquecendo os ingredientes da poção no calderão");
    }

    @Override
    public void drink() {
        System.out.println("A pessoa que bebeu a poção se apaixona profundamente");
    }
} 

// Poção de invisibilidade
class InvisiblityPotion implements Potion {
    
    @Override
    public void mix(){
        System.out.println("Misturado os ingredientes da Poção de Invisibilidade");
    }

    @Override
    public void heat(){
        System.out.println("Aquecendo os ingredientes da poção no calderão");
    }

    @Override
    public void drink(){
        System.out.println("A pessoa que bebeu a poção, fica invisivel");
    }
}

//Poção de força 
class StrengthPotion implements Potion {

    @Override
    public void mix(){
        System.out.println("Misturado os ingredientes da Poção de força");
    }

    @Override
    public void heat(){
        System.out.println("Aquecendo os ingredientes da poção no calderão");
    }

    @Override
    public void drink(){
        System.out.println("A pessoa que bebeu a poção, fica mais forte");
    }
}

// Poção de planar
class GlidingPotion implements Potion {

    @Override
    public void mix(){
        System.out.println("Misturado os ingredientes da Poção para planar");
    }

    @Override
    public void heat(){
        System.out.println("Aquecendo os ingredientes da poção no calderão");
    }

    @Override
    public void drink(){
        System.out.println("A pessoa que bebeu a poção, consegue planar sobre o céu");
    }
}