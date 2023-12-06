import javax.swing.*;
public class Exercicio77 {
    public static void main(String[] args) {
        char cVetor[] =  new char[5];
        digita_vetor(cVetor);
        int Cont = 0;
        Cont++;
        Cont = OrdenacaoQuickSortChar(cVetor, 0, 4, Cont);

        JOptionPane.showMessageDialog(null, "A quantidade de operações realizadas foram: " + Cont);

    }

    public static void digita_vetor(char cVet[]){
        for(int iT=0; iT<cVet.length; iT++){
            String s = JOptionPane.showInputDialog(null, "Digite um caractere");
            cVet[iT] = s.charAt(0);
        }
    }

    public static int OrdenacaoQuickSortChar(char cVet[], int iBaixo, int iAlto, int Cont){
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
        if (iBaixo < iP){
            Cont++;
            Cont = OrdenacaoQuickSortChar(cVet, iBaixo, iP-1, Cont);
        }
        if (iAlto > iP) {
            Cont++;
            Cont = OrdenacaoQuickSortChar(cVet, iP+1, iAlto, Cont);
        }

        return Cont;
    }
}
