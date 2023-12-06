import javax.swing.*;
public class Exercicio14 {
    public static void main(String[] args) {
        int opicao = 0;
        
        do {
            opicao = Integer.parseInt(JOptionPane.showInputDialog(null, "Bem vindo(a)!\nEscolha a operação que deseja realizar \n1. Inserir Nome na Fila \n2. Consultar Nome da Fila\n3. Retirar Nome da Fila. \n4. Sair."));
            Fila f = new Fila();
            switch(opicao){
                case 1:  
                if(f.isOver()){
                    JOptionPane.showMessageDialog(null, "A fila está cheia!");
                    String i = f.front();
                    i = f.deQueueC();
                    JOptionPane.showMessageDialog(null, "O nome "+i+" Foi retirado, a fila pode receber um novo valor agora!");
                }else{
                    String n  = JOptionPane.showInputDialog(null, "Digite um Nome: ");
                    f.enQueueC(n);
                    JOptionPane.showMessageDialog(null, "Nome inserido com sucesso!");
                }
                    break;
                case 2:
                    if (f.size() == 0){
                        JOptionPane.showMessageDialog(null, "Não há itens na Fila");
                    }else{
                        String nM  = f.front();
                        JOptionPane.showMessageDialog(null, "O primeiro nome da fila é "+nM);
                    }
                    break;
                case 3:
                    if (f.size() == 0){
                        JOptionPane.showMessageDialog(null, "Não há itens na Fila");
                    }else{
                        String nMM = f.deQueueC();
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
    String iFila [ ] = new String [ iTAM ];
    int iSPos = 0;
    int iRPos = 0;
    boolean bQueueFull = false;

    int size ( )
    {
    if ( iSPos >= iRPos && ! bQueueFull ) return iSPos - iRPos;
    else return iSPos + iFila.length - iRPos;
    }
    String front ( )
    {
    return iFila [ iRPos ];
    }

    boolean isOver ( )
    {
    if ( iSPos == iRPos && bQueueFull ) return true;
    return false;
    }

    void enQueueC ( String iC )
    {
    iFila [ iSPos++ ] = iC;
    if ( iSPos >= iFila.length ) iSPos=0;
    if( iSPos == iRPos) bQueueFull = true;
    }

    String deQueueC ( ) 
    {
        int iIndice = iRPos++;
        if ( iRPos >= iFila.length ) iRPos = 0;
        bQueueFull = false;
        return iFila [ iIndice ]; 
    } 
}
