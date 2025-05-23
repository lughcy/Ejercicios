import java.util.Scanner;

public class SistemaDeAutenticacion {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("*** Sistema de autenticación ***");
        final var USUARIO_VALIDO = "juan";
        final int PASSWORD_VALIDO = 2302;
        
        System.out.print("Cual es tu usuario: ");
        String datoUsuario = consola.nextLine();
        System.out.print("Cual es tu password: ");
        int datoPassword = Integer.parseInt(consola.nextLine());

        boolean sonCorrectos = datoUsuario.equals(USUARIO_VALIDO) && datoPassword==PASSWORD_VALIDO;
        System.out.print("Los datos son correctos? "+ sonCorrectos);

    }
}
