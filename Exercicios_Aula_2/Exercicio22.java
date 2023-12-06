import javax.swing.*;
public class Exercicio22 {
    public static void main(String[] args) {
        int n  = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número para o índice da série de Fibonacci"));

        n = fibonacci(n);

        JOptionPane.showMessageDialog(null, "O termo digitado equivale ao número " +n+ " da sequencia de Fibonacci");
    }

    public static int fibonacci(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
