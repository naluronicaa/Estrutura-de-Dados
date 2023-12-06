import javax.swing.*;
public class Exercicio49{
    public static void main(String Arg[]){
        String sIO;
        int iN, iPos;
        int iVetor[] = new int[10];

        JOptionPane.showMessageDialog(null, "Busca Linear em vetor int de tamanho fixo"+iVetor.length, "ALEGED-Exe32", JOptionPane.PLAIN_MESSAGE);

        digita_vetor(iVetor);

        iN=Integer.parseInt(JOptionPane.showInputDialog(null, "Número de busca:" , "Digite" , JOptionPane.QUESTION_MESSAGE));

        iPos=busca_binaria_recursiva(iVetor,0 , 9, iN);

        if (iPos == -1){
            sIO="O número de busca linear não se encontra no vetor";
            JOptionPane.showMessageDialog(null, sIO, "Atenção", JOptionPane.WARNING_MESSAGE);
        }
        else{
            sIO="O número de busca linear "+iN+" está no índice "+iPos+" do vetor.";
            JOptionPane.showMessageDialog(null, sIO, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
        System.exit(0);
    }

    public static void digita_vetor(int iVet[]){
        int iT;
        
        for(iT=0; iT<iVet.length; iT++){
            iVet[iT] = Integer.parseInt(JOptionPane.showInputDialog(null, "Elemento do índice "+iT+" do vetor:", "Digite", JOptionPane.QUESTION_MESSAGE));
        }
    }

    public static int busca_binaria_recursiva(int iV[], int iB, int iA, int iK){
        int iM = (iB + iA)/2;
        if (iB <= iA)
            if (iK < iV[iM]) return busca_binaria_recursiva(iV, iB, iM - 1, iK);
            else if (iK > iV[iM]) return busca_binaria_recursiva(iV, iM + 1, iA, iK);
                else return iM;
        return -1;
    }
}
