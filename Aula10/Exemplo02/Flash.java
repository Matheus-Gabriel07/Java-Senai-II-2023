package Aula10.Exemplo02;

//Interface Super Herói

interface SuperHero {
    void runFast();
    void savePeople();
    void usePower();
}

class Flash implements SuperHero {

    @Override
    public void runFast() {
        System.out.println("Flash está correndo em velocidade máxima.");
    }

    @Override
    public void savePeople() {
        System.out.println("Flash está salvando as pessoas em perigo.");
    }

    @Override
    public void usePower() {
        System.out.println("Flash está usando seu superpoder de velocidade.");
    }
}

class Speedster implements SuperHero {
    
    @Override
    public void runFast() {
        System.out.println("O Speedster está correndo muito rápido.");
    }

    @Override
    public void savePeople() {
        System.out.println("O Speedster está salvando vidas com sua velocidade.");
    }

    @Override
    public void usePower() {
        System.out.println("O Speedster está usando a super velocidade.");
    }
}