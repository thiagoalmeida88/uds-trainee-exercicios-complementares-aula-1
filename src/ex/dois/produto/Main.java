package ex.dois.produto;

public class Main {
    public static void main(String[] args){

        Produto primeiroProduto = new Produto("Faca", 10.00);
        Produto segundoProduto = new Produto("Naifa", 10.50);
        Produto terceiroProduto = new Produto("Zinca", 60.50);
        Produto quartoProduto = new Produto("Espada", 100.00);
        Produto quintoProduto = new Produto("Foice", 140.00);

        Pedido pedido = new Pedido();

        pedido.adicionarProduto(primeiroProduto);
        pedido.adicionarProduto(segundoProduto);
        pedido.adicionarProduto(terceiroProduto);
        pedido.adicionarProduto(quartoProduto);
        pedido.adicionarProduto(quintoProduto);

        pedido.exibirProdutos();
        System.out.println("-------------------");
        System.out.println("Valor total: "+pedido.calcularTotal());

    }
}
