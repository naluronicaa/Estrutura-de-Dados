import javax.swing.*;
public class Exercicio12 {
    public static void main(String[] args) {
        int i = 0;
        for ( ;i++ < iTAM; ){
            int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número"));
            enQueueC(n);
        }
        char cv[] = new char[4];
        for(int j=0; j<cv.length; j++){
            String s = JOptionPane.showInputDialog(null, "Digite uma operação; \n'+'\n'-'\n'/'\n'*'");
            cv[j] = s.charAt(0);
        }

        for(int k=0; k < cv.length; k++){
            if (cv[k] == '+'){
                int n1 = front();
                deQueueC();
                int n2 = front();
                deQueueC();
                int s = n1 + n2;
                enQueueC(s);
                JOptionPane.showMessageDialog(null, front());
            }else if(cv[k] == '-'){
                int n1 = front();
                deQueueC();
                int n2 = front();
                deQueueC();
                int sub = n1 - n2;
                enQueueC(sub);
                JOptionPane.showMessageDialog(null, front());
            }else if(cv[k] == '*'){
                int n1 = front();
                deQueueC();
                int n2 = front();
                deQueueC();
                int m = n1 * n2;
                enQueueC(m);
                JOptionPane.showMessageDialog(null, front());
            }else if(cv[k] == '/'){
                int n1 = front();
                deQueueC();
                int n2 = front();
                deQueueC();
                int d = n1 / n2;
                enQueueC(d);
                JOptionPane.showMessageDialog(null, front());
            }
        }
    }
    public static int iTAM = 5;
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

