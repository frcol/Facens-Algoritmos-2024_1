package Aula6_Exercicios;

import java.util.Scanner;
/*
Imprima um triangulo com 5 linhas (for dentro de for)
*
* * 
* * *
* * * * 
* * * * *
*/
public class Tarefa7 {
    public static void main(String[] args) {
        int linhas = 5;
        
        for (int i = 0; i < linhas; i++) {
            for (int j=0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
