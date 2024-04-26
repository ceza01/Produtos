package com.produtos;

import java.util.Objects;

public class ProdutoComTamanho extends Produto {
    private String tamanho;
    public ProdutoComTamanho(String nome, String codigo, double preco, String tamanho) {
        super(nome, codigo, preco);
        this.tamanho = tamanho;
    }
    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProdutoComTamanho prodTamanho = (ProdutoComTamanho) o;
        return Objects.equals(tamanho, prodTamanho.tamanho);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tamanho);
    }
}
