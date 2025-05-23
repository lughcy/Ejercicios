import java.util.Scanner;

public class DescuentosVip {
    public static void main(String[] args) {
        System.out.println("*** Sistema Descuentos Vip ***");
        final int NO_PRODUCTOS_DESCUENTO = 10; 
        Scanner consola = new Scanner(System.in);
        System.out.println("Cuantos productos compraste hoy? ");
        int cantidadProductos = Integer.parseInt(consola.nextLine());

        System.out.println("Eres miembro de la tienda (True/False)? " );
        boolean tienesMembresia = Boolean.parseBoolean(consola.nextLine());

        boolean esElegible = cantidadProductos >= NO_PRODUCTOS_DESCUENTO && tienesMembresia ;

        System.out.println("Tienes acceso al descuento vip " + esElegible);
    }
}
