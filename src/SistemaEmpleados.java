import java.util.Scanner;

public class SistemaEmpleados {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese nombre del empleado: ");
        String nombreEmpleado = consola.nextLine();

        System.out.print("Ingrese su edad: ");
        int edadEmpleado = Integer.parseInt(consola.nextLine());

        System.out.println("Salario de empleado: ");
        Double salarioEmpleado = Double.parseDouble(consola.nextLine());

        System.out.println("Es jefe de departamento (true/false)");
        boolean jefeDepartamento = Boolean.parseBoolean(consola.nextLine());

        System.out.println("\nDatos del empleado: ");
        System.out.println("\tNombre: "+ nombreEmpleado);
        System.out.println("\tEdad: "+ edadEmpleado+ "años");
        System.out.println("\tSalario: $"+ salarioEmpleado);
        System.out.println("\tEs jefe de departamento?: "+jefeDepartamento);

    }
}
