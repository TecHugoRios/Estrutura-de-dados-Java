public class arvore{
    public noArvore raiz;

    public arvore(){
        this.raiz = null;
    }

    public void inserir(int valor){
        raiz = inserirRec(raiz,valor);
    }

    public noArvore inserirRec(noArvore raiz,int valor){
        if (raiz == null) {
            raiz = new noArvore(valor);
            return raiz;
        }

        if(valor < raiz.valor){
            raiz.esquerda = inserirRec(raiz.esquerda,valor);
        } else if(valor > raiz.valor) {
            raiz.direita = inserirRec(raiz.direita, valor);
        }

        return raiz;
    }

    public void imprimir(){
        imprimirRec(raiz);
    }

    public void imprimirRec(noArvore raiz){
        if(raiz != null){
            imprimirRec(raiz.esquerda);
            System.out.println(raiz.valor);
            imprimirRec(raiz.direita);
        }
    }





}