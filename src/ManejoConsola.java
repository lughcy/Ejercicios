import java.util.Scanner;

public class ManejoConsola {
    public static void main(String[] args) {
        Scanner consolaA = new Scanner(System.in);
        System.out.println("Escribe tu nombre: ");
        var nombre = consolaA.nextLine();
        System.out.println("Nombre: " + nombre);
    }

}
