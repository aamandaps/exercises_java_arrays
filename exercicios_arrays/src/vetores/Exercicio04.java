package vetores;

import javax.swing.JOptionPane;

/*Criar e coletar em um vetor [30] real e calcular e exibir:
    - A média do grupo;
    - A quantidade de notas acima da média do grupo;
    - As posições dos valores abaixo da média do grupo.*/

public class Exercicio04 {

    public static void main (String[] args) {

        Double[] vetor = new Double[30]; // Criação e inicialização do vetor
        Double media=0.0;
        int opc=0;

        while (opc!=5)
        {

            opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:\n1 - Carregar o Vetor;\n2 - Calcular média das notas\n3 - Ver quantidade de notas acima da média;\n4 - Ver quantidade de notas abaixo da média;\n5 - Finalizar Execução."));

            switch (opc)
            {
                case 1:
                    vetor = CarregarVetor(vetor);
                break;

                case 2:
                    media = CalcMedia(vetor);
                    JOptionPane.showMessageDialog(null, "Média = "+ String.format("%.2f", media));
                break;

                case 3:
                    JOptionPane.showMessageDialog(null, "Quantidade de notas acima da média: "+ QntAcima(vetor, media));
                break;

                case 4:
                    JOptionPane.showMessageDialog(null, "Quantidade de notas abaixo da média: "+ QntAbaixo(vetor, media));
                break;

                case 5:
                    JOptionPane.showMessageDialog(null, "FIM");
                System.exit(0);

                default: JOptionPane.showMessageDialog(null,"Opção Inválida.");
            } // Fim Switch-Case
        } // Fim Loop
    } // Fim Main

    // Função CarregaVetor
    public static Double[] CarregarVetor(Double[] vet) {

        int i;

        // Loop percorre vetor
        for(i=0;i<30;i++)
        {
            vet[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota: "));
        }

        return vet;
    } // Fim CarregaVetor

    // Função Cálculo da Média
    public static Double CalcMedia(Double[] vet) {

        double soma=0.0;
        int i;

        // Loop percorre vetor
        for(i=0;i<30;i++)
        {
            soma += vet[i];
        }

        return (soma/30);
    } // Fim Cálculo da Média

    public static int QntAcima(Double[] vet, Double media) {

        int i,qnt=0;

        // Loop percorre vetor
        for(i=0;i<30;i++)
        {
            // Verificação
            if(vet[i]>media)
            {
                qnt +=1;
            }
        } // Fim Loop

        return qnt;
    } // Fim Acima da Média

    public static int QntAbaixo(Double[] vet, Double media) {

        int i, qnt=0;

        // Loop percorre vetor
        for(i=0;i<30;i++)
        {
            // Verificação
            if(vet[i]<media)
            {
                qnt+=1;
            }
        } // Fim Loop

        return qnt;
    } // Fim Abaixo da Média
}
