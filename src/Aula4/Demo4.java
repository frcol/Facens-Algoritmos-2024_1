package Aula4;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int num = 0;
      int total = 0;
      
      for (int i=0; i < 3;i++) {
        System.out.println("Digite o numero?");
        num = scan.nextInt(); 
        total = total + num;
        //total += num;
      }   
      
      System.out.println("Total = "+total);
    }  
}
