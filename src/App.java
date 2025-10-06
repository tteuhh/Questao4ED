public class App {
    public static void main(String[] args) throws Exception {
        Pilha pilha = new Pilha(5);
        
        
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        
        
        System.out.println("Elemento do topo: " + pilha.peek());
        
        
        System.out.println("Removendo todos os elementos:");
        while (!pilha.isEmpty()) {
            System.out.println("Elemento removido: " + pilha.pop());
        }
        
        
        System.out.println("A pilha está vazia? " + pilha.isEmpty());
    }
    
}

