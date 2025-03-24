import java.util.Scanner;

class EcuacionCuadratica {
    private double a, b, c;

    public EcuacionCuadratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminante() {
        return b * b - 4 * a * c;
    }

    public double getRaiz1() {
        double d = getDiscriminante();
        if (d >= 0) {
            return (-b + Math.sqrt(d)) / (2 * a);
        }
        return Double.NaN;
    }

    public double getRaiz2() {
        double d = getDiscriminante();
        if (d >= 0) {
            return (-b - Math.sqrt(d)) / (2 * a);
        }
        return Double.NaN;
    }
}

public class TestEcuacionCuadratica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        EcuacionCuadratica eq = new EcuacionCuadratica(a, b, c);
        double d = eq.getDiscriminante();

        if (d > 0) {
            System.out.printf("La ecuación tiene dos raíces %.5f y %.5f\n", eq.getRaiz1(), eq.getRaiz2());
        } else if (d == 0) {
            System.out.printf("La ecuación tiene una raíz %.5f\n", eq.getRaiz1());
        } else {
            System.out.println("La ecuación no tiene raíces reales");
        }
    }
}
