import javax.swing.JOptionPane;

public class Exercicio29 {
    private static ListaDE_Modelo.NodeDE listaa;
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog(null, "Digite uma frase:" );

        for (int i = 0; i < s.length(); i++) {
            char caractere = s.charAt(i);
            listaa.putTail(caractere);
        }

        String ss = JOptionPane.showInputDialog(null, "Digite um caractere para ser retirado");
        char c = ss.charAt(0);

        boolean encont = false;

        NodeDE noAtual = listaa.ndInicio;
        NodeDE noAnterior = null;

        while (noAtual != null) {
            if (noAtual.getElement() == c) {
                if (noAnterior == null) {
                    // Remoção do primeiro nó da lista
                    listaa.ndInicio = noAtual.getNext();
                } else {
                    // Remoção de um nó no meio ou no final da lista
                    noAnterior.setNext(noAtual.getNext());
                }

                // Atualizar o tamanho da lista
                listaa.iTamanho--;

                // Continuar para o próximo nó
                noAtual = noAtual.getNext();
            } else {
                noAnterior = noAtual;
                noAtual = noAtual.getNext();
            }
        }

        StringBuilder fraseResultante = new StringBuilder();
        noAtual = listaa.ndInicio;
        while (noAtual != null) {
            fraseResultante.append(noAtual.getElement());
            noAtual = noAtual.getNext();
        }
        
        JOptionPane.showMessageDialog(null, "Frase Resultante cabeça - cauda: " + fraseResultante.toString());


        NodeDE noAtuall = listaa.ndFim;
        NodeDE noAnteriorr = null;

        while (noAtuall != null) {
            if (noAtuall.getElement() == c) {
                if (noAnteriorr == null) {
                    // Remoção do primeiro nó da lista
                    listaa.ndFim = noAtuall.getPrvs();
                } else {
                    // Remoção de um nó no meio ou no final da lista
                    noAnteriorr.setNext(noAtuall.getPrvs());
                }

                // Atualizar o tamanho da lista
                listaa.iTamanho--;

                // Continuar para o próximo nó
                noAtuall = noAtuall.getPrvs();
            } else {
                noAnteriorr = noAtuall;
                noAtuall = noAtuall.getPrvs();
            }
        }

        StringBuilder fraseResultante2 = new StringBuilder();
        noAtuall = listaa.ndFim;
        while (noAtuall != null) {
            fraseResultante2.append(noAtuall.getElement());
            noAtuall = noAtuall.getPrvs();
        }
        
        JOptionPane.showMessageDialog(null, "Frase Resultante cauda - cabeça: " + fraseResultante2.toString());

    }

    public class ListaDE_Modelo {
    
        public class NodeDE{
            private char iElement;
            private NodeDE ndPrvs;
            private NodeDE ndNext;
    
            public NodeDE(){
                iElement = 0;
                ndPrvs = null;
                ndNext = null;
            }
    
            public NodeDE(char iE, NodeDE ndP, NodeDE ndN){
                iElement = iE;
                ndPrvs = ndP;
                ndNext = ndN;
            }
    
            void setPrvs(NodeDE ndP){
                ndPrvs = ndP;
            }
    
            void setNetx(NodeDE ndN){
                ndNext = ndN;
            }
    
            char getElement(){
                return iElement;
            }
    
            NodeDE getNext(){
                return ndNext;
            }
    
            NodeDE getPrvs(){
                return ndPrvs;
            }
    
            private NodeDE ndInicio;
            private NodeDE ndFim;
            private int iTamanho;
    
            public ListaDE_Modelo(){
                ndInicio = null;
                ndFim = null;
                iTamanho = 0;
            }
    
            public void putHead(char iI){
                NodeDE ndNovo = new NodeDE(iI, null, null);
                if(isEmpty()) ndFim = ndNovo;
                else{
                    ndNovo.setNetx(ndInicio);
                    ndInicio.setPrvs(ndNovo);
                }
                ndInicio = ndNovo;
                iTamanho++;
            }
    
            public void putTail(char iI){
                NodeDE ndNovo = new NodeDE(iI, null, null);
                if(isEmpty()) ndInicio = ndNovo;
                else{
                    ndFim.setNetx(ndNovo);
                    ndNovo.setPrvs(ndFim);
                }
                ndFim = ndNovo;
                iTamanho++;
            }
    
            public char takeHead(){
                char iI = ndInicio.getElement();
                if(size() == 1){
                    ndInicio = null;
                    ndFim = null;
                }
                else{
                    ndInicio = ndInicio.getNext();
                    ndInicio.setPrvs(null);
                }
                iTamanho--;
                return iI;
            }
    
            public char takeTail(){
                char iI = ndFim.getElement();
                if(size() == 1){
                    ndInicio = null;
                    ndFim = null;
                }else{
                    ndFim = ndFim.getPrvs();
                    ndFim.setNetx(null);
                }
                iTamanho--;
                return iI;
            }
    
            public char viewHead(){
                char iI = ndInicio.getElement();
                return iI;
            }
    
            public char viewTail(){
                char iI = ndFim.getElement();
                return iI;
            }
    
            public int size(){
                return iTamanho;
            }
    
            public boolean isEmpty(){
                boolean bR = false;
                if (size() == 0)    bR = true;
                return bR;
            }
    
        }
    }
    
}
