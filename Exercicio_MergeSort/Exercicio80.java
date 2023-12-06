import javax.swing.*;;
public class Exercicio80 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o tamanho do vetor desejado."));
        int iVetor[] = new int[n];
        digita_vetor(iVetor);

        mergeSort(iVetor);

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
    public static void mergeSort(int Vet[]){
        if (Vet.length > 1){
            int t1 = Vet.length/2;
            int t2 = Vet.length-t1;
            int v1[] = new int[t1];
            int v2[] = new int[t2];

            for( int i  = 0; i < t1; i++){
                v1[i] = Vet[i];
            }
            for( int i = t1; i < (t1+t2); i++){
                v2[i-t1] = Vet[i];
            }
            mergeSort(v1);
            mergeSort(v2);
            merge(Vet, v1, v2);
        }
    }
    public static void merge (int Vet[], int v1[], int v2[]){
        int i = 0, j = 0, k = 0;
        while (v1.length != j && v2.length != k){
            if (v1[j] <= v2[k]){
                Vet[i] = v1[j];
                i++;
                j++;
            }
            else{
                Vet[i] = v2[k];
                i++;
                k++;
            }
        }
        while(v1.length != j){
            Vet[i] = v1[j];
            i++;
            j++;
        }
        while(v2.length != k){
            Vet[i] = v2[k];
            i++;
            k++;
        }
    }
}
