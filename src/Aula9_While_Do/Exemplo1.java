package Aula9_While_Do;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*String nome = "";
        
        while (nome.equals("")) {
            System.out.println("Escreva seu nome");
            nome = scan.nextLine();
        }*/
        
        int opcaoMenu = 0;
        String nome = "";
        String tel = "";
        
        while (opcaoMenu != 3) {
            System.out.println("[1]-Cadastrar\n[2]-Listar nome\n[3]-Sair");
            opcaoMenu = scan.nextInt();
             
            switch (opcaoMenu) {
                case 1:
                    System.out.println("** CADASTRO **");
                    System.out.println("===============");
                    System.out.print("Nome: ");
                    nome = scan.next();
                    
                    System.out.print("Telefone: ");
                    tel = scan.next();
                    break;
                case 2:
                    System.out.println("** LISTAR NOME **");
                    System.out.println("===============");
                    
                    if (!nome.equals("")) {
                        System.out.println("Nome: "+nome);
                        System.out.println("Telefone: "+tel);
                    }
                    else {
                        System.out.println("Nenhum nome cadastado");
                    }
                    
                    break;
                case 3:
                    System.out.println("Tchau! Volte sempre.");
                    break;
                default:
                    System.out.println("## OPÇÃO INVÁLIDA ##");
            }
            
            System.out.println("------------------------------------\n");
        }
    }  
}
