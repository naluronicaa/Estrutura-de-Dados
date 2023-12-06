import javax.swing.*;
public class Exercicio8{
    public static void main(String[] args) {
        int opicao = 0;
        do {
            opicao = Integer.parseInt(JOptionPane.showInputDialog(null, "Bem vindo(a)!\nEscolha a operação que deseja realizar \n1. Inserir Elemento na Fila \n2. Consultar Elemento da Fila\n3. Retirar Elemento da Fila. \n4. Sair."));

            switch(opicao){
                case 1:  
                if(isOver()){
                    JOptionPane.showMessageDialog(null, "A fila está cheia!");
                    int i = front();
                    i = deQueueC();
                    JOptionPane.showMessageDialog(null, "O número "+i+" Foi retirado, a fila pode receber um novo valor agora!");
                }else{
                    int n  = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um Valor: "));
                    enQueueC(n);  
                    JOptionPane.showMessageDialog(null, "Número inserido com sucesso!");
                }
                    break;
                case 2:
                    if (size() == 0){
                        JOptionPane.showMessageDialog(null, "Não há itens na Fila");
                    }else{
                        int nM  = front();
                        JOptionPane.showMessageDialog(null, "O primeiro número da fila é "+nM);
                    }
                    break;
                case 3:
                    if (size() == 0){
                        JOptionPane.showMessageDialog(null, "Não há itens na Fila");
                    }else{
                        int nMM = deQueueC();
                        JOptionPane.showMessageDialog(null, "O número "+nMM+" foi retirado da Fila!");
                    }
                    break;
                case 4:
                    opicao = 4;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opição Inválida");
                    break;
            }
        } while (opicao != 4);
    }

    public static int iTAM = 10;
    public static int iFila [ ] = new int [ iTAM ];
    public static int iSPos = 0;
    public static int iRPos = 0;
    public static boolean bQueueFull = false;

    public static int size ( )
    {
    if ( iSPos >= iRPos && ! bQueueFull ) return iSPos - iRPos;
    else return iSPos + iFila.length - iRPos;
    }
    public static int front ( )
    {
    return iFila [ iRPos ];
    }

    public static boolean isOver ( )
    {
    if ( iSPos == iRPos && bQueueFull ) return true;
    return false;
    }

    public static void enQueueC ( int iC )
    {
    iFila [ iSPos++ ] = iC;
    if ( iSPos >= iFila.length ) iSPos=0;
    if( iSPos == iRPos) bQueueFull = true;
    }

    public static int deQueueC ( ) 
    {
        int iIndice = iRPos++;
        if ( iRPos >= iFila.length ) iRPos = 0;
        bQueueFull = false;
        return iFila [ iIndice ]; 
    }  
}
