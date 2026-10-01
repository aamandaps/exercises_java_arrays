package matrizes;

import java.util.Random;

public class Exercicio05 {

    public static void main (String[] args) {

        int mat[][] = new int[8][8]; // Tabuleiro
        int vetsoma[] = new int[7]; // vetor que vai armazenar as peças
        Random gerador = new Random(); // vai gerar valores aleatórios

        // Percorre Matriz
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                // Carrega Matriz
                mat[i][j] = gerador.nextInt(7)+1;

                // Incrementando o vetor com a peça que acabou de ser carregada na matriz
                vetsoma[mat[i][j] -1]++;
            }
        } // Fim Loop

        // Testando resultado da contagem
        System.out.println("Quantidade de cada peça no tabuleiro:");
        System.out.println("Peões (1): " + vetsoma[0]);
        System.out.println("Torres (2): " + vetsoma[1]);
        System.out.println("Bispos (3): " + vetsoma[2]);
        System.out.println("Cavalos (4): " + vetsoma[3]);
        System.out.println("Rainhas (5): " + vetsoma[4]);
        System.out.println("Reis (6): " + vetsoma[5]);
        System.out.println("Vazios (7): " + vetsoma[6]);

    }
}
