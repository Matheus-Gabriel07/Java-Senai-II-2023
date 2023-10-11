package Aula08.Exercicio01;

public class TestaVeiculo {
    public static void main(String[] args) {
        System.out.println(Veiculo.marca);
        System.out.println(Veiculo.modelo);

        Veiculo carro = new Veiculo(100, 20.3);
        System.out.println(carro.numChassi);
        System.out.println(carro.combustivel);
    }
}
