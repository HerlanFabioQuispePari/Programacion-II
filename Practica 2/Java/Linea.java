package practica2;

import java.awt.Color;
import java.awt.Graphics;

class Linea {
    public Punto p1;
    public Punto p2;
    
    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    
    public void dibujaLinea(Graphics g) {
        g.setColor(Color.RED);
        g.drawLine((int) p1.getX(), (int) p1.getY(), (int) p2.getX(), (int) p2.getY());
    }
    
    @Override
    public String toString() {
        return "Linea de " + p1 + " a " + p2;
    }
}
