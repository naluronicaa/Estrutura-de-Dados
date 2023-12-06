import javax.swing.*;
public class Exe7 {
    public static void main(String[] args) {
        int opicao = 0;
        do {
            opicao = Integer.parseInt(JOptionPane.showInputDialog(null, "Bem vindo(a)!\nEscolha a operação que deseja realizar \n1. Inserir Nome \n2. Consultar Nome \n3. Retirar Nome. \n4. Sair."));

            switch(opicao){
                case 1:
                    String nC = JOptionPane.showInputDialog(null, "Digite um numero para ser inserido!");
                    String i = push(nC);
                    if (i == "0"){
                        JOptionPane.showMessageDialog(null, "A pilha está cheia!");
                    }else{
                        JOptionPane.showMessageDialog(null, "Nome foi adicionado com sucesso!");
                    }
                    break;
                case 2:
                    if (iPos == 0){
                        JOptionPane.showMessageDialog(null, "Não há elementos na pilha!");
                    }else{
                        String n = top();
                        JOptionPane.showMessageDialog(null, "O nome no topo da pilha é: " +n+"\nE o tamanho da pilha é "+iPos);
                    }
                    break;
                case 3:
                    if (iPos == 0){
                        JOptionPane.showMessageDialog(null, "Não há elementos na pilha!");
                    }else{
                        String nu = top();
                        JOptionPane.showMessageDialog(null, "O nome "+nu+" foi retirado");
                        pop();
                    }
                    break;
                case 4:
                    opicao = 4;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opição Inválida");
                    break;
            }
        } while (opicao != 4);
    }

    public static int iTAM = 10;
    public static String iPilha[] =  new String[iTAM];
    public static int iPos = 0;

    public static int size(){
        return iPos;
    }
    public static String top(){
        return iPilha[iPos-1];
    }
    public static String push(String iC){
        if(iPos >= iTAM) return "0";
        return iPilha[iPos++] = iC;
    }
    public static String pop(){
        if (iPos == 0) return "0";
        return iPilha[--iPos];
    }
}

