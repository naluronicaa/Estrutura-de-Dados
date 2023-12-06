import javax.swing.*;
public class Exercicio13 {
    public static void main(String[] args) {
        Fila f = new Fila();
        int i = 0;
        for ( ;i++ < f.iTAM; ){
            int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número"));
            f.enQueueC(n);
        }
        char cv[] = new char[4];
        for(int j=0; j<cv.length; j++){
            String s = JOptionPane.showInputDialog(null, "Digite uma operação; \n'+'\n'-'\n'/'\n'*'");
            cv[j] = s.charAt(0);
        }

        for(int k=0; k < cv.length; k++){
            if (cv[k] == '+'){
                int n1 = f.front();
                f.deQueueC();
                int n2 = f.front();
                f.deQueueC();
                int s = n1 + n2;
                f.enQueueC(s);
                JOptionPane.showMessageDialog(null, f.front());
            }else if(cv[k] == '-'){
                int n1 = f.front();
                f.deQueueC();
                int n2 = f.front();
                f.deQueueC();
                int sub = n1 - n2;
                f.enQueueC(sub);
                JOptionPane.showMessageDialog(null, f.front());
            }else if(cv[k] == '*'){
                int n1 = f.front();
                f.deQueueC();
                int n2 = f.front();
                f.deQueueC();
                int m = n1 * n2;
                f.enQueueC(m);
                JOptionPane.showMessageDialog(null, f.front());
            }else if(cv[k] == '/'){
                int n1 = f.front();
                f.deQueueC();
                int n2 = f.front();
                f.deQueueC();
                int d = n1 / n2;
                f.enQueueC(d);
                JOptionPane.showMessageDialog(null, f.front());
            }
        }
    }
}

class Fila{
    int iTAM = 10;
    int iFila [ ] = new int [ iTAM ];
    int iSPos = 0;
    int iRPos = 0;
    boolean bQueueFull = false;

    int size ( )
    {
    if ( iSPos >= iRPos && ! bQueueFull ) return iSPos - iRPos;
    else return iSPos + iFila.length - iRPos;
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
    if ( iSPos >= iFila.length ) iSPos=0;
    if( iSPos == iRPos) bQueueFull = true;
    }

    int deQueueC ( ) 
    {
        int iIndice = iRPos++;
        if ( iRPos >= iFila.length ) iRPos = 0;
        bQueueFull = false;
        return iFila [ iIndice ]; 
    } 
}