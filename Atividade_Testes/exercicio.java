//imports
import java.util.Random;
import javax.swing.JOptionPane;

//codigo
public class exercicio{
    public static void main(String[] args) {
        // Gerar vetor com 100 números inteiros randomicos
        int []vetor = gerarVetor(100);

        //Ordenar o vetor com os 100 números
         mergeSort(vetor);

         //Mostra o vetor
         String saida = "";
         for (int x = 0; x<100 ; x++){
            saida = saida + vetor[x] + " ";
        }

        JOptionPane.showMessageDialog(null, "O vetor randômico ordenado de forma crescente é: " + saida);

        //busca binária
         int iK = Integer.parseInt(JOptionPane.showInputDialog(null, "Número de busca:"));
         
         int iPos = busca_binaria(vetor, iK);
 
         if (iPos == -1){
             JOptionPane.showMessageDialog(null, "O número digitado não se encontra no vetor");
         }
         else{
             JOptionPane.showMessageDialog(null, "O número digitado se encontra no índice " +iPos+ " do vetor.");
         }
         System.exit(0);

    }

    //gera vetor randomizado
    private static int [] gerarVetor(int tam){
        int []vetor = new int[tam];
        Random gerador =  new Random();
        
        for (int i = 0; i < vetor.length; i++){
            vetor[i] = gerador.nextInt(100);
        }

        return vetor;
    }

    //ordena o vetor
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

    //busca binária (não recursiva)
    public static int busca_binaria(int iVet[], int iK){
        int iBaixo, iAlto, iMeio;
        iBaixo = 0;
        iAlto = iVet.length-1;
        while (iBaixo<=iAlto){
            iMeio = (iBaixo+iAlto)/2;
            if(iK < iVet[iMeio]) iAlto=iMeio-1;
            else if(iK > iVet[iMeio]) iBaixo= iMeio+1;  // Erro: Troquei ">" por ">="
                else return iMeio;
        }
        return -1;
    }

}