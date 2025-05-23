public class OperadoreAsignacion {
    public static void main(String[] args){
    System.out.println("*** Operadores de Asignacion ***");
    //asignacion
    int miNumero = 10;
    
    //Asignacion Compuesto
    //+=
    miNumero +=5; //minumero = minumero + 5->15
    System.out.println(miNumero);

    //-=, *=, /= y %=
    miNumero *= 2; //miNumero = miNUmero * * -> 30

    System.out.println(miNumero);

    //Asignacion de variables multiples 
    int a = 10, b= 15, c= 20;
    System.out.printf("a = %d, b = %d, c= %d", a, b, c);
    }
}
