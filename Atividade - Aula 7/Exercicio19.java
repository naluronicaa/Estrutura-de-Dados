import javax.swing.*;
public class Exercicio19 {
    public static void main(String[] args) {
        int i = 0;
        for ( ;i++ < iTAM; ){
            int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número"));
            pushFront(n);
        }
        char cv[] = new char[4];
        for(int j=0; j<cv.length; j++){
            String s = JOptionPane.showInputDialog(null, "Digite uma operação; \n'+'\n'-'\n'/'\n'*'");
            cv[j] = s.charAt(0);
        }

        for(int k=0; k < cv.length; k++){
            if (cv[k] == '+'){
                int n1 = front();
                popFront();
                int n2 = front();
                popFront();
                int s = n1 + n2;
                pushFront(i);
                JOptionPane.showMessageDialog(null, front());
            }else if(cv[k] == '-'){
                int n1 = front();
                popFront();
                int n2 = front();
                popFront();
                int sub = n1 - n2;
                pushFront(sub);
                JOptionPane.showMessageDialog(null, front());
            }else if(cv[k] == '*'){
                int n1 = front();
                popFront();
                int n2 = front();
                popFront();
                int m = n1 * n2;
                pushFront(m);
                JOptionPane.showMessageDialog(null, front());
            }else if(cv[k] == '/'){
                int n1 = front();
                popFront();
                int n2 = front();
                popFront();
                int d = n1 / n2;
                pushFront(d);
                JOptionPane.showMessageDialog(null, front());
            }
        }
    }

    public static int iTAM = 5;
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
