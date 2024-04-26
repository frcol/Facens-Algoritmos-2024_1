package Aula6_Exercicios;

import java.util.Scanner;
/*
Um programa precisa exibir uma mensagem para cada m�s do ano, de acordo com o n�mero do 
m�s informado pelo usu�rio. Por exemplo, se o usu�rio informar o n�mero 1, o programa deve 
exibir "Janeiro". Use o switch case para implementar essa funcionalidade.
*/

public class Tarefa5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o n�mero do m�s (1 a 12):");
        int numeroMes = scanner.nextInt();

        String nomeMes;

        switch (numeroMes) {
            case 1:
                nomeMes = "Janeiro";
                break;
            case 2:
                nomeMes = "Fevereiro";
                break;
            case 3:
                nomeMes = "Mar�o";
                break;
            case 4:
                nomeMes = "Abril";
                break;
            case 5:
                nomeMes = "Maio";
                break;
            case 6:
                nomeMes = "Junho";
                break;
            case 7:
                nomeMes = "Julho";
                break;
            case 8:
                nomeMes = "Agosto";
                break;
            case 9:
                nomeMes = "Setembro";
                break;
            case 10:
                nomeMes = "Outubro";
                break;
            case 11:
                nomeMes = "Novembro";
                break;
            case 12:
                nomeMes = "Dezembro";
                break;
            default:
                nomeMes = "M�s inv�lido";
                break;
        }

        System.out.println("O m�s correspondente ao n�mero " + numeroMes + " �: " + nomeMes);

    }
}
