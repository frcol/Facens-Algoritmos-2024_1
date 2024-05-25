package Aula11_Exercicios;

import java.util.Random;

/*
Fa�a um programa que leia uma matriz 3x5 de inteiros, substitua seus elementos
negativos por 0 e imprima a matriz original e a modificada
*/

public class Tarefa6 {
    public static void main(String[] args) {
        Random random = new Random();
        
        int[][] matriz = { {-1, 1, 2, 3, 5},
                           {5,-4,-1, 8,-6},
                           {-2,9,-5, 3, 2} };
        
        int[][] matriz2 = new int[3][5];
        
        // Preenchendo a matriz com n�meros inteiros crescentes
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    matriz2[i][j] = 0;
                }
                else {
                    matriz2[i][j] = matriz[i][j];
                }
            }
        }
        
        // Imprimindo a matriz
        imprimirMatriz(matriz);
        
        System.out.println();
        imprimirMatriz(matriz2);
        
    }
    
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
