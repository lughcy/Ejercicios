//Realizar un programa que solicite la carga por teclado de dos números,
//si el primero es mayor al segundo informar su suma y diferencia,
//en caso contrario informar el producto y la división
//del primero respecto al segundo.

import java.util.Scanner;

public class U011 {
    public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);
    System.out.print("Ingresa numero uno: ");
    double numUno = consola.nextDouble();
    System.out.print("Ingresa el numero dos: ");
    double numDos = consola.nextDouble();

    if (numUno>numDos){
        double suma = numUno+numDos;
        double diferencia = numUno-numDos;
        System.out.print("Suma= "+ suma +" Diferencia= "+diferencia);
    }else {
        double producto = numUno*numDos;
        if(numDos != 0){
        double division = numUno/numDos;
        System.out.print("Producto= "+ producto+ " Division= "+ division);
    }else{
        System.out.print("No se puede dividir entre 0");
            }
        }
    }
}