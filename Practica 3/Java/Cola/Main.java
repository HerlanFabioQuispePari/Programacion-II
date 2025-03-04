package practica3;

public class Main {

    public static void main(String[] args) {
        Cola cola = new Cola(5);
        
        cola.insert(10);
        cola.insert(20);
        cola.insert(30);
        
        System.out.println("Elemento al frente: " + cola.peek());
        
        System.out.println("Elemento eliminado: " + cola.remove());
        System.out.println("Elemento al frente: " + cola.peek());
        
        cola.insert(40);
        cola.insert(50);
        cola.insert(60);
        
        System.out.println("¿Esta llena?: " + cola.isFull());
        System.out.println("Tamaño actual: " + cola.size());
        
        System.out.println("Elemento eliminado: " + cola.remove());
        System.out.println("Elemento eliminado: " + cola.remove());
        System.out.println("Elemento eliminado: " + cola.remove());
        System.out.println("Elemento eliminado: " + cola.remove());
        
        System.out.println("¿Esta vacia?: " + cola.isEmpty());
    }
}
