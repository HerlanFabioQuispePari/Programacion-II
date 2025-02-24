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

    public float getY() {
        return y;
    }
    
    public Punto coordCartesianas() {
        return new Punto(getX(), getY());
    }
    
    @Override
    public String toString() {
        return "x: "+x+" y: "+y;
    }
}
