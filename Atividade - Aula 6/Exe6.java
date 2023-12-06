import javax.swing.*;
public class Exe6 {
    public static void main(String[] args) {
        int i = 0;
        Pilha p = new Pilha();
        for ( ;i++ < p.iTAM; ){
            int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número"));
            p.push(n);
        }
        char cv[] = new char[4];
        for(int j=0; j<cv.length; j++){
            String s = JOptionPane.showInputDialog(null, "Digite uma operação; \n'+'\n'-'\n'/'\n'*'");
            cv[j] = s.charAt(0);
        }

        for(int k=0; k < cv.length; k++){
            if (cv[k] == '+'){
                int n1 = p.top();
                p.pop();
                int n2 = p.top();
                p.pop();
                int s = n1 + n2;
                p.push(s);
                JOptionPane.showMessageDialog(null, p.top());
            }else if(cv[k] == '-'){
                int n1 = p.top();
                p.pop();
                int n2 = p.top();
                p.pop();
                int sub = n1 - n2;
                p.push(sub);
                JOptionPane.showMessageDialog(null, p.top());
            }else if(cv[k] == '*'){
                int n1 = p.top();
                p.pop();
                int n2 = p.top();
                p.pop();
                int m = n1 * n2;
                p.push(m);
                JOptionPane.showMessageDialog(null, p.top());
            }else if(cv[k] == '/'){
                int n1 = p.top();
                p.pop();
                int n2 = p.top();
                p.pop();
                int d = n1 / n2;
                p.push(d);
                JOptionPane.showMessageDialog(null, p.top());
            }
        }
    }
}
class Pilha{
    int iTAM = 10;
    int iPilha[] = new int[iTAM];
    int iPos = 0;
    int i = 0;

    int size(){
        return iPos;
    }
    int top(){
        return iPilha[i];
    }
    int push(int iC){
        if(iPos >= iTAM) return 0;
        return iPilha[iPos++] = iC;
    }
    int pop(){
        if (iPos == 0) return 0;
        return iPilha[++i];
    } 
}