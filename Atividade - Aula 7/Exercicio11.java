import javax.swing.*;
public class Exercicio11 {
    public static void main(String[] args) {
        int opicao = 0;
        Fila f = new Fila();
        do {
            opicao = Integer.parseInt(JOptionPane.showInputDialog(null, "Bem vindo(a)!\nEscolha a operação que deseja realizar \n1. Inserir Elemento na Fila \n2. Consultar Elemento da Fila\n3. Retirar Elemento da Fila. \n4. Sair."));

            switch(opicao){
                case 1:  
                if(f.isOver()){
                    JOptionPane.showMessageDialog(null, "A fila está cheia!");
                    int i = f.front();
                    i = f.deQueueC();
                    JOptionPane.showMessageDialog(null, "O número "+i+" Foi retirado, a fila pode receber um novo valor agora!");
                }else{
                    int n  = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um Valor: "));
                    f.enQueueC(n);  
                    JOptionPane.showMessageDialog(null, "Número inserido com sucesso!");
                }
                    break;
                case 2:
                    if (f.size() == 0){
                        JOptionPane.showMessageDialog(null, "Não há itens na Fila");
                    }else{
                        int nM  = f.front();
                        JOptionPane.showMessageDialog(null, "O primeiro número da fila é "+nM);
                    }
                    break;
                case 3:
                    if (f.size() == 0){
                        JOptionPane.showMessageDialog(null, "Não há itens na Fila");
                    }else{
                        int nMM = f.deQueueC();
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
}

class Fila{
    int iTAM = 10;
    int iFila [ ] = new int [ iTAM ];
    int iSPos = 9;
    int iRPos = 9;
    boolean bQueueFull = false;

    int size ( )
    {
    if ( iSPos >= iRPos && ! bQueueFull ) return iRPos - iSPos;
    else return iRPos - (iSPos + iFila.length);
    }
    int front ( )
    {
    return iFila [ iRPos ];
    }

    boolean isOver ( )
    {
    if ( iSPos == iRPos && bQueueFull ) return true;
    return false;
    }

    void enQueueC ( int iC )
    {
    iFila [ iSPos++ ] = iC;
    if ( iSPos <= 0 ) iSPos=9;
    if( iSPos == iRPos) bQueueFull = true;
    }

    int deQueueC ( ) 
    {
        int iIndice = iRPos--;
        if ( iRPos >= iFila.length ) iRPos = 9;
        bQueueFull = false;
        return iFila [ iIndice ]; 
    } 
}
