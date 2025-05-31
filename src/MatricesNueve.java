import java.util.Scanner;

public class MatricesNueve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] tempMin = new double[5];
        double[] tempMax = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce la temperatura mínima del día " + (i + 1) + ": ");
            tempMin[i] = scanner.nextDouble();
            System.out.print("Introduce la temperatura máxima del día " + (i + 1) + ": ");
            tempMax[i] = scanner.nextDouble();
        }

        System.out.println("Temperatura media de cada día:");
        for (int i = 0; i < 5; i++) {
            double media = (tempMin[i] + tempMax[i]) / 2;
            System.out.println("Día " + (i + 1) + ": " + media);
        }

        double minTemp = tempMax[0];
        for (double temp : tempMax) {
            if (temp < minTemp) minTemp = temp;
        }
        System.out.println("Días con menos temperatura máxima:");
        for (int i = 0; i < 5; i++) {
            if (tempMax[i] == minTemp) {
                System.out.println("Día " + (i + 1));
            }
        }

        System.out.print("Introduce una temperatura para buscar: ");
        double buscarTemp = scanner.nextDouble();
        boolean encontrado = false;
        for (int i = 0; i < 5; i++) {
            if (tempMax[i] == buscarTemp) {
                System.out.println("Día " + (i + 1) + " tiene la temperatura máxima " + buscarTemp);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró ningún día con esa temperatura máxima.");
        }
    }
}
