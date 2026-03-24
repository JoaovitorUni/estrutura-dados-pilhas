public class MainPilhaDinamica {
    public static void main(String[] args) {
        PilhaDinamica pilha = new PilhaDinamica();
        System.out.println("--- push ---");
        pilha.push("Teste1");
        pilha.push("Teste2");
        pilha.push("Teste3");
        pilha.push("Teste4");
        System.out.println(pilha);
        System.out.println("--- pop ---");
        System.out.println("Pop: " + pilha.pop());
        System.out.println("Pop: " + pilha.pop());
        System.out.println("Pop: " + pilha.pop());
        System.out.println("Pop: " + pilha.pop());
        try {
            pilha.pop();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("--- isEmpty ---");
        System.out.println(pilha.isEmpty());
        System.out.println("--- peek ---");
        try {
            pilha.peek();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Push: Teste 1");
        pilha.push("Teste 1");
        System.out.println("Peek 1: " + pilha.peek());
        System.out.println("Peek 2: " + pilha.peek());
    }
}