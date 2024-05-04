package Aula10_Matriz;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Matriz 3x3\n");
        
        for(int linha=0; linha < matriz.length; linha++) {
            for (int coluna=0; coluna < matriz[0].length; coluna++) {
                matriz[linha][coluna] = scan.nextInt();
            }
        }
        System.out.println("A matriz ficou: ");
        for(int linha=0; linha < matriz.length; linha++) {
            for (int coluna=0; coluna < matriz[0].length; coluna++) {
                System.out.printf("\t %d \t", matriz[linha][coluna]);
            }
            System.out.println("");
        }
    }
}
