public class OperadoresLogicos {
    public static void main(String[] args) {
        System.out.println("***Operadores Logicos ***");
        boolean a = true, b = false; 
        boolean resultado = a&&b;
        System.out.println("Resultado: "+ resultado);

        //operador OR ||
        boolean c=true  , d=true ;
        resultado = c||d;
        System.out.println("Resultado = "+ resultado);

        //Operador Not !
        boolean A=false;
        resultado = !A;
        System.out.println("!A: "+ resultado);
    }
}
