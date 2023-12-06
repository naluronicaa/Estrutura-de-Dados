import javax.swing.*;
public class Exercicio83 {
    public static void main(String[] args) {
        char cVetor[] =  new char[10];
        digita_vetor(cVetor);   
        mergeSort(cVetor);
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

    public static void mergeSort(char cVet[]){
        if (cVet.length > 1){
            int t1 = cVet.length/2;
            int t2 = cVet.length-t1;
            char v1[] = new char[t1];
            char v2[] = new char[t2];

            for( int i  = 0; i < t1; i++){
                v1[i] = cVet[i];
            }
            for( int i = t1; i < (t1+t2); i++){
                v2[i-t1] = cVet[i];
            }
            mergeSort(v1);
            mergeSort(v2);
            merge(cVet, v1, v2);
        }
    }
    public static void merge (char cVet[], char v1[], char v2[]){
        int i = 0, j = 0, k = 0;
        while (v1.length != j && v2.length != k){
            if (v1[j] <= v2[k]){
                cVet[i] = v1[j];
                i++;
                j++;
            }
            else{
                cVet[i] = v2[k];
                i++;
                k++;
            }
        }
        while(v1.length != j){
            cVet[i] = v1[j];
            i++;
            j++;
        }
        while(v2.length != k){
            cVet[i] = v2[k];
            i++;
            k++;
        }
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
