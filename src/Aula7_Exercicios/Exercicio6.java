package Aula7_Exercicios;

import java.util.Scanner;
/*
Fa�a um algoritmo que leia v�rios n�meros inteiros e calcule o 
somat�rio dos n�meros negativos (positivos s�o ignorados). 
O fim da leitura ser� indicado pelo n�mero 0.
*/
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, somaNegativos = 0;

        do {
            System.out.print("Digite um n�mero inteiro (ou zero para sair): ");
            numero = scanner.nextInt();

            if (numero < 0) {
                somaNegativos += numero;
            }
        } while (numero != 0);

        System.out.println("Soma dos n�meros negativos: " + somaNegativos);
    }
}
