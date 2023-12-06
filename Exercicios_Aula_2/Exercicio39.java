import javax.swing.*;
public class Exercicio39 {
    public static void main(String Args []){
        int iN, iPos;
        int iVetor[] = new int[10];

        digita_vetor(iVetor);

        iN = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a chave de busca:"));

        iPos = busca_linear_recursiva(iVetor, 1, iN);

        if(iPos < iVetor.length){
            JOptionPane.showMessageDialog(null, "O número escolhido não está no vetor.");
        }else{
            JOptionPane.showMessageDialog(null, "O número " +iN+ " se encontra no vetor, e está no índice ímpar:" +iPos);
        }

    }

    public static void digita_vetor(int iVet[]){
        int iT;
        
        for(iT=0; iT<iVet.length; iT++){
            iVet[iT] = Integer.parseInt(JOptionPane.showInputDialog(null, "Elemento do índice "+iT+" do vetor:", "Digite", JOptionPane.QUESTION_MESSAGE));
        }
    }

    public static int busca_linear_recursiva(int iV[], int iT, int iK){
        if ((iT <= iV.length) && (iK != iV[iT]))
            return busca_linear_recursiva(iV, iT+2, iK);
        return iT;
    }

}
