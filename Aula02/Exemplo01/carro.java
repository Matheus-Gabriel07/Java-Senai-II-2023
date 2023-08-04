package Aula02.Exemplo01;

public class carro {
    String modelo;
    int anoFabricacao;
    String cor;

    // Método Contrutor
    public carro(String modelo, int anoFabricacao, String cor) {
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
    }

    // Métodos para exibir as informações do carro
    public void exibir() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de fabricação: " + anoFabricacao);
        System.out.println("Cor: " + cor);
    }
}