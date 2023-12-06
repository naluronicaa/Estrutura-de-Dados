public class ListaDE_Modelo {
    
    public class NodeDE{
        private int iElement;
        private NodeDE ndPrvs;
        private NodeDE ndNext;

        public NodeDE(){
            iElement = 0;
            ndPrvs = null;
            ndNext = null;
        }

        public NodeDE(int iE, NodeDE ndP, NodeDE ndN){
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

        int getElement(){
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

        public void putHead(int iI){
            NodeDE ndNovo = new NodeDE(iI, null, null);
            if(isEmpty()) ndFim = ndNovo;
            else{
                ndNovo.setNetx(ndInicio);
                ndInicio.setPrvs(ndNovo);
            }
            ndInicio = ndNovo;
            iTamanho++;
        }

        public void putTail(int iI){
            NodeDE ndNovo = new NodeDE(iI, null, null);
            if(isEmpty()) ndInicio = ndNovo;
            else{
                ndFim.setNetx(ndNovo);
                ndNovo.setPrvs(ndFim);
            }
            ndFim = ndNovo;
            iTamanho++;
        }

        public int takeHead(){
            int iI = ndInicio.getElement();
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

        public int takeTail(){
            int iI = ndFim.getElement();
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

        public int viewHead(){
            int iI = ndInicio.getElement();
            return iI;
        }

        public int viewTail(){
            int iI = ndFim.getElement();
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
