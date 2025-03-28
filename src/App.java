public class App {
    import java.util.Scanner;

    public class Arrays_uno {
        public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in);
            int[] numeros = {10,20,30,40,50};
            System.out.println("el primer numero es: " + numeros[0]);
            System.out.println("El segundo numero es: "+ numeros[1]);
            int num = scanner.nextInt();
            System.out.println();
            scanner.close();
        }
