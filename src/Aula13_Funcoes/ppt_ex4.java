package Aula13_Funcoes;

import java.util.Scanner;

public class ppt_ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "utf8");
        
        System.out.print("Digite uma palarvra: ");
        double graus = scan.nextDouble();
  
        System.out.println(graus +" em Frahrenhei é "+converterParaFahrenheit(graus));
    }
    
    public static double converterParaFahrenheit(double valor) {
        double fah = valor * 9/5 + 32;
        
        return fah;
    }
}
