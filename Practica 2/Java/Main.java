
package practica2;

import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setColor(Color.BLACK);
        g2d.drawLine(0, getHeight() / 2, getWidth(), getHeight() / 2);
        g2d.drawLine(getWidth() / 2, 0, getWidth() / 2, getHeight()); 
        
        Punto centroCirculo = new Punto(getWidth() / 2, getHeight() / 2);
        Circulo circulo = new Circulo(centroCirculo, 60);
        circulo.dibujaCirculo(g);
        
        Punto p1 = new Punto(getWidth() / 2 - 50, getHeight() / 2 - 100);
        Punto p2 = new Punto(getWidth() / 2 + 100, getHeight() / 2);
        Linea linea = new Linea(p1, p2);
        linea.dibujaLinea(g);
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(linea);
        
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Practica 2");
        Main panel = new Main();
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}

