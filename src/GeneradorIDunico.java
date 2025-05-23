import java.util.Random;
import java.util.Scanner;

public class GeneradorIDunico {
    public static void main(String[] args) {
      System.out.println("*** Gnerador de ID unico ***");
      Scanner consola = new Scanner(System.in);
      var random = new Random();

      //Solicitamos los datos del usuario 

      System.out.println("Ingresa tu nombre: ");
      String nombre = consola.nextLine();

      System.out.println("Ingresa tu apellido: ");
      String apellido = consola.nextLine();

      System.out.print("Ingresa tu fecha de nacimiento(YYYY): ");
      String anioNacimiento = consola.nextLine();


      //Normalizar valores
      String nombre2 = nombre.trim().toUpperCase().substring(0,2);
      String apellido2 = apellido.trim().toUpperCase().substring(0,2);
      var anioNacimiento2 =anioNacimiento.trim().substring(2);

      //Generamos numero aleatorio
      int numeroAleatorio=random.nextInt(9999)+1;

      //Formato de 4 digitos
      String numeroAleatorioFormato = String.format("%04d", numeroAleatorio);



      String idUnico = nombre2+apellido2+anioNacimiento2+numeroAleatorioFormato;

      System.out.printf("""
              %nHola %s,
              \tTu numero de identificación (ID)generado por el sistema es: 
              \t%s
              \t¡Felicidades!
              """, nombre,idUnico);
    }
}
