package Aula6_Exercicios;

/*
Imprima um triangulo de Números com 5 linhas invertido
1  2  3  4  5
6  7  8  9
10 11 12
13 14
15
*/
public class Tarefa9 {
    public static void main(String[] args) {
        int linhas = 5;
        int numeroAtual = 1;
        String space =  "";

        for (int i = linhas; i >= 1; i--) {
            for (int j=i; j >= 1; j--) {
                space = String.valueOf(numeroAtual).length() > 1?" ":"  ";
                System.out.print(numeroAtual + space);
                numeroAtual++;
            }
            System.out.println(); // Move para a próxima linha após imprimir os números
        }
    }
}
