package vetores;

import javax.swing.JOptionPane;

public class Exercicio03 {

    public static void main (String[] args) {

        int[] vet1 = new int[3];
        int[] vet2 = new int[3];
        int[] vet3 = new int[6];
        int opc=0;

        while (opc!=4)
        {
            opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções\n1 - Preencher o Vetor Nº1;\n2 - Preencher o Vetor Nº2;\n3 - Exibir o Vetor Nº3;\n4 - Finalizar execução."));

            switch (opc)
            {
                case 1:
                    vet1 = CarregaVetor1(vet1);
                    break;

                case 2:
                    vet2 = CarregaVetor2(vet2);
                    break;

                case 3:
                    MostraVetor3(vet1, vet2,vet3);
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "FIM");
                    System.exit(0);

                default:JOptionPane.showMessageDialog(null, "Opção Inválida.");
            } // Fim Switch-Case

        } // Fim Loop
    } // Fim Main

    // Função do Vetor1
    public static int[] CarregaVetor1(int[] v1) {

        int i;

        // Carregando o vetor
        for(i=0;i<3;i++)
        {
            v1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro: "));
        }

        return v1;
    } // Fim Vetor1

    // Função Vetor2
    public static int[] CarregaVetor2(int[] v2) {

        int i;

        // Carregando o vetor
        for(i=0;i<3;i++)
        {
            v2[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro: "));
        }

        return v2;
    } // Fim Vetor2

    // Procedimento do Vetor3;
    public static void MostraVetor3(int[] v1, int[] v2, int[] v3) {

        int i;

        // Percorrendo o Vetor3 e concatenando simultaneamente
        for(i=0;i<3;i++)
        {
            // Aqui o Vetor3 está copiando os valores dos dois vetores ao mesmo tempo
            v3[i] = v1[i]; // Copiando Vetor1 para Vetor3
            v3[i+3] = v2[i]; // Copiando Vetor2 para Vetor3
        }

        // Percorrendo e mostrando o Vetor3
        for(i=0;i<6;i++)
        {
            JOptionPane.showMessageDialog(null, "Vetor Nº3 ["+i+"] = "+ v3[i]);
        }
    } // Fim Vetor3
}
