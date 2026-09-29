package matrizes;

import javax.swing.JOptionPane;

public class Exercicio03 {

    public static void main (String[] args) {

        long mat[][] = new long[8][8]; // Uso do long em vez do int pra não dar overfllow

        Matriz(mat);
    } // Fim Main

    public static void Matriz(long mat[][]) {

        long valor=1, soma=0;

        // Percorre a matriz
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                mat[i][j] = valor;
                soma+=valor;
                valor*=2;
            }
        } // Fim Loop

        JOptionPane.showMessageDialog(null, "Soma = "+soma);
    } // Fim Procedimento
}
