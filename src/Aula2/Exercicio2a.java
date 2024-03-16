package Aula2;

import java.util.Scanner;

public class Exercicio2a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o seu Nome");
        String nome = scan.nextLine();
        
        System.out.println("Digite o seu Endereco");
        String endereco = scan.nextLine();
        
        System.out.println("Digite o seu Telefone");
        String telefone = scan.nextLine();

        System.out.println("Digite o sua Area de atuacao Profissional");
        String profissao = scan.nextLine();
        
        System.out.println("Nome: "+nome);
        System.out.println("Endereco: "+endereco);
        System.out.println("Telefone: "+telefone);
        System.out.println("Profissao: "+profissao);
    }
}
