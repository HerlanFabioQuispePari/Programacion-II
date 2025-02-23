
package practica1;

public class Main {

    public static void main(String[] args) {
        Punto p1 = new Punto(0, 3);
        System.out.println(p1);
        
        float[] cartesianas = p1.coord_cartesianas();
        System.out.println(cartesianas[0] + " " + cartesianas[1]);
        
        float[] polares = p1.coord_polares();
        System.out.println(polares[0] + " " + polares[1]);
    }
    
}
