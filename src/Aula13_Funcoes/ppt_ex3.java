package Aula13_Funcoes;

import java.util.Scanner;

public class ppt_ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "utf8");
        
        System.out.print("Digite uma palarvra: ");
        String palavra = scan.next();
        
        System.out.print("Digite a letra: ");
        char letra = scan.next().charAt(0);
        
        int tot = contaLetras(palavra, letra);
        System.out.println("Total de letras na palavra: "+tot);
        
        
        System.out.println(contaLetras("paralelepipedo", 'p'));
        
        if (contaLetras("Fabio", 'a') > 0) {
            System.out.println("achou A");
        }
    }
    
    public static int contaLetras(String str, char letra) {
        int total = 0;
        
        for (int i=0; i < str.length(); i++) {
            if (str.charAt(i) == letra) {
                total++;
            }
        }
        
        return total;
    }
}
