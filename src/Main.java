public class Main {
    public static void main(String[] args) {
        PilhaSimples pilhaSimples = new PilhaSimples(3);
        System.out.println("--- push ---");
        pilhaSimples.push("Teste1");
        pilhaSimples.push("Teste2");
        pilhaSimples.push("Teste3");
        System.out.println(pilhaSimples);
        try {
            pilhaSimples.push("Teste4");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("--- pop ---");
        System.out.println("Pop: " + pilhaSimples.pop());
        System.out.println("Pop: " + pilhaSimples.pop());
        System.out.println(pilhaSimples);
        System.out.println("Pop: " + pilhaSimples.pop());
        try {
            pilhaSimples.pop();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("--- isEmpty ---");
        System.out.println(pilhaSimples.isEmpty());
        System.out.println("--- peek ---");
        try {
            pilhaSimples.peek();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.err.println("Push 1 elemento:");
        pilhaSimples.push("Teste1");
        System.out.println(pilhaSimples);
        System.out.println();
        System.out.println("Peek: " + pilhaSimples.peek());
        System.out.println(pilhaSimples);
    }
}
