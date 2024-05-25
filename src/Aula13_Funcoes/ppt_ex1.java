package Aula13_Funcoes;

import java.util.Scanner;

public class ppt_ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "utf8");
        double num1, num2, resultado = 0;
        
        System.out.print("Num 1: ");
        num1 = scan.nextDouble();
        System.out.print("Num 2: ");
        num2 = scan.nextDouble();
        System.out.print("Operador: ");
        String operador = scan.next();
        
        System.out.println(calcular(num1, num2, operador));
    }
    
    public static double calcular(double num1, double num2, String operador) {
        double resultado = 0;
        
        switch (operador) {
            case "+":
                resultado = num1+num2;
                break;
            case "-":
                resultado = num1-num2;
                break;
            case "*":
                resultado = num1*num2;
                break;
            case "/":
                resultado = num1/num2;
                break;
            default:
                System.out.println("Operador Inválido");
        }
        
        return resultado;
    }
}
