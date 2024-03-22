package Aula3_Exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usu�rio
        Scanner scanner = new Scanner(System.in);

        // Pergunta um n�mero ao usu�rio
        System.out.print("Digite um n�mero inteiro: ");
        int numero = scanner.nextInt();

        // Verifica se o n�mero � par e m�ltiplo de 3 e exibe a mensagem correspondente
        if (numero % 2 == 0 && numero % 3 == 0) {
            System.out.println("O n�mero � par e m�ltiplo de 3.");
        } else if (numero % 2 == 0 && numero % 3 != 0) {
            System.out.println("O n�mero � par, mas n�o � m�ltiplo de 3.");
        } else if (numero % 2 != 0 && numero % 3 == 0) {
            System.out.println("O n�mero n�o � par, mas � m�ltiplo de 3.");
        } else {
            System.out.println("O n�mero n�o � par e nem m�ltiplo de 3.");
        }
    }
}
