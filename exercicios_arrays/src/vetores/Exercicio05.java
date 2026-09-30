package vetores;

import javax.swing.JOptionPane;

public class Exercicio05 {

    public static void main (String[] args) {

        int vet[] = new int[20];
        int i, soma=0;

        // Percorre e carrega o vetor
        for(i=0;i<20;i++)
        {
            vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro: "));
        } // Fim Loop 1

        // Percorre e armazena os valores simetricamente opostos na somatória
        for(i=1; i<11; i++)
        {
            soma += vet[i-1] - vet[20-i];
        } // Fim Loop 2

        JOptionPane.showMessageDialog(null, "Soma = "+soma);

    } // Fim Main
}