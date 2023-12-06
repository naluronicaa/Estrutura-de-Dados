import java.util.*;
public class Exercicio5 {
    public static void main(String[] args) {
        int iVetor[] = new int[16];
        int iT = 0;
        capicuas(iVetor, iT);
        
    }
    public static void capicuas(int iVet[], int iT){
        for(iT = 0; iT<iVet.length; iT++){
            if(iT == 3) {
                Random alt = new Random();
                int n1 = alt.nextInt();
                int n2 = alt.nextInt();
                iVet[iT] = n1;
                iVet[iT-1] = n2;
                iVet[iT-2] = n2;
                iVet[iT-3] = n1;
            } else if (iT == 10){
                Random alt = new Random();
                int n1 = alt.nextInt();
                int n2 = alt.nextInt();
                iVet[iT] = n2;
                iVet[iT-1] = n1;
                iVet[iT-2] = n1;
                iVet[iT-3] = n2;
                iVet[iT-4] = n2;
                iVet[iT-5] = n1;
            } else if (iT == 11){
                Random alt = new Random();
                int n1 = alt.nextInt();
                iVet[iT] = n1;
                iVet[iT+1] = n1;
                iVet[iT+2] = n1;
                iVet[iT+3] = n1;
                iVet[iT+4] = n1;
            } else if( iT == 4){
                Random alt = new Random();
                int n1 = alt.nextInt();
                iVet[iT] = n1;
            }
        }
    }
}
