package Aula3_Exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pergunta um número ao usuário
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Verifica se o número é par e múltiplo de 3 e exibe a mensagem correspondente
        if (numero % 2 == 0 && numero % 3 == 0) {
            System.out.println("O número é par e múltiplo de 3.");
        } else if (numero % 2 == 0 && numero % 3 != 0) {
            System.out.println("O número é par, mas não é múltiplo de 3.");
        } else if (numero % 2 != 0 && numero % 3 == 0) {
            System.out.println("O número não é par, mas é múltiplo de 3.");
        } else {
            System.out.println("O número não é par e nem múltiplo de 3.");
        }
    }
}
