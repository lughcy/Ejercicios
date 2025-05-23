import java.util.Scanner;

public class ValorDentroRango {
    public static void main(String[] args) {
        System.out.println("** Valor Dentro Rango **");
        //DEF los limites 
       final int Minimo = 0;
       final int Maximo = 5;

       //Solicitar un valor entre 0 y 5
       System.out.println("Ingrese un valor entre 0 y 5: ");
       int dato = Integer.parseInt(new Scanner(System.in).nextLine());
       //verifivar si el dato esta dentro del rango 
       boolean estaDentroRango= dato >= Minimo &&dato <= Maximo ;
       System.out.println("Esta dentro del rango? "+ estaDentroRango);
       
    }
}
