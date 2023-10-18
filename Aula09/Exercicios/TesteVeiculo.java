package Aula09.Exercicios;

public class TesteVeiculo {
    public static void main(String[] args) {
        Veiculo carro = new Carro("Ford", 100, "Vermelho", 484);
        carro.imprimirDescricao();

        System.out.println();
        Veiculo bicicleta = new Bicicleta("Cicloy", 15.2, 2);
        bicicleta.imprimirDescricao();

        //Método de calcular máximo já inserido no imprimirDescrição()
    }
}
