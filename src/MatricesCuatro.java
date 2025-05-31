import java.util.Scanner;

public class MatricesCuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vector = new int[10];
        int count = 0;

        System.out.println("Introduce números (negativo para terminar):");
        while (count < vector.length) {
            int num = scanner.nextInt();
            if (num < 0) break;
            vector[count++] = num;
        }

        System.out.println("Elementos introducidos:");
        for (int i = 0; i < count; i++) {
            System.out.println(vector[i]);
        }
    }
}

