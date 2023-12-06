import javax.swing.*;
public class Exercicio75 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o tamanho do vetor desejado."));
        int iVetor[] = new int[n];
        digita_vetor(iVetor);

        OrdenacaoQuickSortChar(iVetor, 0, n-1);

        String saida = "";

        for (int x = 0; x<n ; x++){
            saida = saida + iVetor[x] + " ";
        }

        JOptionPane.showMessageDialog(null, "O vetor ordenado de forma crescente é: " + saida);

    }

    public static void digita_vetor(int iVet[]){
        for(int iT=0; iT<iVet.length; iT++){
            iVet[iT] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número"));
        }
    }

    public static void OrdenacaoQuickSortChar(int iVet[], int iBaixo, int iAlto){
        int iP, iB, iA;
        int iPivot;

        iB= iBaixo;
        iA= iAlto;
        iPivot= iVet[iBaixo];

        while(iBaixo < iAlto){
            while((iVet[iAlto] >= iPivot) && (iBaixo < iAlto))
                iAlto--;
            if(iBaixo != iAlto){
                iVet[iBaixo] = iVet[iAlto];
                iBaixo++;
            }
            while((iVet[iBaixo] <= iPivot) && (iBaixo < iAlto))
                iBaixo++;

            if(iBaixo != iAlto){
                iVet[iAlto] = iVet[iBaixo];
                iAlto--;
            }
        }

        iVet[iBaixo]= iPivot;
        iP = iBaixo;
        iBaixo = iB;
        iAlto = iA;
        if (iBaixo < iP) OrdenacaoQuickSortChar(iVet, iBaixo, iP-1);
        if (iAlto > iP) OrdenacaoQuickSortChar(iVet, iP+1, iAlto);
    }
}
