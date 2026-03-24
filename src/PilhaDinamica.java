public class PilhaDinamica {
    No head;
    int lastEmptyIndex;

    public PilhaDinamica() {
        this.head = new No(null);
        this.lastEmptyIndex = 0;
    }

    public void push(String element) {
        No novoNo = new No(element);
        novoNo.setProx(head);
        head = novoNo;
        lastEmptyIndex++;
    }

    public String pop() {
        if (this.isEmpty()) {
            throw new RuntimeException("Não há mais elementos na Pilha.");
        }
        String conteudo = head.getConteudo();
        head = head.getProx();
        lastEmptyIndex--;
        return conteudo;
    }

    public String peek() {
        if (this.isEmpty()) {
            throw new RuntimeException("Não há mais elementos na Pilha.");
        }
        return head.getConteudo();
    }

    public boolean isEmpty() {
        return head.getConteudo() == null;
    }

    public int length() {
        return this.lastEmptyIndex;
    }

    @Override
    public String toString() {
        String str = "";
        No tempHead = this.head; 
        while (tempHead.getProx() != null) {  
            str += tempHead.getConteudo();
            tempHead = tempHead.getProx();
            if (tempHead.getProx() != null) {
                str += "\n";
            }
        }
        return str;
    }
}