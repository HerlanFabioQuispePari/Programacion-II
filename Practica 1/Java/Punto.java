
package practica1;

public class Punto {
    public float x;
    public float y;    

    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    public float[] coord_cartesianas(){
        return new float[]{this.x , this.y};
    }
    
    public float[] coord_polares(){
        float radio = (float) Math.sqrt(this.x * this.x + this.y * this.y);
        float angulo = (float) Math.atan2(this.y, this.x);
        angulo = (float) Math.toDegrees(angulo);
        return new float[]{radio, angulo};
    }
    
    @Override
    public String toString(){
        return this.x + " " + this.y;
    }
}
