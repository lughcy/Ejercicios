public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println("*** Operadores Unarios ***");
        int a= 3, b= -2, resultado;
        boolean c = true;
        
        //Operador Unario +
        resultado= +a;
        System.out.println("Resultado +a: "+ resultado);
        //Operador unario -
        resultado= -a;
        System.out.println("Resultado -a: "+ resultado);

        //Operadores de incremento/decremento
        //Preincremento
        a= 3;
        resultado = ++a; // primero se ibcrementa el valor
        System.out.println("Resultado ++a: "+ resultado); 
        //Post-incremento 
        a=3;
        resultado=a++; //primero se usa el valor y despues se incrementa 
        System.out.println("Resultado a++: " +resultado);
        System.out.println("En este momento se incrementa: "+ a);

        //Pre-decremento
        b = -2; 
        resultado = --b;//Primero de incrementa y desoyes se usa el valor 
        System.out.println("Resultado --b: "+ resultado);

        //post decremento 
        b =-2;
        resultado=b--;
        System.out.println("Resultado b-- "+resultado);
        System.out.println("En este momento se decrementa "+b);


    }
}
