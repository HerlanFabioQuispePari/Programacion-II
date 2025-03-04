package practica3;

public class Cola {
    private long[] arreglo;
    private int inicio;
    private int fin;
    private int n;


    public Cola(int n) {
        this.n = n;
        arreglo = new long[n];
        inicio = -1;
        fin = -1;
    }

    public void insert(long e) {
        if (isFull()) {
            System.out.println("La cola está llena");
        } else {
            if (isEmpty()) {
                inicio = 0;
            }
            fin++;
            arreglo[fin] = e;
        }
    }

    public long remove() {
        if (isEmpty()) {
            System.out.println("La cola está vacía");
            return -1;
        } else {
            long elemento = arreglo[inicio];
            inicio++;
            if (inicio > fin) {
                inicio = fin = -1;
            }
            return elemento;
        }
    }

    public long peek() {
        if (isEmpty()) {
            System.out.println("La cola está vacía");
            return -1;
        }
        return arreglo[inicio];
    }

    public boolean isEmpty() {
        return inicio == -1;
    }

    public boolean isFull() {
        return fin == n - 1;
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        }
        return fin - inicio + 1;
    }
}

