import java.util.Scanner;

public class RecetasdeCocina {
    public static void main(String[] args) {   
        Scanner consola = new Scanner(System.in);

        System.out.println("-- Recetas de cocina --");
        System.out.print("Ingrese el nombre: ");
        String nombreReceta = consola.nextLine();

        System.out.print("Ingresa los ingrendientes: ");
        String ingredientes = consola.nextLine();

        System.out.print("Ingresa el tiempo de preparación: ");
        int tiempoPreparacion = Integer.parseInt(consola.nextLine());

        System.out.print("Ingresa la dificultad: ");
        String dificultad = consola.nextLine();

        System.out.println("-- Receta de cocina --");

        System.out.println("\tNombre receta: "+ nombreReceta);
        System.out.println("\tIngredienes: "+ ingredientes);
        System.out.println("\tTiempo de preparación: "+ tiempoPreparacion+ "Minutos");
        System.out.println("\tTDificultad: "+ dificultad);

    }
}
