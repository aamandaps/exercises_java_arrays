package matrizes;

import javax.swing.JOptionPane;

/*Criar e carregar uma matriz [4][3] inteiro com quantidade de produtos vendidos em 4 semanas. Calcular e exibir:
    - A quantidade de cada produto vendido no mês;
    - A quantidade de produtos vendidos por semana;
    - O total de produtos vendidos no mês.*/

public class Exercicio01 {

    // Variáveis Globais
    static int Mat[][] = new int[4][3];
    static int i, j; //i = semanas, j = produtos

    public static void main (String[] args) {

        int opc=0;

        Mat = CarregaMat();

        // Loop Switch-Case
        while (opc!=4)
        {

            opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções:\n 1 - Visualizar a quantidade de cada produto vendido no mês;\n 2 - Visualizar a quantidade de cada produto vendido por semana;\n 3 - Visualizar a quantidade total de produtos vendidos no mês;\n 4 - Finalizar Execução."));

            switch (opc)
            {
                case 1:
                    ProdutoMes(Mat);
                break;

                case 2:
                    ProdutoSemana(Mat);
                break;

                case 3:
                    JOptionPane.showMessageDialog(null, "Quantidade total de produtos do mês = "+ ProdutoTotal(Mat));
                break;

                case 4:
                    JOptionPane.showMessageDialog(null, "FIM");
                System.exit(0);

                default:JOptionPane.showMessageDialog(null, "Opção Inválida");
            } // Fim Switch-Case
        } // Fim Loop
    } // Fim Main

    // Função CarregaMat
    public static int[][] CarregaMat()
    {
        //Loop que percorre a matriz
        for(i=0;i<4;i++)
        {
            for(j=0;j<3;j++)
            {
                Mat[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quant. do produto Nº"+(j+1)));
            }
        }

        return Mat;
    } // Fim CarregaMat

    // Procedimento que calcula quantidade de cada produto vendido no mês
    public static void ProdutoMes(int mat[][]) {

        int prod_mes;

        // Percorre os produtos
        for(j=0;j<3;j++)
        {
            prod_mes =0; // Vai inicializar a quant. de produto

            // Percorre as semanas
            for(i=0;i<4;i++)
            {
                prod_mes += mat[i][j];
            }

            JOptionPane.showMessageDialog(null,"Quant. do Produto Nº"+(j+1)+" = "+prod_mes);

        } // Fim Loop

    } // Fim ProdutoMes

    // Procedimento que calcula a quantidade de produtos vendidos por semana
    public static void ProdutoSemana(int mat[][]) {

        int prod_semana;

        // Percore primeiro as semanas
        for(i=0;i<4;i++)
        {
            prod_semana=0; // Vai inicializar os produtos da semana

            // Percorre os produtos
            for(j=0;j<3;j++)
            {
                prod_semana += mat[i][j];
            }

            JOptionPane.showMessageDialog(null,"Quant. de produtos da Semana "+(i+1)+" = "+prod_semana);
        } // Fim Loop

    } // Fim ProdutoSemana

    // Função que calcula o total
    public static int ProdutoTotal(int mat[][]) {

        int total=0;

        // Percorre a matriz
        for(i=0;i<4;i++) // 4 semanas(linhas)
        {
            for(j=0;j<3;j++) // 3 produtos(colunas)
            {
                total+=mat[i][j];
            }
        } // Fim Loop

        return total;
    } // Fim ProdutoTotal
}


