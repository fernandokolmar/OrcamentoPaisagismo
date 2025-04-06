package services;

import entities.Product;

public class OrcamentoService {
    private Product produto;
    private int quantidade;

    public OrcamentoService(Product produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double calcularOrcamento() {
        return produto.getPreco() * quantidade;
    }
}
