package Aula3_Exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usu�rio
        Scanner scanner = new Scanner(System.in);

        // Pergunta a idade da pessoa
        System.out.print("Qual � a sua idade? ");
        int idade = scanner.nextInt();

        // Classifica a idade e exibe a mensagem correspondente
        if (idade < 12) {
            System.out.println("Voc� � uma crian�a.");
        } else if (idade >= 12 && idade < 18) {
            System.out.println("Voc� � um adolescente.");
        } else if (idade >= 18 && idade < 60) {
            System.out.println("Voc� � um adulto.");
        } else {
            System.out.println("Voc� � um idoso.");
        }
    }
}
