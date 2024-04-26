package com.produtos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CarrinhoDeComprasTest {

    private CarrinhoDeCompras carrinho;
    private Produto produto1;
    private Produto produto2;

    @BeforeEach
    public void setUp(){
        carrinho = new CarrinhoDeCompras();
        produto1 = new Produto("Camiseta", "101", 20.99);
        produto2 = new Produto("Calça", "104", 30.50);
    }

    @Test
    public void testeAdicionaProduto(){
        carrinho.adicionaProduto(produto1, 2);
        carrinho.adicionaProduto(produto2, 1);

        Assertions.assertEquals(2,carrinho.getItens().get(produto1));
        Assertions.assertEquals(1,carrinho.getItens().get(produto2));
    }

    @Test
    public void testeRemoveProduto(){
        carrinho.adicionaProduto(produto1, 3);
        carrinho.adicionaProduto(produto2, 4);

        carrinho.removeProduto(produto1, 2);
        carrinho.removeProduto(produto2, 2);

        Assertions.assertEquals(1,carrinho.getItens().get(produto1));
        Assertions.assertEquals(2,carrinho.getItens().get(produto2));
    }

    @Test
    public void testeCalculaTotal(){
        carrinho.adicionaProduto(produto1, 2);
        carrinho.adicionaProduto(produto2, 1);

        Assertions.assertEquals(72.48, carrinho.calcularTotal(), 0.02);
    }

    @Test
    public void testCalcularTotalSemProdutos() {
        carrinho.adicionaProduto(produto1, 2);
        carrinho.removeProduto(produto1, 2);

        Assertions.assertEquals(0, carrinho.calcularTotal());
    }

}