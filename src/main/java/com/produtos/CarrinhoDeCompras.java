package com.produtos;

import java.util.HashMap;

public class CarrinhoDeCompras {
    private HashMap<Produto, Integer> itens;

    public CarrinhoDeCompras() {
        this.itens = new HashMap<>();
    }

    public HashMap<Produto, Integer> getItens() {
        return itens;
    }

    public void setItens(HashMap<Produto, Integer> itens) {
        this.itens = itens;
    }

    public void adicionaProduto(Produto produto, int quantidade){
        if(itens.containsKey(produto)){
            int quantidadeAtual = itens.get(produto);
            itens.put(produto, quantidadeAtual + quantidade);
        } else {
            itens.put(produto, quantidade);
        }
    }
    public void removeProduto(Produto produto, int quantidade) {
        if (itens.containsKey(produto)){
            int quantidadeAtual = itens.get(produto);
            int novaQuantidade = quantidadeAtual - quantidade;
            if (novaQuantidade > 0) {
                itens.put(produto, novaQuantidade);
            } else{
                itens.remove(produto);
            }
        }
    }
    public double calcularTotal(){
        double total = 0;
        for (Produto produto : itens.keySet()) {
            int quantidade = itens.get(produto);
            total += produto.getPreco() * quantidade;
        }
        return Math.floor(total * 100) / 100;
    }
}
