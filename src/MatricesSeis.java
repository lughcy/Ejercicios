import java.util.Scanner;

public class MatricesSeis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.print("Introduce un número de mes (1-12): ");
        int mes = scanner.nextInt();

        if (mes >= 1 && mes <= 12) {
            System.out.println("Mes: " + meses[mes - 1] + ", Días: " + dias[mes - 1]);
        } else {
            System.out.println("Mes inválido.");
        }
    }
}
