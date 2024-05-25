package Aula13_Funcoes;

import java.util.Scanner;

public class ppt_ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "utf8");
        
        System.out.print("Digite um número: ");
        int valor = scan.nextInt();
        
        if (checkPar(valor)) {
            System.out.println("é Par");
        }
    }
    
    public static boolean checkPar(int num) {
        if (num % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
