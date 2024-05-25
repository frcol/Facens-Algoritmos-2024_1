
package Aula13_Funcoes;

public class Exemplo1 {

    public static void main(String[] args) {
        System.out.println("estou na main...\n");
        
        String nome = imprimeNome("Joao", "Macedo");
        System.out.println(nome);
        
        int resultado = calcular(5, 3);
        System.out.println(resultado);
        
        System.out.println(calcular(5, 3));
    } 
    
    public static String imprimeNome(String pNome, String sobreNome) {
        String nome = pNome+ " "+sobreNome;
        
        return nome;
    }
    
    public static int calcular(int num1, int num2) {
        int soma = num1+num2;
        
        return soma;
    }
}
