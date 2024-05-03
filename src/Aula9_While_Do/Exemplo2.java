package Aula9_While_Do;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        int opcaoMenu = 0;
        double num1 = 0;
        double num2 = 0;
        double resultado = 0;
        
        do  {
            System.out.println("[1]-Somar\n[2]-Subtrair\n[3]-Multiplicar\n[4]-Dividir\n[5]-Sair");
            opcaoMenu = scan.nextInt();
             
            if (opcaoMenu != 5) {
                System.out.print("Num1: ");
                num1 = scan.nextDouble();
                System.out.print("Num2: ");
                num2 = scan.nextDouble();
            }
            
            switch (opcaoMenu) {
                case 1:
                    resultado = num1+num2;
                    break;
                case 2:
                    resultado = num1-num2;
                    break;
                case 3:
                    resultado = num1*num2;
                    break;
                case 4:
                    resultado = num1/num2;
                    break;
                case 5:
                    System.out.println("Saindo....");
                    break;
                default:
                    System.out.println("## OPÇÃO INVÁLIDA ##");
            }
            
            System.out.println("======================================");
            System.out.printf("Resultado: %.2f\n", resultado);
            System.out.println("======================================\n");
        } while (opcaoMenu != 5);
    }  
}
