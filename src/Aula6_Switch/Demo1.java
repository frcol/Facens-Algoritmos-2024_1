package Aula6_Switch;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        
        /*for (int i=9; i >= 0; i--) {
            for (int j=5; j >= 0; j--) {
                System.out.print(i+"_"+j+" ");
            }
            System.out.println("");
        }*/
        
        Scanner scan = new Scanner(System.in);
        System.out.println("[1] Cadastrar\n [2 Apagar\n [3] Listar todos\n [4] Sair");
        int menu = scan.nextInt();
        
        switch(menu) {
            case 1:
                System.out.println("Cadstro");
                break;
            case 2: 
                System.out.println("Apagar");
                break;
        }      
    }
}
