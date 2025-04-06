package services;

import entities.Product;
import java.util.List;

public class OrcamentoService {

    // Método para calcular o subtotal de um produto
    public static double calcularSubtotal(Product produto, int quantidade) {
        return produto.getPreco() * quantidade;
    }

    // Método para calcular o total do orçamento
    public static double calcularTotal(List<Product> produtos, List<Integer> quantidades) {
        double total = 0.0;
        for (int i = 0; i < produtos.size(); i++) {
            Product produto = produtos.get(i);
            int quantidade = quantidades.get(i);
            total += calcularSubtotal(produto, quantidade);
        }
        return total;
    }
}
