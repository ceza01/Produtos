package com.produtos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProdutoTest {
    private Produto produto1;
    private Produto produto2;
    private Produto produto3;

    @BeforeEach
    public void setUp(){
        produto1 = new Produto("Camiseta", "101", 20.0);
        produto2 = new Produto("Camiseta", "101", 30.0);
        produto3 = new Produto("Calça", "333", 25.0);
    }

    @Test
    public void testeProdutosEquals() {
        Assertions.assertEquals(produto1, produto2);
        Assertions.assertNotEquals(produto1, produto3);
    }

    @Test
    public void testeProdutosHash(){
        Assertions.assertEquals(produto1.hashCode(), produto2.hashCode());
        Assertions.assertNotEquals(produto1.hashCode(), produto3.hashCode());
    }
}