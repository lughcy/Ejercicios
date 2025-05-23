import java.util.Scanner;

public class PrestamoLibros {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("*** Sistema de Prestamo de Libros ***");
        final int DISTANCIA_PERMITIDA_KM = 3;

        System.out.print("Tienes credencial de estudiante(True/False)?");
        boolean tienesCredencial = Boolean.parseBoolean(consola.nextLine());

        System.out.print("A cuantos km vives de la biblioteca? ");
        int distanciaBibliotecaKm = Integer.parseInt(consola.nextLine());
        boolean esElegiblePrestamo = tienesCredencial||distanciaBibliotecaKm<=DISTANCIA_PERMITIDA_KM ;

        System.out.println("Se puede prestar libro? "+ esElegiblePrestamo);

    }
}
