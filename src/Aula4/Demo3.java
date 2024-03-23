package Aula4;

import java.util.Scanner;

public class Demo3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Qual a tabuada?");
        int tabuada = scan.nextInt();
        
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " x "+tabuada+" = "+i*tabuada);
        }
    }
    
}
