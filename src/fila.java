public class fila {
    noFila primeiro;
    noFila ultimo;

    public fila(){
        this.primeiro = this.ultimo = null;
    }

    boolean vazia(){
        return this.primeiro == null;
    }

    public void enfileirar(int valor){
        noFila inserir = new noFila(valor);
        if (vazia()) {
            this.primeiro = this.ultimo = inserir;
        } else {
            this.ultimo.proximo = inserir;
            this.ultimo = this.ultimo.proximo;
        }
    }

    public int desenfileirar(){
        if(vazia()){
            return -1;
        } else {
            int item = this.primeiro.valor;

            this.primeiro = this.primeiro.proximo;

            return item;
       }
    }

    public void imprimirFila(){
        if(vazia()){
            System.out.println("Fila vazia");
        } else {
            do{
                System.out.println(this.primeiro.valor);
                this.primeiro = this.primeiro.proximo;
            }while(this.primeiro != null);
        }
    }




}