package com.produtos;

public class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Calça", "101", 30.50);
        ProdutoComTamanho produto2 = new ProdutoComTamanho("Camiseta", "102", 20.99, "P");
        ProdutoComTamanho produto3 = new ProdutoComTamanho("Camiseta", "102", 20.99, "P");
        ProdutoComTamanho produto4 = new ProdutoComTamanho("Jaqueta", "103", 50.49, "G");

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionaProduto(produto1, 1);
        carrinho.adicionaProduto(produto2, 1);
        carrinho.adicionaProduto(produto3, 1);
        carrinho.adicionaProduto(produto4, 1);
        carrinho.removeProduto(produto2, 1);
        carrinho.removeProduto(produto4, 1);

        System.out.println(carrinho.calcularTotal());
    }
}
