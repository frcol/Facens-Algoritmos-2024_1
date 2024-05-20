package Aula11_Exercicios;

import java.util.Random;

/*
Fa�a um programa que recebe uma matriz 5x3 e informa qual � o maior elemento dela e sua
posi��o
*/

public class Tarefa3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[5][3];
        int maxNum = Integer.MIN_VALUE;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(100);
                if (matriz[i][j] > maxNum) {
                    maxNum = matriz[i][j];
                }
            }
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Maior numero: "+maxNum);
    }
}
