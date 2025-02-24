
package practica2;

import java.awt.Color;
import java.awt.Graphics;

class Circulo {
    public Punto centro;
    public float radio;
    
    public Circulo(Punto centro, float radio) {
        this.centro = centro;
        this.radio = radio;
    }
    
    public void dibujaCirculo(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawOval((int) (centro.getX() - radio), (int) (centro.getY() - radio), (int) (2 * radio), (int) (2 * radio));
    }
    
    @Override
    public String toString() {
        return "Circulo con centro en " + centro + " y radio " + radio;
    }
}
