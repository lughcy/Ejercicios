import java.util.Random;

public class MatricesUno {
    public static void main(String[] args) {
        int[] vector_numeros = new int[10];
        Random rand = new Random();

        for (int i = 0; i < vector_numeros.length; i++) {
            vector_numeros[i] = rand.nextInt(10) + 1; 
        }

        for (int num : vector_numeros) {
            System.out.println("Número: " + num + ", Cuadrado: " + (num * num) + ", Cubo: " + (num * num * num));
        }
    }
}