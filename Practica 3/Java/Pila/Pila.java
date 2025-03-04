package practica3;

public class Pila {
    private long[] arreglo;
    private int top;
    private int n;

    public Pila(int n) {
        this.n = n;
        arreglo = new long[n];
        top = -1;
    }

    public void push(long e) {
        if (isFull()) {
            System.out.println("La pila está llena");
        } else {
            top++;
            arreglo[top] = e;
        }
    }

    public long pop() {
        if (isEmpty()) {
            System.out.println("La pila está vacía");
            return -1;
        } else {
            long elemento = arreglo[top];
            top--;
            return elemento;
        }
    }

    public long peek() {
        if (isEmpty()) {
            System.out.println("La pila está vacía");
            return -1;
        } else {
            return arreglo[top];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == n - 1;
    }
}

