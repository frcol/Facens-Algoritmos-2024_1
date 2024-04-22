package Aula6_Switch;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double result = 0;
        boolean houveErro = false;
        
        System.out.print("Num 1: ");
        double num1 = scan.nextDouble();
        
        System.out.print("Num 2: ");
        double num2 = scan.nextDouble();
        
        
        System.out.println("\n[1] Somar\n[2] Subtrair\n[3] Multiplicar\n[4] Dividir");
        System.out.print("Opcao: ");
        int menu = scan.nextInt();
        
        switch (menu) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                result = num1 / num2;
                break;
            default:
                System.out.println("## Opcao errada ##");
                houveErro = true;
        }
        
        if (!houveErro) {
            System.out.println("====================");
            System.out.printf("Resultado %.2f: \n\n",result);
        }
    }
}
