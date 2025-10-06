public class Pilha {
    private int[] array;
    private int topo;
    private int capacidade;

     public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.array = new int[capacidade];
        this.topo = -1;
     }

      public void push(int valor) {
        if (topo == capacidade - 1) {
            System.out.println("Pilha cheia! Não é possível inserir " + valor);
            return;
        }
        array[++topo] = valor;
    }

    
    public int pop() {
        if (isEmpty()) {
            System.out.println("Pilha vazia! Não é possível remover.");
            return -1;
        }
        return array[topo--];
    }

    
    public int peek() {
        if (isEmpty()) {
            System.out.println("Pilha vazia!");
            return -1;
        }
        return array[topo];
    }

    
    public boolean isEmpty() {
        return topo == -1;
    }

}
