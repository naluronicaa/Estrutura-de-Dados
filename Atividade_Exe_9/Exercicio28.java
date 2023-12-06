import javax.swing.JOptionPane;

public class Exercicio28 {
    private static ListaDE_Modelo lista;
    private static ListaDE_Modelo.NodeDE listaa;
    public static void main(String[] args) {
        int opicao = 0;

        do {
            opicao = Integer.parseInt(JOptionPane.showInputDialog(null, "Bem vindo(a)!\nEscolha a operação que deseja realizar \n1. Inicializar Lista \n2. Mostrar Próximo Nó. \n3. Inserir Nó \n4. Eliminar Ultimo Nó\n5. Sair."));

            switch(opicao){
                case 1:
                    //inicializar lista
                    lista = new ListaDE_Modelo();
                    listaa = lista.new NodeDE();

                    break;
                case 2:
                    //mostrar próximo nó
                    if (listaa.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Lista Vazia");
                    } else if (listaa.size() == 1) {
                        JOptionPane.showMessageDialog(null, "Último Nó da Lista");
                    } else {
                        int conteudo = listaa.takeHead();
                        JOptionPane.showMessageDialog(null, "Conteúdo do próximo nó: \nElemento: " + conteudo);
                        System.out.println("Conteúdo do próximo nó:");
                        System.out.println("Elemento: " + conteudo);
                    }

                    break;
                case 3:
                    //adicionar pela cauda
                    int i = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro para ser adicionado a lista singularmente encadeada!"));
                    listaa.putTail(i);
                    JOptionPane.showMessageDialog(null, "O número: " +i+ ", foi adicionado à fila!");
                    break;
                case 4:
                    if (listaa.isEmpty() || listaa.size() == 1) {
                        JOptionPane.showMessageDialog(null, "Não há nó a ser eliminado");
                    } else {
                        int conteudo = listaa.takeTail();
                        JOptionPane.showMessageDialog(null, "Nó eliminado: " + conteudo);
                    }
                    break;
                case 5:
                    opicao = 5;
                    break;    
                default:
                    JOptionPane.showMessageDialog(null, "Opição Inválida");
                    break;
            }
        } while (opicao != 5);
    }
}

