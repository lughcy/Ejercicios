import java.util.Scanner;
    public class MatricesDos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] vector = new String[5];
        String[] vector_inverso = new String[5];

        System.out.println("Introduce 5 cadenas de caracteres:");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = scanner.nextLine();
        }

        for (int i = 0; i < vector.length; i++) {
            vector_inverso[i] = vector[vector.length - 1 - i];
        }

        System.out.println("Vector en orden inverso:");
        for (String s : vector_inverso) {
            System.out.println(s);
        }
    }
}
    

