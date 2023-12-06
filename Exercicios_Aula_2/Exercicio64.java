import javax.swing.*;;
public class Exercicio64 {
    public static void main(String[] args) {
        char cVetor[] =  new char[5];
        digita_vetor(cVetor);
        OrdenacaoSelecao(cVetor);

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
    public static void OrdenacaoSelecao(char cVet[]){
        int iA, iB, iC;
        char cT;

        for(iA = 0; iA < cVet.length-1 ; iA++){
            iC = iA;
            cT = cVet[iA];
            for(iB=iA+1 ; iB < cVet.length; iB++){
                if(cVet[iB] < cT){
                    iC=iB;
                    cT=cVet[iB];
                }
            }
            cVet[iC] = cVet[iA];
            cVet[iA] = cT;
        }
    }
}
