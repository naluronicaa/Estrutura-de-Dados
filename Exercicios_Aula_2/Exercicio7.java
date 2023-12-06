import javax.swing.*;

public class Exercicio7 {
    public static void main(String[] args) {
        int N = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor para as linhas da matriz"));
        int M = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor para as colunas da matriz"));
        int [][] matriz = criaMatriz(N,M);

        impimeMatriz(matriz);

        int [][] transposta = transposta(matriz);

        impimeMatriz(transposta);
    }

    public static int [][] criaMatriz(int N, int M){
        int [][] matriz = new int[N][M];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor para a matriz"));
            }
        }
        return matriz;
    }

    public static int [][] transposta(int [][] matriz){
        int [][] matrizTransposta = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matrizTransposta.length; i++){
            for (int j = 0; j < matrizTransposta[0].length; j++){
                matrizTransposta[i][j] = matriz[j][i];
            }
        }
        return matrizTransposta;
    }

    public static void impimeMatriz(int [][] matriz){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                JOptionPane.showMessageDialog(null, matriz[i][j] + "\n");
            }
        }
    }
}
