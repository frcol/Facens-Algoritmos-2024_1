package Aula6_Switch;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double preco = 0;
        boolean houveErro = false;
        
        System.out.println("==============================");
        System.out.println("100- Cachorro Quente    R$1,70");
        System.out.println("101- Bauro Simpres      R$2,30");
        System.out.println("102- Bauru com Ovo      R$2,60");
        System.out.println("103- Hamburguer         R$2,40");
        System.out.println("104- XBurguer           R$2,50");
        System.out.println("105- Refrigerante       R$1,00");
        System.out.println("==============================");
        
        System.out.print("Qual item voce deseja? ");
        int item = scan.nextInt();

        System.out.print("Qual a quantidade? ");
        int qtde = scan.nextInt();
            
        switch (item) {
            case 100:
                preco = 1.7;
                break;
            case 101:
                preco = 2.3;
                break;
            case 102:
                preco = 2.6;
                break;
            case 103:
                preco = 2.4;
                break;
            case 104:
                preco = 2.5;
                break;
            case 105:
                preco = 1.0;
                break;
            default:
                System.out.println("## Nao temos esse produto ##");
                houveErro = true;
        }
        
        if (!houveErro) {
            System.out.println("====================");
            System.out.printf("Valor a pagar: R$%.2f \n\n", qtde*preco);
        }
    }
}
