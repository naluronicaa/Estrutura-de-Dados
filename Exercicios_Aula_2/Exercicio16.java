import javax.swing.JOptionPane;
public class Exercicio16 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número para vericar se é um número par ou ímpar."));
        verifica(n);
    }
    public static void verifica(int n){
        if (n % 2 == 0){
            JOptionPane.showMessageDialog(null, "O número digitado: "+n+" é par!");
        } else{
            JOptionPane.showMessageDialog(null, "O número digitado "+n+" é ímpar");
        }
    }
}
