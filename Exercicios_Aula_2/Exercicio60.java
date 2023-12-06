import javax.swing.*;;
public class Exercicio60 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o tamanho do vetor."));
        int iVetor[] = new int[n];
        digita_vetor(iVetor);
        OrdenacaoTrocasInt(iVetor);

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
    public static void OrdenacaoTrocasInt(int iVet[]){
        int iA, iB, iT;

        for (iA=1; iA < iVet.length; iA++){
            for (iB = iVet.length-1 ; iB >= iA; iB --){
                if(iVet[iB-1] > iVet[iB]){
                    iT = iVet[iB-1];
                    iVet[iB-1] = iVet[iB];
                    iVet[iB] = iT;
                }
            }
        }
    }

}
