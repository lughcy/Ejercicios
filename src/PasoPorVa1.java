public class PasoPorVa1{
    public static void intercambiar(int a, int b) {
        int temA = a;
        a=b;
        b=temA;
        System.out.println("Dentro del metodo: a= "+ a +", b= "+b);
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Antes de llamar al metodo: a= "+ a + ", b= "+ b);
        intercambiar(a, b);
        System.out.println("Despues de llamar el metodo: a= "+ a +", b=" +b);
    }
}
