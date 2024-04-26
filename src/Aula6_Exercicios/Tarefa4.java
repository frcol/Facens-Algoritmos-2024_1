package Aula6_Exercicios;

import java.util.Scanner;
/*
Um programa precisa exibir uma mensagem de acordo com o tipo de erro que ocorreu
em um sistema. A tabela abaixo mostra os c�digos e as mensagens correspondentes:
*/
public class Tarefa4 {
    public static void main(String[] args) {
        // variaveis
        Scanner scan = new Scanner(System.in);
        String message = "";   
        
        // entrada
        System.out.println("Digite o c�digo do erro: ");
        int codErro = scan.nextInt();
        
        
        switch (codErro) {
            case 1:
                message = "Erro de conex�o com o servidor";
                break;
            case 2:
                message = "Usu�rio ou senha inv�lido";
                break;
            case 3:
                message = "Arquivo n�o encontrado";
                break;
            case 4:
                message = "Espa�o em disco insuficiente";
                break;
            case 5:
                message = "Permiss�o negada para acessar arquivo ou pasta";
                break;
                
            default:
                message = "## ERRO N�O IDENTIFICADO ##";
        }
        
        System.out.println(message);
    }
}
