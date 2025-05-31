import java.util.Scanner;

public class MatricesTrece {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[5];
        int[][] kms = new int[5][7]; // 5 conductores, 7 días
        int[] total_kms = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce el nombre del conductor " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
            for (int j = 0; j < 7; j++) {
                System.out.print("Introduce los kilómetros conducidos por " + nombres[i] + " el día " + (j + 1) + ": ");
                kms[i][j] = scanner.nextInt();
                total_kms[i] += kms[i][j];
            }
            scanner.nextLine(); // Limpiar el buffer
        }

        System.out.println("Kilómetros totales por conductor:");
        for (int i = 0; i < 5; i++) {
            System.out.println(nombres[i] + ": " + total_kms[i]);
        }
    }
}
