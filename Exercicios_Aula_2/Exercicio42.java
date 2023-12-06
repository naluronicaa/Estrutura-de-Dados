import javax.swing.*;
public class Exercicio42 {
    public static void main(String Args[]){
        char cVetor[] = new char[10];
        digita_vetor(cVetor);
        String s = JOptionPane.showInputDialog(null, "Digite um caractere para a busca.");
        char cK = s.charAt(0);
        int iPos = busca_binaria(cVetor, cK);

        if (iPos == -1){
            JOptionPane.showMessageDialog(null, "O caractere digitado não se encontra no vetor");
        }
        else{
            JOptionPane.showMessageDialog(null, "O caractere digitado se encontra no índice " +iPos+ " do vetor.");
        }
        System.exit(0);

    }
    public static void digita_vetor(char cVet[]){
        for(int iT=0; iT<cVet.length; iT++){
            String s = JOptionPane.showInputDialog(null, "Digite um caractere em ordem crescente");
            cVet[iT] = s.charAt(0);
        }
    }

    public static int busca_binaria(char cVet[], char cK){
        int iBaixo, iAlto, iMeio;
        iBaixo = 0;
        iAlto = cVet.length-1;
        while (iBaixo<=iAlto){
            iMeio = (iBaixo+iAlto)/2;
            if(cK < cVet[iMeio]) iAlto=iMeio-1;
            else if(cK > cVet[iMeio]) iBaixo= iMeio+1;
                else return iMeio;
        }
        return -1;
    }
}
