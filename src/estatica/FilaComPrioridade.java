package estatica;

import entidades.Paciente;

public class FilaComPrioridade {
    private Paciente[] heap;
    private int tamanho;

    public FilaComPrioridade(int capacidade) {
        heap = new Paciente[capacidade];
        tamanho = 0;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public boolean estaCheia() {
        return tamanho == heap.length;
    }

    public void enfileirar(Paciente paciente) {
        if (estaCheia()) {
            throw new RuntimeException("Fila cheia");
        }

        heap[tamanho] = paciente;
        sobeHeap(tamanho);
        tamanho++;
    }

    public Paciente desenfileirar() {
        if (estaVazia()) {
            throw new RuntimeException("Fila vazia");
        }

        Paciente raiz = heap[0];
        tamanho--;
        heap[0] = heap[tamanho];
        heap[tamanho] = null;

        if (!estaVazia()) {
            desceHeap(0);
        }

        return raiz;
    }

    private void sobeHeap(int indice) {
        while (indice > 0) {
            int pai = (indice - 1) / 2;

            if (heap[indice].compareTo(heap[pai]) > 0) {
                trocar(indice, pai);
                indice = pai;
            } else {
                break;
            }
        }
    }

    private void desceHeap(int indice) {
        while (true) {
            int filhoEsquerdo = 2 * indice + 1;
            int filhoDireito = 2 * indice + 2;
            int maior = indice;

            if (filhoEsquerdo < tamanho && heap[filhoEsquerdo].compareTo(heap[maior]) > 0) {
                maior = filhoEsquerdo;
            }

            if (filhoDireito < tamanho && heap[filhoDireito].compareTo(heap[maior]) > 0) {
                maior = filhoDireito;
            }

            if (maior != indice) {
                trocar(indice, maior);
                indice = maior;
            } else {
                break;
            }
        }
    }

    private void trocar(int i, int j) {
        Paciente aux = heap[i];
        heap[i] = heap[j];
        heap[j] = aux;
    }

    @Override
    public String toString() {
        String texto = "[";
        for (int i = 0; i < tamanho; i++) {
            texto += heap[i];
            if (i < tamanho - 1) {
                texto += ", ";
            }
        }
        texto += "]";
        return texto;
    }
}