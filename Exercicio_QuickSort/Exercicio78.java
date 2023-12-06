import javax.swing.*;
public class Exercicio78 {
    public static void main(String[] args) {
        char cVetor[] =  new char[10];
        digita_vetor(cVetor);

        OrdenacaoQuickSortChar(cVetor, 0, 9);

        String s = JOptionPane.showInputDialog(null, "Digite um caractere para a busca");
        char cK = s.charAt(0);

        int iPos = BuscaBinariaRec(cVetor, 0, 9, cK);

        if (iPos >= 0){
            JOptionPane.showMessageDialog(null, "O caractere está localizado no índice "+ iPos + " do Vetor.");
        } else{
            JOptionPane.showMessageDialog(null, "O caractere não está localizado no vetor");
        }
    }

    public static void digita_vetor(char cVet[]){
        for(int iT=0; iT<cVet.length; iT++){
            String s = JOptionPane.showInputDialog(null, "Digite um caractere");
            cVet[iT] = s.charAt(0);
        }
    }

    public static void OrdenacaoQuickSortChar(char cVet[], int iBaixo, int iAlto){
        int iP, iB, iA;
        char cPivot;

        iB= iBaixo;
        iA= iAlto;
        cPivot= cVet[iBaixo];

        while(iBaixo < iAlto){
            while((cVet[iAlto] >= cPivot) && (iBaixo < iAlto)) iAlto--;
            if(iBaixo != iAlto){
                cVet[iBaixo] = cVet[iAlto];
                iBaixo++;
            }
            while((cVet[iBaixo] <= cPivot) && (iBaixo < iAlto)) iBaixo++;
            if(iBaixo != iAlto){
                cVet[iAlto] = cVet[iBaixo];
                iAlto--;
            }
            
        }

        cVet[iBaixo]= cPivot;
        iP = iBaixo;
        iBaixo = iB;
        iAlto = iA;
        if (iBaixo < iP) OrdenacaoQuickSortChar(cVet, iBaixo, iP-1);
        if (iAlto > iP) OrdenacaoQuickSortChar(cVet, iP+1, iAlto);
    }

    public static int BuscaBinariaRec(char cVet[], int iB, int iA, char cK){
        int iM = (iB+iA)/2;
        if (iB <= iA)
            if (cK < cVet[iM]) return BuscaBinariaRec(cVet, iB, iM - 1, cK);
            else if (cK > cVet[iM]) return BuscaBinariaRec(cVet, iM + 1, iA, cK);
                else return iM;
        return -1;
    }
}
