package Aula2_Exercicios;

import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Entrada
        System.out.println("Pontos do lider:");
        float pontosLider = scan.nextFloat();
        
        System.out.println("Pontos do lanterna:");
        float pontosLanterna = scan.nextFloat();
        
        // Processamento
        double numJogos = Math.ceil((pontosLider-pontosLanterna) / 3);
        //float numJogos = (pontosLider-pontosLanterna) / 3;
        
        // saida
        System.out.println("\n\nNumero de jogos serao:"+numJogos);
    }
}
