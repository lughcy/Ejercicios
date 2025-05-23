import java.util.Random;

public class Nuamerosrandom {
    public static void main(String[] args) {
        System.out.println("*** NUmeros Randoms ***");
        var random = new Random();

        // Generar un numero aleatorio entre 0 y 9
        int numeroAleatorio = random.nextInt(10);
        System.out.println("numeroAleatorio = " + numeroAleatorio);

        //Generar un numero aleatorio enre 1 y 10 
        numeroAleatorio = random.nextInt(10)+1;
        System.out.println("numeroAleatorio entre 1 y 10 = "+ numeroAleatorio);
        
        //generar un numero flotante entre 0,0 y 1.0 
        float flotanteAleatorio = random.nextFloat();
        System.out.println("Flotante aleatorio entre 0.0 y 1.0 = "+ flotanteAleatorio);


    //simlar el lanzamiento de un dado (1 yy 6)
    int dado= random.nextInt(6)+1;
    System.out.println("Rasultado lanzado dado = " +dado);
    }
    

}
