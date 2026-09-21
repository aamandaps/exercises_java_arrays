package vetores;

import javax.swing.JOptionPane;

/*Criar e coletar um vetor [100] inteiro e exibir:
    - O maior e o menor valor;
    - A média dos valores.*/

public class Exercicio02 {

    public static void main (String[] args) {

        int[] vet = new int[100]; // Criação e inicialização do vetor
        int opc=0;

        // Loop do switch-case
        while(opc!=4)
        {

            opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:\n1 - Carregar Vetor;\n2 - Maior e Menor valor do Vetor;\n3 - Média dos valores;\n4 - Finalizar Execução."));

            switch (opc)
            {
                case 1:
                    vet = CarregarVetor(vet);
                break;

                case 2:
                    CalcMaior(vet);
                break;

                case 3:
                    JOptionPane.showMessageDialog(null, "Média = "+ String.format("%.2f",CalcMedia(vet)));
                break;

                case 4:
                    JOptionPane.showMessageDialog(null, "FIM");
                System.exit(0);

                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida.");
            } // Fim Switch-Case
        } // Fim Loop

    } // Fim Main

    // Função CarregaVetor
    public static int[] CarregarVetor(int[] vetor) {

        int i;

        for(i=0;i<100;i++)
        {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro: "));
        }

        return vetor;
    } // Fim CarregaVetor

    // Procedimento CalcMaior
    public static void CalcMaior(int[] vetor) {

        int maior, menor, i=0;

        maior = vetor[i];
        menor = vetor[i];

        // Loop que vai percorrer o vetor
        for(i=0;i<100;i++)
        {
            // Comparação
            if (vetor[i]>maior)
            {
                maior = vetor[i];
            }
            if (vetor[i]<menor)
            {
                menor = vetor[i];
            }
        }

        JOptionPane.showMessageDialog(null, "Maior = "+maior+"\nMenor = "+menor);
    } // Fim CalcMaior

    // Função CalcMedia
    public static double CalcMedia(int[] vetor) {

        double media, soma=0.0;
        int i;

        // Loop que vai percorrer o vetor
        for(i=0;i<100;i++)
        {
            soma += vetor[i];
        }

        media = (soma/100);

        return media;
    } // Fim CalcMedia
}
