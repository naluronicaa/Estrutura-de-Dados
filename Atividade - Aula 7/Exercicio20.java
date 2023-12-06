import javax.swing.*;
public class Exercicio20 {
    public static void main(String[] args) {
        Fila f = new Fila();
        int i = 0;
        for ( ;i++ < f.iTAM; ){
            int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número"));
            f.pushFront(n);
        }
        char cv[] = new char[4];
        for(int j=0; j<cv.length; j++){
            String s = JOptionPane.showInputDialog(null, "Digite uma operação; \n'+'\n'-'\n'/'\n'*'");
            cv[j] = s.charAt(0);
        }

        for(int k=0; k < cv.length; k++){
            if (cv[k] == '+'){
                int n1 = f.front();
                f.popFront();
                int n2 = f.front();
                f.popFront();
                int s = n1 + n2;
                f.pushFront(i);
                JOptionPane.showMessageDialog(null, f.front());
            }else if(cv[k] == '-'){
                int n1 = f.front();
                f.popFront();
                int n2 = f.front();
                f.popFront();
                int sub = n1 - n2;
                f.pushFront(sub);
                JOptionPane.showMessageDialog(null, f.front());
            }else if(cv[k] == '*'){
                int n1 = f.front();
                f.popFront();
                int n2 = f.front();
                f.popFront();
                int m = n1 * n2;
                f.pushFront(m);
                JOptionPane.showMessageDialog(null, f.front());
            }else if(cv[k] == '/'){
                int n1 = f.front();
                f.popFront();
                int n2 = f.front();
                f.popFront();
                int d = n1 / n2;
                f.pushFront(d);
                JOptionPane.showMessageDialog(null, f.front());
            }
        }
    }
}

class Fila{
    int iTAM = 10;
    int iDEQue [ ] = new int [ iTAM ];
    int iBPos = 0;
    int iFPos = 0;
    boolean bDEQueFull = false;

    int size( )
    {
    if( iBPos >= iFPos && !bDEQueFull) return iBPos - iFPos;
    else return iBPos + iDEQue.length - iFPos;
    }

    int back( ) {
    if( iBPos == 0 ) return iDEQue[ iDEQue.length - 1 ];
    return iDEQue[ iBPos - 1 ];
    }

    int front( ) {
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
    int popBack( ) {
        if( --iBPos < 0) iBPos = iDEQue.length
        - 1;
        bDEQueFull = false;
        return iDEQue[ iBPos ]; }
    
    int popFront( ) {
        int iIndice = iFPos++;
        if( iFPos >= iDEQue.length ) iFPos = 0;
        bDEQueFull = false;
        return iDEQue[ iIndice ]; }

    void pushBack( int iN ) {
        iDEQue[ iBPos++ ] = iN;
        if( iBPos >= iDEQue.length ) iBPos = 0;
        if( iBPos == iFPos ) bDEQueFull = true; }
            
    void pushFront( int iN ) {
        if( --iFPos < 0 ) iFPos = iDEQue.length- 1;
        if( iFPos == iBPos ) bDEQueFull = true;
        iDEQue[ iFPos ] = iN; }
}

