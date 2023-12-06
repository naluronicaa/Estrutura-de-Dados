import javax.swing.*;
public class Exercicio32{
    public static void main(String Args[]){
        String sIO;
        int iN, iPos;
        int iVetor[] = new int[15];

        JOptionPane.showMessageDialog(null, "Busca Linear em vetor int de tamanho fixo"+iVetor.length, "ALEGED-Exe32", JOptionPane.PLAIN_MESSAGE);

        digita_vetor(iVetor);

        iN=Integer.parseInt(JOptionPane.showInputDialog(null, "Número de busca:" , "Digite" , JOptionPane.QUESTION_MESSAGE));

        iPos=busca_linear(iVetor, iN);

        if (iPos >= iVetor.length){
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

    public static int busca_linear(int iVet[], int iJ){
        int iT;
        
        for(iT=0; iT<iVet.length; iT++) if(iVet[iT]==iJ) break;
        return iT;
    }
}