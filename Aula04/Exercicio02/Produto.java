package Aula04.Exercicio02;

public class Produto {
    private String nomeProduto;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nomeProduto, double preco, int quantidadeEstoque) {
        setNomeProduto(nomeProduto);
        setPreco(preco);
        setQuantidadeEstoque(quantidadeEstoque);
    }

    public double precoTotalProduto(int quantidade){
        double precoTotal = getPreco() * quantidade;
        return precoTotal;
    }

    public void informacoesProduto() {
        System.out.println("================\n"+
                    "Produto: " + getNomeProduto() + " \n" +
                    "Quantidade: " + getQuantidadeEstoque() + " \n" +
                    "Preço Bruto no Estoque: " + precoTotalProduto(quantidadeEstoque) + " \n" +
                    "Preço Unitário: " + getPreco() +
                    "\n================\n"
        );
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        if(preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço inválido. Digite um preço valido");
        }
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if(quantidadeEstoque > 0) {
            this.quantidadeEstoque = quantidadeEstoque;
        } else {
            System.out.println("Não este produto no estoque");
        }
    }
}