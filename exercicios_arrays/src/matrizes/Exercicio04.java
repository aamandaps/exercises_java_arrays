package matrizes;

import javax.swing.JOptionPane;

public class Exercicio04 {

    public static void main(String[] args) {

        int mat[][] = new int[8][8];
        int z; // Variável que vai preencher a matriz

        for(z=1;z<=4;z++)
        {
            for(int i=(z-1); i<=(8-z); i++)
            {
                for(int j=(z-1); j<=(8-z); j++)
                {
                    mat[i][j]=z;
                } // Fim Loop Coluna
            } // Fim Loop Linha
        } // Fim Loop Carrega a Matriz

        // Percorre e mostra a matriz
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                JOptionPane.showMessageDialog(null, "Matriz = "+mat[i][j]);
            }
        } // Fim Loop
    } // Fim Main
}
