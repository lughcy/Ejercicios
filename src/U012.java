//Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete
//mostrar un mensaje "Promocionado".
import java.util.Scanner;

public class U012 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese nota 1: ");
        double notaUno = consola.nextDouble();
        System.out.print("Ingrese nota 2: ");
        double notaDos = consola.nextDouble();
        System.out.print("Ingrese nota 3: ");
        double notaTres = consola.nextDouble();
        double promedio = notaUno+notaDos+notaTres/3;
        System.out.println("Su promedio es: "+ promedio);
        if (promedio>=7) {
            System.out.println("Promocionado");
        } else{
            System.out.println("Su promedio es menor a 7 NO PROMOCIONADO ");
        }
    }
}
