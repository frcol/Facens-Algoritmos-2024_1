package Aula1_Exercicios;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um numero");
        float num1 = entrada.nextInt();
        
        System.out.println("Digite outro numero");
        float num2 = entrada.nextInt();
        
        float soma = num1 + num2;
        float sub = num1 - num2;
        float mult = num1 * num2;
        float div = num1 / num2;
        
        /*System.out.println(  "Soma = " + soma
                            +"\nSub = " + sub
                            +"\nMult = " + mult
                            +"\nDivi = " + div);*/
        System.out.println("Soma = "+soma);
        System.out.println("Subtracao = "+sub);
        System.out.println("Multiplicacao = "+mult);
        System.out.println("Divisao = "+div);
    }  
}
