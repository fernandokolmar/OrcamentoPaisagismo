package utils;

import java.util.Scanner;

public class InputValidator {

    // Método para validar entrada de números inteiros
    public static int validarEntradaInteira(Scanner sc, String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                int valor = Integer.parseInt(sc.nextLine());
                if (valor > 0) {
                    return valor;
                } else {
                    System.out.println("O valor deve ser maior que zero. Tente novamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
            }
        }
    }

    // Método para validar entrada de números decimais
    public static double validarEntradaDouble(Scanner sc, String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                double valor = Double.parseDouble(sc.nextLine());
                if (valor > 0) {
                    return valor;
                } else {
                    System.out.println("O valor deve ser maior que zero. Tente novamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número válido.");
            }
        }
    }

    // Método para validar entrada de texto
    public static String validarTexto(Scanner sc, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String entrada = sc.nextLine().trim();
            if (!entrada.isEmpty()) {
                return entrada;
            } else {
                System.out.println("O campo não pode estar vazio. Tente novamente.");
            }
        }
    }
}
