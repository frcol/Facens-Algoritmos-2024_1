package Aula6_Exercicios;

import java.util.Scanner;
/*
Uma loja de roupas quer implementar um sistema de desconto para os clientes. 
O sistema deve oferecer um desconto de 20% para clientes que compram mais de R$ 200,00, 
10% para clientes que compram mais de R$ 100,00 em produtos, e um desconto de 5% para 
clientes que compram mais de R$ 50,00 em produtos. Crie um programa que leia o 
valor da compra de um cliente e exiba o desconto que ele receber� e o valor que 
ele dever� pagar.
*/
public class Tarefa2 {
    public static void main(String[] args) {
        // variaveis
        Scanner scan = new Scanner(System.in);
        float porcentagemDesconto = 0f;
        float valorComDesconto = 0f;
        float desconto = 0f;
        
        // entrada
        System.out.println("Qual o valor da compra: ");
        float valor = scan.nextFloat();
        
        if (valor >= 200) {
            porcentagemDesconto = 0.2f;
        }
        else if (valor >= 100 && valor < 200) {
            porcentagemDesconto = 0.1f;
        }
        else if (valor >= 50) {
            porcentagemDesconto = 0.05f;
        }
        
        desconto = valor * porcentagemDesconto;
        valorComDesconto = valor - desconto;
        
        System.out.println("Desconto: "+desconto);
        System.out.println("Valor com desconto: "+valorComDesconto);
    }
}
