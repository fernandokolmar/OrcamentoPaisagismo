package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Cliente;
import entities.Product;
import services.OrcamentoService;
import utils.InputValidator;

public class Program {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("**** PAISAGISMO ALTOS DO TATUAPÉ ****");
            System.out.println("\n*** CADASTRO DE CLIENTES ***\n");

            // Cadastro do cliente
            Cliente cliente = cadastrarCliente(sc);

            // Lista para armazenar os produtos comprados
            List<Product> produtosComprados = new ArrayList<>();
            List<Integer> quantidades = new ArrayList<>();

            // Loop para adicionar produtos
            while (true) {
                System.out.println("\n*** CADASTRO DE PRODUTO ***");
                Product produto = cadastrarProduto(sc);
                int quantidade = InputValidator.validarEntradaInteira(sc, "Quantidade: ");

                produtosComprados.add(produto);
                quantidades.add(quantidade);

                System.out.print("\nDeseja adicionar outro produto? (s/n): ");
                String resposta = sc.nextLine().trim().toLowerCase();
                if (resposta.equals("n")) {
                    break;
                }
            }

            // Exibição do orçamento final
            exibirOrcamentoFinal(cliente, produtosComprados, quantidades);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado. Por favor, tente novamente.");
        }
    }

    // Método para cadastrar cliente
    private static Cliente cadastrarCliente(Scanner sc) {
        Cliente cliente = new Cliente();
        cliente.setNome(InputValidator.validarTexto(sc, "Nome: "));
        cliente.setEndereco(InputValidator.validarTexto(sc, "Endereço: "));
        cliente.setTelefone(InputValidator.validarTexto(sc, "Telefone: "));
        return cliente;
    }

    // Método para cadastrar produto
    private static Product cadastrarProduto(Scanner sc) {
        String nomeProduto = InputValidator.validarTexto(sc, "Nome do Produto: ");
        double precoProduto = InputValidator.validarEntradaDouble(sc, "Digite o preço do produto (apenas números positivos): ");
        return new Product(nomeProduto, precoProduto);
    }

    // Método para exibir o orçamento final
    private static void exibirOrcamentoFinal(Cliente cliente, List<Product> produtos, List<Integer> quantidades) {
        System.out.println("\n*** DADOS DO CLIENTE ***");
        cliente.exibirDados();

        System.out.println("\n*** PRODUTOS COMPRADOS ***");
        double totalOrcamento = 0.0;

        for (int i = 0; i < produtos.size(); i++) {
            Product produto = produtos.get(i);
            int quantidade = quantidades.get(i);
            double subtotal = OrcamentoService.calcularSubtotal(produto, quantidade);

            System.out.printf("Produto: %s | Preço Unitário: R$ %.2f | Quantidade: %d | Subtotal: R$ %.2f\n",
                    produto.getNome(), produto.getPreco(), quantidade, subtotal);

            totalOrcamento += subtotal;
        }

        // Cálculo do total usando OrcamentoService
        totalOrcamento = OrcamentoService.calcularTotal(produtos, quantidades);

        System.out.printf("\n*** TOTAL DO ORÇAMENTO: R$ %.2f ***\n", totalOrcamento);
    }
}

