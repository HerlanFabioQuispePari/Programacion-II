import java.util.Scanner;

class Estadisticas {
    private double[] datos;

    public Estadisticas(double[] datos) {
        this.datos = datos;
    }

    public double promedio() {
        double suma = 0;
        for (double num : datos) {
            suma += num;
        }
        return suma / datos.length;
    }

    public double desviacion() {
        double prom = promedio();
        double sumaCuadrados = 0;
        for (double num : datos) {
            sumaCuadrados += Math.pow(num - prom, 2);
        }
        return Math.sqrt(sumaCuadrados / (datos.length - 1));
    }
}

public class TestEstadisticas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextDouble();
        }

        Estadisticas est = new Estadisticas(numeros);
        System.out.printf("El promedio es %.2f\n", est.promedio());
        System.out.printf("La desviación estándar es %.5f\n", est.desviacion());
    }
}
