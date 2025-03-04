package practica3;

public class main {

    public static void main(String[] args) {
        Pila pila = new Pila(5);
        pila.push(10);
        pila.push(20);
        pila.push(30);
        
        System.out.println("Elemento en la cima: " + pila.peek());
        System.out.println("Elemento eliminado: " + pila.pop());
        System.out.println("Elemento en la cima: " + pila.peek());
        System.out.println("¿Esta vacia?: " + pila.isEmpty());
        System.out.println("¿Esta llena?: " + pila.isFull());
    }
    
}
