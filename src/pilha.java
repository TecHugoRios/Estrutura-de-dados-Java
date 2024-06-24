public class pilha{
    public noPilha base, topo;

    pilhaAux pAux = new pilhaAux();

    public pilha(){
        this.base= this.topo= null;
    }

    boolean vazia(){
        return base == null;
    }


    public void push(int valor){
        noPilha inserir = new noPilha(valor);
        if(vazia()){
            this.base = this.topo = inserir;
        } else{
            topo.proximo = inserir;
            topo = topo.proximo;
        }
    }

    public int pop(){
        int item = topo.valor;
        if(vazia()){
            System.err.println("A pilha está vazia");
            return -1;
        } else if(this.base == this.topo){
            this.base = this.topo = null;
        } else {
            noPilha atual = base;

            while(atual.proximo != topo){
                atual = atual.proximo;
            }

            topo = atual;
            atual.proximo = null;
        }
        return item;
    }

    public void imprimirPilha() {
        while (!vazia()) {
            int item = pop();
            System.out.println(item);
            pAux.push(item);
        }

        while(!pAux.vazia()){
            push(pAux.pop());
        }

    }
}


