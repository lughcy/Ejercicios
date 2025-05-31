import java.util.Scanner;

public class MatricesTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];
        double suma = 0;
        double max = 0;
        double min = 10;

        System.out.println("Introduce 5 notas (0-10):");
        for (int i = 0; i < notas.length; i++) {
            notas[i] = scanner.nextDouble();
            suma += notas[i];
            if (notas[i] > max) max = notas[i];
            if (notas[i] < min) min = notas[i];
        }

        double media = suma / notas.length;

        System.out.println("Notas: ");
        for (double nota : notas) {
            System.out.println(nota);
        }
        System.out.println("Nota media: " + media);
        System.out.println("Nota más alta: " + max);
        System.out.println("Nota más baja: " + min);
    }
}



