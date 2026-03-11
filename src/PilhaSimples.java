public class PilhaSimples {
    String[] pilha;
    int lastEmptyIndex = 0;

    public PilhaSimples(int size) {
        this.pilha = new String[size];
    }

    public void push(String element) {
        if (this.lastEmptyIndex > this.length()-1) {
            throw new IndexOutOfBoundsException(
                String.format("Tamanho máximo da lista atingido %s.", this.length())
            );
        }
        this.pilha[this.lastEmptyIndex] = element;
        this.lastEmptyIndex++;
    }

    public String pop() {
        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException("Não há mais elementos na Pilha.");
        }
        String temp = this.pilha[this.lastEmptyIndex-1];
        this.pilha[this.lastEmptyIndex-1] = null;
        this.lastEmptyIndex--;
        return temp;
    }

    public String peek() {
        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException("Não há mais elementos na Pilha.");
        }
        return this.pilha[this.lastEmptyIndex-1];
    }

    public boolean isEmpty() {
        return this.lastEmptyIndex <= 0;
    }

    public int length() {
        return this.pilha.length;
    }

    @Override
    public String toString() {
        String str = ""; 
        for (int i = this.length()-1; i >= 0; i--) {   
            str += this.pilha[i];
            str += i > 0 ?  "\n" : "";
        }
        return str;
    }
}
