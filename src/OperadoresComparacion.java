public class OperadoresComparacion {
    public static void main(String[] args) {
        System.out.println("*** Operadores de Comparacion ***");

        int a =3, b = 2;
        //Igualdad
        boolean resultado= a == b;
        System.out.println("Resultado a==b: "+ resultado);

        //Distinto !=
        resultado = a != b;
        System.out.println("a != b: "+ resultado);

        //mayor que 
        resultado = a>b;
        System.out.println("a > b: "+ resultado);

        //mayor o igual
        resultado = a>=b;
        System.out.println("a >= b: "+ resultado);

        //menor que 
        resultado = a<b;
        System.out.println("a<b : "+ resultado);

        //menor igual 
        resultado = a<=b;
        System.out.println("a<=b: "+ resultado);

    }
}
