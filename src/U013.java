//Se ingresa por teclado un número positivo de uno o dos dígitos (1..99)
//mostrar un mensaje indicando si el número tiene uno o dos dígitos.
//(Tener en cuenta que condición debe cumplirse para tener dos dígitos
//un número entero)

import java.util.Scanner;

public class U013 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese un numero de uno o dos digitos: ");
        int numero = consola.nextInt();
        if(numero>9){
            System.out.println("Su numero tiene dos digitos");
        }else {  
            System.out.println("Su numero tiene un digito");
        }
    }
}
