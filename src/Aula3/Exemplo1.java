package Aula3;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);
        
        System.out.println("Qual a sua idade?");
        int idade = scan.nextInt();
        
        if (idade > 60) {
            System.out.println("O Sr. pode estacionar");
        }*/
        
        /*String nome = "Peter Parker";
        
        if (nome.equals("Peter Parker")) {
            System.out.println("Bem vindo! Homem Aranha");
        }*/
        
        /*int idade = 10;
        String nome = "Clark";
        int idadeMinima = 18;
        
        if (idade >= idadeMinima) {
            System.out.println("Seja bem vindo!");
        } else if (nome.equals("Peter")) {
            System.out.println("Homem Aranha pode entrar");
        } else {
            System.out.println("ENTAO, CAI FORA!!!!!");
        }*/
        
        
        /*if (3 > 1 && 5 == 3) {
            // Bloco 1
        } else {
            // Bloco 2
        }
        
        if (false || false) {
             // Bloco 1
        } else {
            // Bloco 2
        }
        
        
        
        String nome = "Peter";
        
        if (nome.equals("Peter")) {
            // Bloco 1
        } else {
           // Bloco 2 
        }*/
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero?");
        int num = scan.nextInt();
        
        int result = num % 2;
        System.out.println(result);
        if (result == 0) {
            System.out.println("O Numero e par");
        } else {
           System.out.println("O Numero e Imapar"); 
        }
    }
}
