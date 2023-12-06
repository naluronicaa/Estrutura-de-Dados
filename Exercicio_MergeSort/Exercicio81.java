import javax.swing.*;
public class Exercicio81 {
    public static void main(String[] args) {
        double dVetor[] = new double[20];
        digita_vetor(dVetor);

        mergeSort(dVetor);

        String saida = "";
        for (int x = 0; x<dVetor.length ; x++){
            saida = saida + dVetor[x] + " ";
        }

        JOptionPane.showMessageDialog(null, "O vetor ordenado de forma crescente é: " + saida);
    }
    public static void digita_vetor(double dVet[]){
        for(int iT=0; iT<dVet.length; iT++){
            dVet[iT] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um número"));
        }
    }
    public static void mergeSort(double Vet[]){
        if (Vet.length > 1){
            int t1 = Vet.length/2;
            int t2 = Vet.length-t1;
            double v1[] = new double[t1];
            double v2[] = new double[t2];

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
    public static void merge (double Vet[], double v1[], double v2[]){
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
