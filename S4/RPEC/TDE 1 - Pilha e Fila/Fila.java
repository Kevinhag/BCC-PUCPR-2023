public class Fila {
    private int capacidade = 10;
    private int inicio = 0;
    private int fim = 0;
    private int tamanho = 0;
    private String[] dados = new String[capacidade];

    public void Inserir(String data) {
        if (tamanho == capacidade) {
            System.err.println("Fila cheia. Não foi possível inserir [" + data + "].");
            return;
        }
        dados[fim] = data;
        fim = (fim + 1) % capacidade;
        tamanho++;
    }

    public void Remover() {
        if (tamanho == 0) {
            System.err.println("Não foi possível remover, a fila já está vazia.");
            return;
        }
        dados[inicio] = null;
        inicio = (inicio + 1) % capacidade;
        tamanho--;
    }

    public boolean Cheia() {
        return tamanho == capacidade;
    }

    public boolean Vazia() {
        return tamanho == 0;
    }

    public void Imprimir() {
        if (Vazia()) {
            System.out.println("Fila vazia.");
        } else {
            for (int i = 0; i < capacidade; i++) {
                if (dados[i] != null) {
                    System.out.println("ID " + i + " - " + dados[i]);
                }
            }
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Fila f = new Fila();

        f.Inserir("A");
        f.Inserir("I");
        f.Inserir("U");
        f.Inserir("E");
        f.Inserir("O");
        f.Imprimir();

        f.Remover();
        f.Imprimir();

        f.Inserir("A");
        f.Inserir("I");
        f.Inserir("U");
        f.Inserir("E");
        f.Inserir("O");
        f.Inserir("A");
        f.Inserir("A");
        f.Inserir("A");
        f.Imprimir();

        System.out.println("Fila está cheia? " + f.Cheia());
        System.out.println("Fila está vazia? " + f.Vazia());
    }
}
