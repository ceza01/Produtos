package com.produtos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProdutoTest {

    @Test
    public void testeEqualsHashCode() {
        Produto produto1 = new Produto("Camiseta", "101", 20.0);
        Produto produto2 = new Produto("Camiseta", "101", 30.0);
        Produto produto3 = new Produto("Calça", "333", 25.0);

        Assertions.assertEquals(produto1, produto2);
        Assertions.assertNotEquals(produto1, produto3);

        Assertions.assertEquals(produto1.hashCode(), produto2.hashCode());
        Assertions.assertNotEquals(produto1.hashCode(), produto3.hashCode());
    }
}