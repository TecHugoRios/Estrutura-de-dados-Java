public class programa {
    public static void main(String[] args){

        fila f = new fila();
        pilha p = new pilha();
        arvore a = new arvore();

        f.enfileirar(1);
        f.enfileirar(2);
        f.enfileirar(3);
        f.enfileirar(4);
        f.enfileirar(5);

        while(!f.vazia()){
            int item = f.desenfileirar();
            p.push(item);
            a.inserir(item);
            System.out.println("Adicionado na pilha: " + item);
        }

        System.out.println("fila:");
        f.imprimirFila();
        System.out.println("arvore");
        a.imprimir();
        System.out.println("pilha:");
        p.imprimirPilha();

    }
}
