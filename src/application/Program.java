package application;

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
            cliente.exibirDados();

            System.out.println("\n*** CADASTRO DE PRODUTO ***");
            // Cadastro do produto
            Product produto = cadastrarProduto(sc);

            // Entrada da quantidade
            int quantidadeProduto = InputValidator.validarEntradaInteira(sc, "Quantidade: ");

            // Cálculo do orçamento
            OrcamentoService orcamentoService = new OrcamentoService(produto, quantidadeProduto);
            double valorFinal = orcamentoService.calcularOrcamento();

            // Exibição do orçamento final
            System.out.printf("\nProduto: %s\nQuantidade: %d\n", produto.getNome(), quantidadeProduto);
            System.out.printf("O orçamento final para %s é de: R$ %.2f\n", cliente.getNome(), valorFinal);
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
}

