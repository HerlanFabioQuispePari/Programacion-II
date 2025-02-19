
package practica2;

class Punto {
    public float x;
    public float y;

    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    
    public Punto coordCartesianas() {
        return new Punto(getX(), getY());
    }
    
    public void coord_polares(){
        float radio = (float) Math.sqrt(x * x + y * y);
        float angulo = (float) Math.toDegrees(Math.atan2(y, x));
        System.out.println("radio: "+ radio);
        System.out.println("angulo: "+angulo);
    }
    
    @Override
    public String toString() {
        return "x: "+x+" y: "+y;
    }
}
