package Aula3_Exercicios;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int valor = scan.nextInt();
                
        if (valor > 0) {
            System.out.println("Positivo");
        } else if (valor < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Zero");
        }
    }
}
