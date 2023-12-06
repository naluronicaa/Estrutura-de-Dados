public class Exercicio27{
    private static ListaDE_Modelo.NodeDE lista;
    public static void main(String[] args) {

        // Inserir novo nó sempre ao final da lista
        lista.putTail(10);
        lista.putTail(20);
        lista.putTail(30);

        // Apresentar o conteúdo do nó atual da lista
        int conteudoAtual = lista.viewHead();
        System.out.println("Conteúdo atual: " + conteudoAtual);

        // Apresentar o conteúdo do próximo nó da lista
        NodeDE proximoNo = lista.ndInicio.getNext();
        if (proximoNo != null) {
            int conteudoProximo = proximoNo.getElement();
            System.out.println("Próximo nó: " + conteudoProximo);

            // O nó atual passa a ser o próximo nó
            lista.ndInicio = proximoNo;
        } else {
            System.out.println("Lista Encerrada");
        }

        // Apresentar o conteúdo do nó anterior da lista
        NodeDE anteriorNo = lista.ndInicio.getPrvs();
        if (anteriorNo != null) {
            int conteudoAnterior = anteriorNo.getElement();
            System.out.println("Nó anterior: " + conteudoAnterior);

            // O nó atual passa a ser o nó anterior
            lista.ndInicio = anteriorNo;
        } else {
            System.out.println("Lista Encerrada");
        }

        // Remover o último nó da lista
        int ultimoNo = lista.takeTail();
        System.out.println("Último nó removido: " + ultimoNo);

        // O nó atual passa a ser o nó inicial
        lista.ndInicio = lista.ndFim;

        // Apresentar o conteúdo do nó atual da lista
        conteudoAtual = lista.viewHead();
        System.out.println("Conteúdo atual: " + conteudoAtual);
    }
}
