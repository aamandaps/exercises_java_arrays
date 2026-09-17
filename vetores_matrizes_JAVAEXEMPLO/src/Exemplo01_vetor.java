import javax.swing.JOptionPane;

public class Exemplo01_vetor {

    public static void main (String[] args) {
    
        int opc=0;
        int vetor[] = new int[4]; // Criação e inicialização do vetor
        
        // Loop para entrada de dados
        while(opc!=9)
        {
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Carrega vetor \n2 - Classifica vetor \n3 - Mostra vetor \n9 - Fim "));
            
            switch (opc)
            {
                case 1:
                    vetor = CarregaVetor(vetor);
                    break;
                
                case 2:
                    vetor = ClassificaVetor(vetor);
                    
                    JOptionPane.showMessageDialog(null, "Vetor classificado.");
                    
                    break;
                    
                case 3:
                    MostraVetor(vetor);
                    break;
                    
                case 9:
                    
                    JOptionPane.showMessageDialog(null, "FIM");
                          
                System.exit(0);
                break;
                
                default: JOptionPane.showMessageDialog(null, "Opção inválida.");
            
            } // Fim SwitchCase
        } // Fim Loop
    
    } // Fim Main
    
    public static int[] CarregaVetor(int vet[]) {
        
        int cta;
        
        // Loop Entrada dos valores
        for (cta=0;cta<4;cta++)
        {
            vet[cta] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        }
    
        return vet;
    } // Fim CarregaVetor
    
    public static int[] ClassificaVetor(int vet[]) {
        
        int i,j, aux;
    
        // Loop para ordenar os valores do vetor
        for(i=0;i<3;i++)
        {
            for (j=i+1;j<4;j++)
            {
                if (vet[i]>vet[j])
                {
                    aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;
                }
            }
        }
        return vet;
    } // Fim ClassificaVetor
    
    // Procedimento para mostar vetor
    public static void MostraVetor(int vet[]) {
    
        int cta;
        
        for (cta=0;cta<4;cta++)
        {
            JOptionPane.showMessageDialog(null,"Vetor["+cta+"] = "+vet[cta]);
        }
    } // Fim Procedimento
              
}
