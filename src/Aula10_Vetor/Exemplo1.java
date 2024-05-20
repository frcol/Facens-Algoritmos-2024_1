
package Aula10_Vetor;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        
        /*int[] numeros = new int[5];
        
        numeros[0] = 100;
        numeros[1] = 50;
        numeros[2] = 30;
        numeros[3] = 15;
        numeros[4] = 10;
        
        String[] nomes = {"Fabio", "Joao", "Maria"};
        
        float[] precos = {10.5f, 0.55f, 2.33f};
        
        for (int i=0; i < 3; i++) {
            System.out.println(nomes[i]);
        }*/
        
        Scanner scan = new Scanner(System.in);
        
        String[] nomes = {"Fabio", "Darth Vader", "Peter Parker"};
        int[] idades = {50, 115, 34};
        boolean[] estaVivo = {true, false, true};
        String estadoVital = "";
        
        for (int i=0; i < nomes.length; i++) {
            if (estaVivo[i]) { 
                estadoVital = "está vivo"; 
            }
            else {
                estadoVital = "está morto"; 
            }
            System.out.println("O "+nomes[i]+ " tem idade "+idades[i]+" e "+ estadoVital);
        }
        
    }
}
