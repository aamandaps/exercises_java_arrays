package vetores;

import javax.swing.JOptionPane;

/*Criar e coletar em um vetor [20] com números aleatórios. Classificar este vetor em ordem crescente e mostre os dados.*/

public class Exercicio06 {

    public static void main (String[] args) {

        int vet[] = new int[20];
        int i;

        // Carregando o vetor
        for(i=0;i<20;i++)
        {
            vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro: "));
        }

        ClassificaVetor(vet);
    } // Fim Main

    // Procedimento ClassificaVetor
    public static void ClassificaVetor(int vet[]) {

        int i,j,aux;

        // Loop que vai percorrer o vetor. A cada volta ele avança uma posição.
        for(i=0;i<19;i++)
        {
            // Vai comparar a posição do i com a próxima e com todas as seguintes até o final do vetor.
            for(j=i+1;j<20;j++)
            {
                // Verificação que vai ordenar o vetor
                if(vet[i]>vet[j])
                {
                    aux = vet[j];
                    vet[j] = vet[i];
                    vet[i] = aux;
                }
            } // Fim Loop j
        } // Fim Loop i

        MostraVetor(vet);
    } // Fim ClassificaVetor

    public static void MostraVetor(int vet[]) {

        int i;

        // Loop percorre vetor
        for(i=0;i<20;i++)
        {
            JOptionPane.showMessageDialog(null,"Vetor ["+i+"] = "+vet[i]);
        }
    } // Fim MostraVetor
}
