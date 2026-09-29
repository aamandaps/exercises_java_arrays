package matrizes;

import javax.swing.JOptionPane;
import java.util.Random;

public class Exercicio02 {

    public static void main(String[] args) {

        int mat[][] = new int[4][4];

        CarregaMat(mat);

        // Percorre e exibe a matriz
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                JOptionPane.showMessageDialog(null, "Matriz Posição Nº "+(i+1)+" = "+mat[i][j]);
            }
        } // Fim Loop

    } // Fim Main

    // Função que carrega a matriz
    public static int[][] CarregaMat(int matriz[][]) {

        int valor=1; // i=linhas, j=colunas

        Random random = new Random(); // Instanciando objeto random que vai gerar os valores aleatórios

        // Loop que percorre a matriz
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                // Verificando se recebe múltiplo de 4 de acordo com a posição
                if(i == j)
                {
                   matriz[i][j] = valor;
                   valor *=4;
                }
                else
                {
                    matriz[i][j] = random.nextInt(100);
                } // Fim Condicional
            }
        } // Fim Loop

        return matriz;
    } // Fim CarregaMat
}
