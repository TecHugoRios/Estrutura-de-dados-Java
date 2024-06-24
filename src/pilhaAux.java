public class pilhaAux {
    public noPilhaAux baseAux, topoAux;

    public pilhaAux(){
        this.baseAux=this.topoAux=null;
    }

    boolean vazia(){
        return baseAux == null;
    }


    public void push(int valor){
        noPilhaAux inserir = new noPilhaAux(valor);
        if(vazia()){
            this.baseAux = this.topoAux = inserir;
        } else{
            topoAux.proximo = inserir;
            topoAux = topoAux.proximo;
        }
    }

    public int pop(){
        int item = this.topoAux.valor;
        if(vazia()){
            System.err.println("A pilha está vazia");
            return -1;
        } else if(this.baseAux == this.topoAux){
          this.baseAux = this.topoAux = null;
        } else {
            noPilhaAux atual = baseAux;

            while(atual.proximo != topoAux){
                atual = atual.proximo;
            }
            topoAux = atual;
            atual.proximo = null;
        }
        return item;
    }




}
