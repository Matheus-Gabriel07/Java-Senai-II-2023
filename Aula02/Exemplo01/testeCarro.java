package Aula02.Exemplo01;

public class testeCarro {
    public static void main(String[] args) {
        carro carro1 = new carro("Tesla", 2001, "Branco");
        carro carro2 =  new carro("X6", 2023, "#212b53");
        carro1.exibir();
        carro2.exibir();
    }
}
