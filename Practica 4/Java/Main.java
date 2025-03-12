package practica4;

public class Main {

    public static void main(String[] args) {
        CalculadoraArea calculadora = new CalculadoraArea();

        System.out.println("Area del circulo: " + calculadora.area(5));
        System.out.println("Area del rectangulo: " + calculadora.area(10, 4));
        System.out.println("Area del triangulo rectangulo: " + (calculadora.area(6, 8) / 2));
        System.out.println("Area del trapecio: " + calculadora.area(10, 6, 4));
        System.out.println("Area del pentagono: " + calculadora.area(5, 3, 5));
    }
    
}
