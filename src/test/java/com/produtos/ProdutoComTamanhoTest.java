package com.produtos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProdutoComTamanhoTest {
    private ProdutoComTamanho produto1;
    private ProdutoComTamanho produto2;
    private ProdutoComTamanho produto3;

    @BeforeEach
    public void setUp(){
        produto1 = new ProdutoComTamanho("Camiseta", "101", 20.0, "G");
        produto2 = new ProdutoComTamanho("Camiseta", "101", 30.0, "G");
        produto3 = new ProdutoComTamanho("Calça", "333", 25.0, "M");
    }

    @Test
    public void testeComTamanhoEquals(){
        Assertions.assertEquals(produto1, produto2);
        Assertions.assertNotEquals(produto3, produto1);
    }

    @Test
    public void testeComTamanhoHash(){
        Assertions.assertEquals(produto1.hashCode(), produto2.hashCode());
        Assertions.assertNotEquals(produto3, produto1);
    }
}