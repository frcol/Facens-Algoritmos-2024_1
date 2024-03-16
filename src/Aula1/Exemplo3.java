package Aula1;

import java.util.Scanner;


public class Exemplo3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Qual o seu nome");
        String nome = scan.next();
        
        System.out.println("Qual a sua idade");
        int idade = scan.nextInt();
        
        System.out.println("Ola "+nome+", sua idade e "+idade);
        
        
    }
    
}
