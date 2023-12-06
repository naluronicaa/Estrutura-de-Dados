import javax.swing.*;
public class Exe2 {
    public static void main(String[] args) {
        int opicao = 0;
        Pilha ip = new Pilha();
        do {
            opicao = Integer.parseInt(JOptionPane.showInputDialog(null, "Bem vindo(a)!\nEscolha a operação que deseja realizar \n1. Inserir Elemento \n2. Consultar Elemento \n3. Retirar Elemento. \n4. Sair."));
    
            switch(opicao){
                case 1:
                    int iC = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero para ser inserido!"));
                    int i = ip.push(iC);
                    if (i == 0){
                        JOptionPane.showMessageDialog(null, "A pilha está cheia!");
                    }else{
                        JOptionPane.showMessageDialog(null, "Número foi adicionado com sucesso!");
                    }
                    break;
                case 2:
                    if (ip.iPos == 0){
                        JOptionPane.showMessageDialog(null, "Não há elementos na pilha!");
                    }else{
                        int n = ip.top();
                        JOptionPane.showMessageDialog(null, "O número no topo da pilha é: " +n+"\nE o tamanho da pilha é "+ip.iPos);
                    }
                    break;
                case 3:
                    if (ip.iPos == 0){
                        JOptionPane.showMessageDialog(null, "Não há elementos na pilha!");
                    }else{
                        int nu = ip.top();
                        JOptionPane.showMessageDialog(null, "O número "+nu+" foi retirado");
                        ip.pop();
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
}

class Pilha{
    int iTAM = 10;
    int iPilha[] = new int[iTAM];
    int iPos = 0;

    int size(){
        return iPos;
    }
    int top(){
        return iPilha[iPos-1];
    }
    int push(int iC){
        if(iPos >= iTAM) return 0;
        return iPilha[iPos++] = iC;
    }
    int pop(){
        if (iPos == 0) return 0;
        return iPilha[--iPos];
    } 
}
