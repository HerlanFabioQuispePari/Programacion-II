package practica4;

public class CalculadoraArea {
    public double area(double radio) {
        return Math.PI * radio * radio;
    }

    public double area(double base, double altura) {
        return base * altura;
    }

    public double area(double baseMayor, double baseMenor, double altura) {
        return ((baseMayor + baseMenor) / 2) * altura;
    }

    public double area(double lado, double apotema, int lados) {
        return (lados * lado * apotema) / 2;
    }
}
