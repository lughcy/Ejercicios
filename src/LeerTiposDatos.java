import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("Ingresa tu edad: ");
        var edad = consola.nextInt();
        System.out.println("Edad: "+edad);

        System.out.println("Ingrese su altura: ");
        var altura = consola.nextDouble();
        System.out.println("Altura: "+ altura);
        consola.nextLine();

        System.out.println("Ingresa tu nombre: ");
        var Nombre = consola.nextLine();
        System.out.println("Nombre: "+Nombre);
        
    }
}
