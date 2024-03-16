package Aula2;

public class Demo1 {
    public static void main(String[] args) {
        String linha = "teste \n";
        String tab   = "\tteste";
        String barra = "mostrar barra \\";
        String aspas = "\"Quer mostrar \"";
        
        String nome = "Fabio";
        int idade = 50;
        float valor = 110.55f;
        //System.out.printf("O %s tem %d anos de idade e o valor e %.2f\n", nome, idade, valor);
    
        float resto = 5%2;
        //System.out.println(resto);
        
        int x = 3;
        System.out.println(x);
        x++; // x = x + 1;
        System.out.println("Depois do incremento = "+x);
        x--; // x = x - 1;
        x--;
        System.out.println("Decremento "+x);
    }
}
