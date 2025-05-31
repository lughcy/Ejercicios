import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatricesOcho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nombres = new ArrayList<>();
        List<Integer> edades = new ArrayList<>();

        while (true) {
            System.out.print("Introduce el nombre del alumno (o '*' para terminar): ");
            String nombre = scanner.nextLine();
            if (nombre.equals("*")) break;

            System.out.print("Introduce la edad de " + nombre + ": ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            nombres.add(nombre);
            edades.add(edad);
        }

        System.out.println("Alumnos mayores de edad:");
        for (int i = 0; i < edades.size(); i++) {
            if (edades.get(i) >= 18) {
                System.out.println(nombres.get(i));
            }
        }

        int maxEdad = edades.stream().max(Integer::compare).orElse(-1);
        System.out.println("Alumnos mayores (más edad):");
        for (int i = 0; i < edades.size(); i++) {
            if (edades.get(i) == maxEdad) {
                System.out.println(nombres.get(i));
            }
        }
    }
}
