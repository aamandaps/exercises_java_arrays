import javax.swing.JOptionPane;

public class Exemplo02_matriz {

    // Variáveis Globais
    static int Mat[][] = new int [3][3];
    static int x, y;
    
    public static void main (String[] args) {
    
        CarregaMat();
        MostraMat();
        System.exit(0);
    
    } // Fim Main
    
    // Procedimento para carregar a matriz
    static void CarregaMat() {
    
        for (x=0;x<3;x++)
        {
            for (y=0;y<3;y++)
            {
                Mat[x][y] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));
            }
        }
    }
    
    // Procedimento para mostrar a matriz
    static void MostraMat(){
    
        for (x=0;x<3;x++)
        {
            for (y=0;y<3;y++)
            {
                JOptionPane.showMessageDialog(null, "Matriz["+x+"]["+y+"] = "+Mat[x][y]);
            }
        }
    }
    
}
