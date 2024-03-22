package Aula3_Exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pergunta a temperatura atual (Celsius)
        System.out.print("Qual é a temperatura atual (em Celsius)? ");
        double temperatura = scanner.nextDouble();

        // Verifica em qual categoria a temperatura se encaixa e exibe a mensagem correspondente
        if (temperatura > 30) {
            System.out.println("Está quente!");
        } else if (temperatura > 15 && temperatura <= 30) {
            System.out.println("Está morno.");
        } else {
            System.out.println("Está frio.");
        }  
    }
}
