import javax.print.DocFlavor.STRING;
import javax.swing.*;
public class Exercicio21 {
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
                    i = f.popFront();
                    JOptionPane.showMessageDialog(null, "O nome "+i+" Foi retirado, a fila pode receber um novo valor agora!");
                }else{
                    String n  = JOptionPane.showInputDialog(null, "Digite um Nome: ");
                    f.pushFront(n);
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
                        String nMM = f.popFront();
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
    String iDEQue [ ] = new String [ iTAM ];
    int iBPos = 0;
    int iFPos = 0;
    boolean bDEQueFull = false;

    int size( )
    {
    if( iBPos >= iFPos && !bDEQueFull) return iBPos - iFPos;
    else return iBPos + iDEQue.length - iFPos;
    }

    String back( ) {
    if( iBPos == 0 ) return iDEQue[ iDEQue.length - 1 ];
    return iDEQue[ iBPos - 1 ];
    }

    String front( ) {
    return iDEQue[ iFPos ]; 
    }

    boolean isOver( )
    {
    if( iBPos == iFPos && bDEQueFull ) return true;
    return false;
    }
    boolean isEmpty( )
    {
    if( iBPos == iFPos && !bDEQueFull ) return true;
    return false;
    }
    String popBack( ) {
        if( --iBPos < 0) iBPos = iDEQue.length
        - 1;
        bDEQueFull = false;
        return iDEQue[ iBPos ]; }
    
    String popFront( ) {
        int iIndice = iFPos++;
        if( iFPos >= iDEQue.length ) iFPos = 0;
        bDEQueFull = false;
        return iDEQue[ iIndice ]; }

    void pushBack( String iN ) {
        iDEQue[ iBPos++ ] = iN;
        if( iBPos >= iDEQue.length ) iBPos = 0;
        if( iBPos == iFPos ) bDEQueFull = true; }
            
    void pushFront( String iN ) {
        if( --iFPos < 0 ) iFPos = iDEQue.length- 1;
        if( iFPos == iBPos ) bDEQueFull = true;
        iDEQue[ iFPos ] = iN; }
}



