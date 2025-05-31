import java.util.Scanner;

public class MatricesSiete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        int[] vector3 = new int[5];

        System.out.println("Introduce valores para vector1:");
        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = scanner.nextInt();
        }

        System.out.println("Introduce valores para vector2:");
        for (int i = 0; i < vector2.length; i++) {
            vector2[i] = scanner.nextInt();
        }

        for (int i = 0; i < vector3.length; i++) {
            vector3[i] = vector1[i] + vector2[i];
        }

        System.out.println("Vector3 (suma de vector1 y vector2):");
        for (int num : vector3) {
            System.out.println(num);
        }
    }
}