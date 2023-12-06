import javax.swing.*;
public class Exe5 {
    public static void main(String[] args) {
        int i = 0;
        for ( ;i++ < iTAM; ){
            int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número"));
            push(n);
        }
        char cv[] = new char[4];
        for(int j=0; j<cv.length; j++){
            String s = JOptionPane.showInputDialog(null, "Digite uma operação; \n'+'\n'-'\n'/'\n'*'");
            cv[j] = s.charAt(0);
        }

        for(int k=0; k < cv.length; k++){
            if (cv[k] == '+'){
                int n1 = top();
                pop();
                int n2 = top();
                pop();
                int s = n1 + n2;
                push(s);
                JOptionPane.showMessageDialog(null, top());
            }else if(cv[k] == '-'){
                int n1 = top();
                pop();
                int n2 = top();
                pop();
                int sub = n1 - n2;
                push(sub);
                JOptionPane.showMessageDialog(null, top());
            }else if(cv[k] == '*'){
                int n1 = top();
                pop();
                int n2 = top();
                pop();
                int m = n1 * n2;
                push(m);
                JOptionPane.showMessageDialog(null, top());
            }else if(cv[k] == '/'){
                int n1 = top();
                pop();
                int n2 = top();
                pop();
                int d = n1 / n2;
                push(d);
                JOptionPane.showMessageDialog(null, top());
            }
        }
    }
    public static int iTAM = 5;
    public static int iPilha[] =  new int[iTAM];
    public static int iPos = 0;

    public static int push(int iC){
        if(iPos >= iTAM) return 0;
        return iPilha[iPos++] = iC;
    }
    public static int top(){
        return iPilha[iPos-1];
    }
    public static int pop(){
        if (iPos == 0) return 0;
        return iPilha[--iPos];
    }
}
