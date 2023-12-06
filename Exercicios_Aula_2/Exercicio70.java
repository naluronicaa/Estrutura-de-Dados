import javax.swing.*;
public class Exercicio70 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o tamanho do vetor."));
        int iVetor[] = new int[n];
        digita_vetor(iVetor);


        String saida = "";

        for (int x = 0; x<5 ; x++){
            saida = saida + iVetor[x] + " ";
        }

        JOptionPane.showMessageDialog(null, "O vetor ordenado de forma crescente é: " + saida);
    }
    public static void digita_vetor(int iVet[]){
        int iT;
        
        for(iT=0; iT<iVet.length; iT++){
            iVet[iT] = Integer.parseInt(JOptionPane.showInputDialog(null, "Elemento do índice "+iT+" do vetor:", "Digite", JOptionPane.QUESTION_MESSAGE));
        }
    }
    public static void OrdenacaoInsercao(int iVet[]){
        int iA, iB, iT;

        for(iA = 1 ; iA < iVet.length ; iA++){
            iT = iVet[iA];
            iB=iA-1;
            while(iB >= 0 && iT < iVet[iB]){
                iVet[iB+1] = iVet[iB];
                iB--;
            }
            iVet[iB+1] = iT;
        }

    }
}
