package Aula3_Exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pergunta a idade da pessoa
        System.out.print("Qual é a sua idade? ");
        int idade = scanner.nextInt();

        // Classifica a idade e exibe a mensagem correspondente
        if (idade < 12) {
            System.out.println("Você é uma criança.");
        } else if (idade >= 12 && idade < 18) {
            System.out.println("Você é um adolescente.");
        } else if (idade >= 18 && idade < 60) {
            System.out.println("Você é um adulto.");
        } else {
            System.out.println("Você é um idoso.");
        }
    }
}
