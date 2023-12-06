import javax.swing.*;
public class Exercicio76 {
    public static void main(String[] args) {
        double dVetor[] = new double[20];
        digita_vetor(dVetor);

        String saida = "";

        OrdenacaoQuickSortChar(dVetor, 0, 19);        

        for (int x = 0; x<20 ; x++){
            saida = saida + dVetor[x] + " ";
        }

        JOptionPane.showMessageDialog(null, "O vetor ordenado de forma crescente é: " + saida);

    }

    public static void digita_vetor(double dVet[]){
        for(int iT=0; iT<dVet.length; iT++){
            dVet[iT] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um número"));
        }
    }

    public static void OrdenacaoQuickSortChar(double dVet[], int iBaixo, int iAlto){
        int iP, iB, iA;
        double dPivot;

        iB= iBaixo;
        iA= iAlto;
        dPivot= dVet[iBaixo];

        while(iBaixo < iAlto){
            while((dVet[iAlto] >= dPivot) && (iBaixo < iAlto))
                iAlto--;
            if(iBaixo != iAlto){
                dVet[iBaixo] = dVet[iAlto];
                iBaixo++;
            }
            while((dVet[iBaixo] <= dPivot) && (iBaixo < iAlto))
                iBaixo++;

            if(iBaixo != iAlto){
                dVet[iAlto] = dVet[iBaixo];
                iAlto--;
            }
        }

        dVet[iBaixo]= dPivot;
        iP = iBaixo;
        iBaixo = iB;
        iAlto = iA;
        if (iBaixo < iP) OrdenacaoQuickSortChar(dVet, iBaixo, iP-1);
        if (iAlto > iP) OrdenacaoQuickSortChar(dVet, iP+1, iAlto);
    }
}
