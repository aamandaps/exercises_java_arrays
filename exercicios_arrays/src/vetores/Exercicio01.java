package vetores;

/*Criar e coletar um vetor [50] inteiro. Calcular e exibir:
    - A média dos valores entre 10 e 200;
    - A soma dos números ímpares.*/

import javax.swing.*;

public class Exercicio01 {

    public static void main (String[] args) {

        int opc=0, soma;
        int[] vetor = new int [5]; // Criação e inicialização do vetor
        double media;

        // Loop do switch-case
        while (opc!=5)
        {
            opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma dessas opções:\n1 - Carregar o vetor;\n2 - Calcular a média do valores entre 10 e 200 presentes no vetor;\n3 - Soma dos números ímpares do vetor\n4 - Mostrar Vetor\n5 - Finalizar execução."));

            switch (opc)
            {
                case 1:
                    vetor = CarregarVetor(vetor);
                break;

                case 2:
                    JOptionPane.showMessageDialog(null, "Média = "+ String.format("%.2f", CalcMedia(vetor)));
                break;

                case 3:
                    JOptionPane.showMessageDialog(null, "Soma = "+NumImpar(vetor));
                break;

                case 4:
                    MostraVetor(vetor);
                break;

                case 5:
                    JOptionPane.showMessageDialog(null, "FIM");
                System.exit(0);

                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida.");
            } // Fim Switch-Case

        } // Fim Loop
    } // Fim Main

    // Função
    public static int[] CarregarVetor(int[] vet) {

        int i;

        for (i=0;i<50;i++)
        {
            vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro: "));
        }

        return vet;
    } // Fim CarregaVetor

    // Função
    public static double CalcMedia(int[] vet) {

        double media=0.0, qnt_n=0.0,soma=0.0;
        int i;

        // Loop que vai percorrer o vetor
        for (i=0;i<50;i++)
        {
            // Verificação
            if (vet[i]>=10 && vet[i]<=200)
            {
                soma += vet[i];
                qnt_n += 1;
            }
        }

        media =(soma/qnt_n); // Cálculo Média

        return media;
    } // Fim CalcMedia

    // Função
    public static int NumImpar(int[] vet){

        int i,soma=0;

        // Loop que vai percorrer o vetor
        for(i=0;i<50;i++)
        {
            // ehImpar
            if(vet[i]%2!=0)
            {
                soma += vet[i]; // Soma dos ímpares
            }
        }

        return soma;
    } // Fim NumImpar

    // Procedimento
    public static void MostraVetor(int[] vet) {

        int i;

        // Loop que vai percorrer o vetor
        for (i=0;i<50;i++)
        {
            JOptionPane.showMessageDialog(null, "Vetor ["+i+"] = "+vet[i]);
        }
    } // Fim MostraVetor

}
