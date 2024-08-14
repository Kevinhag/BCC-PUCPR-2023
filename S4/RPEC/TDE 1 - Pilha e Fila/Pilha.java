public class Pilha {
    private int capacidade = 10;
    private int topo = -1;
    private int[] dados = new int[capacidade];

    public void Inserir(int num) {
        if (Cheia()) {
            System.err.println("Pilha cheia. Não foi possível inserir [" + num + "].");
            return;
        }
        dados[++topo] = num;
    }

    public void Remover() {
        if (Vazia()) {
            System.err.println("Não foi possível remover, a pilha já está vazia.");
            return;
        }
        dados[topo--] = 0;
    }

    public boolean Cheia() {
        return topo == capacidade - 1;
    }

    public boolean Vazia() {
        return topo == -1;

    }

    public void Imprimir() {
        if (Vazia()) {
            System.out.println("Pilha vazia.");
        } else {
            for (int i = 0; i <= topo; i++) {
                System.out.println(dados[i]);
            }
        }
    }

    public static void main(String[] args) {
        Pilha p = new Pilha();

        p.Inserir(10);
        p.Inserir(20);
        p.Inserir(30);
        p.Inserir(20234);
        p.Inserir(20234);
        p.Inserir(20234);
        p.Inserir(20234);
        p.Inserir(6234);
        p.Inserir(6234);
        p.Inserir(623423);
        p.Imprimir();
        p.Inserir(101010);
        p.Remover();
        p.Imprimir();
    }
}