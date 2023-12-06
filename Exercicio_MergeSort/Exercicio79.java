import javax.swing.*;
public class Exercicio79{
    public static void main(String[] args) {
        char cVetor[] = new char[5];
        digita_vetor(cVetor);

        mergeSort(cVetor);

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
}