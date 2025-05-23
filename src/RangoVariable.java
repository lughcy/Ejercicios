import java.util.Scanner;

public class RangoVariable {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("*** Rango de una Vriable ***");

        System.out.println("Proporciona un valr entero: ");
        int dato = Integer.parseInt(consola.nextLine());
        //Revisamos si estan dentro del rango (1y10)
        boolean estaDentroRango = dato >= 1 && dato<=10;
        System.out.println("Variable dentro de rango (1 y 10) ? " + estaDentroRango);

        //revisar la logica inversa, si el dato esta fuer de rango
        boolean estaFueraRango = !(dato >=1 && dato <= 10);
        System.out.println("Variable fuera de rango (1 y 10)? "+ estaFueraRango);

    }
}
