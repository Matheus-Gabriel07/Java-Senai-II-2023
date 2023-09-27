package Aula04.Exercicio02;

public class testaProduto {
    public static void main(String[] args) {
        Produto newProduto1 = new Produto("Bala", 0.50, 150);
        Produto newProduto2 = new Produto("Pirulito", 1, 50);
        Produto newProduto3 = new Produto("Chiclete", 1.50, 250);

        newProduto1.informacoesProduto();
        newProduto2.informacoesProduto();
        newProduto3.informacoesProduto();
    }
}