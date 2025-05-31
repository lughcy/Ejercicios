import java.util.Arrays;
import java.util.Random;

public class MatricesCinco {
    public static void main(String[] args) {
        int[] vector = new int[10];
        Random rand = new Random();

        for (int i = 0; i < vector.length; i++) {
            vector[i] = rand.nextInt(100); // Valores aleatorios
        }

        Arrays.sort(vector);

        System.out.println("Vector ordenado:");
        for (int num : vector) {
            System.out.println(num);
        }
    }
}
