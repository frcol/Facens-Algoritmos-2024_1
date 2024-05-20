package Aula12_AC2;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "UTF-8");
        
        String[] nomeProdutos = new String[100];
        int[] idProdutos = new int[100];
        double[] precoProdutos = new double[100];
        
        int[] idCarrinho = new int[100]; 
        int[] qtdeCarrinho = new int[100];
        
        int opcaoMenu = 0;
        String opcao = "";
        
        int indice = 0, indiceCarrinho = 0;
        
        do {
            clearConsole();
            System.out.println("""
                               
                               ==================================================
                               [1] Cadastrar
                               [2] Comprar
                               [3] Pagar
                               [4] Sair""");
            System.out.print("Opcao: ");
             opcaoMenu = scan.nextInt();
            clearConsole();
            
            switch (opcaoMenu) {
                case 1:// ==================================================================================
                // 1- Cadastrar Produto (ate 100 itens)
                //  cadastrar produto: id (automatico), nome e preco
                    System.out.println("""
                                       
                                       ==================================================
                                       ## CADASTRAR PRODUTO ##
                                       """);
                    do {
                        idProdutos[indice] = indice;
                        System.out.print("Nome: ");
                        nomeProdutos[indice] = scan.next();
                        System.out.print("Preco: ");
                        precoProdutos[indice] = scan.nextDouble();
                    
                        System.out.println("Cadastrar outro Porduto (S/N)");
                        opcao = scan.next();
                        indice++;
                    } while(opcao.toUpperCase().equals("S"));
                    break;
                case 2:// ==================================================================================
                    // 2- Comprar (ate 100 itens)
                    //  Mostra lista de produtos (id, nome e preco)
                    //  escolhe produto por ID e adiciona no carrinho 
                    System.out.println("""
                                       
                                       ==================================================
                                       ## LISTA DE PRODUTOS ##
                                       """);
                    
                    
                    do {
                        if (indice == 0) {
                            System.out.println("## Não há produtos cadastrados ##");
                            break;
                        }
                        
                        for (int i=0; i < indice; i++) {
                            System.out.printf("%d- %s \t\t %.2f\n",idProdutos[i]+1, nomeProdutos[i], precoProdutos[i]);
                        }

                        System.out.print("ID do Produto: ");
                        idCarrinho[indiceCarrinho] = scan.nextInt()-1;
                        
                        System.out.print("Quantidade: ");
                        qtdeCarrinho[indiceCarrinho] = scan.nextInt();

                        System.out.println("Comprar outro Porduto (S/N)");
                        opcao = scan.next();
                        indiceCarrinho++;
                    } while(opcao.toUpperCase().equals("S"));
                    
                    break;
                case 3:// ==================================================================================
                    System.out.println("""
                                    
                                       ==================================================
                                       ## PAGAR CARRINHO ##
                                       """);
                    if (indiceCarrinho == 0) {
                        System.out.println("## Não há produtos no carrinho ##");
                        break;
                    }
                    
                    double totalCarrinho = 0;
                    // 3- Pagar
                    //  mostrar itens do carrinho
                    System.out.println("ID \tQuantidade \tProduto\tValor");
                    for (int i=0; i < indiceCarrinho; i++) {
                        System.out.printf("%d \t %d \t",idCarrinho[i]+1, qtdeCarrinho[i]);
                        System.out.printf("\t%s \t\t%.2f\n", nomeProdutos[idCarrinho[i]], precoProdutos[idCarrinho[i]]*qtdeCarrinho[i]);
                        totalCarrinho += precoProdutos[idCarrinho[i]]*qtdeCarrinho[i];
                    }
                    //  mostrar total do carrinho
                    System.out.printf("Total: %.2f\n", totalCarrinho);
                                       
                    scan.next();
                    indiceCarrinho = 0;
                    idCarrinho = new int[100];
                    qtdeCarrinho = new int[100];
 
                    break;
                case 4:// ==================================================================================
                // 4- Sair
                    System.out.println("*** Obrigado por comprar na loja da Facens ***\n\n\n");
                    break;
                default:
                    System.out.println("\n## OPCAO INVALIDA##");
            }
        } while (opcaoMenu != 4);  
    }
    
    private static void clearConsole() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
