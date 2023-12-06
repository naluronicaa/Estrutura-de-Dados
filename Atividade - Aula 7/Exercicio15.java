import javax.swing.*;
public class Exercicio15 {
    public static void main(String[] args) {
        int opicao = 0;
        do {
            opicao = Integer.parseInt(JOptionPane.showInputDialog(null, "Bem vindo(a)!\nEscolha a operação que deseja realizar \n1. Inserir Elemento na Fila \n2. Consultar Elemento da Fila\n3. Retirar Elemento da Fila. \n4. Sair."));

            switch(opicao){
                case 1:  
                if(isOver()){
                    JOptionPane.showMessageDialog(null, "A fila está cheia!");
                    int i = front();
                    popFront();
                    JOptionPane.showMessageDialog(null, "O número "+i+" Foi retirado, a fila pode receber um novo valor agora!");
                }else{
                    int n  = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um Valor: "));
                    pushFront(n);;  
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
                        int nMM = popFront();
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
    public static int iDEQue [ ] = new int [ iTAM ];
    public static int iBPos = 0;
    public static int iFPos = 0;
    public static boolean bDEQueFull = false;

    public static int size( )
    {
    if( iBPos >= iFPos && !bDEQueFull) return iBPos - iFPos;
    else return iBPos + iDEQue.length - iFPos;
    }

    public static int back( ) {
    if( iBPos == 0 ) return iDEQue[ iDEQue.length - 1 ];
    return iDEQue[ iBPos - 1 ];
    }

    public static int front( ) {
    return iDEQue[ iFPos ]; 
    }

    public static boolean isOver( )
    {
    if( iBPos == iFPos && bDEQueFull ) return true;
    return false;
    }
    public static boolean isEmpty( )
    {
    if( iBPos == iFPos && !bDEQueFull ) return true;
    return false;
    }
    public static int popBack( ) {
        if( --iBPos < 0) iBPos = iDEQue.length
        - 1;
        bDEQueFull = false;
        return iDEQue[ iBPos ]; }
    
    public static int popFront( ) {
        int iIndice = iFPos++;
        if( iFPos >= iDEQue.length ) iFPos = 0;
        bDEQueFull = false;
        return iDEQue[ iIndice ]; }

    public static void pushBack( int iN ) {
        iDEQue[ iBPos++ ] = iN;
        if( iBPos >= iDEQue.length ) iBPos = 0;
        if( iBPos == iFPos ) bDEQueFull = true; }
            
    public static void pushFront( int iN ) {
        if( --iFPos < 0 ) iFPos = iDEQue.length- 1;
        if( iFPos == iBPos ) bDEQueFull = true;
        iDEQue[ iFPos ] = iN; }
               
}
