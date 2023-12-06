import javax.swing.*;
public class Exercicio74{
    public static void main(String[] args) {
        char cVetor[] =  new char[5];
        digita_vetor(cVetor);

        OrdenacaoQuickSortChar(cVetor, 0, 4);

        String saida = "";

        for (int x = 0; x<5 ; x++){
            saida = saida + cVetor[x] + " ";
        }

        JOptionPane.showMessageDialog(null, "O vetor ordenado de forma crescente é: " + saida);

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
}