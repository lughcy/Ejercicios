public class Formateodecadenas {
    public static void main(String[] args) {
        System.out.println("*** Formateo de cadenas ***");
        String nombre = "Matias";
        int edad= 35;
        double salario = 21000.50;
        
        //string.fotmat 
        String mensaje = String.format("Nombre: %s, Edad: %d, Salario: %.2f", nombre, edad, salario);
        System.out.println(mensaje);

        // Metodo printf
        System.out.printf("Nombre: %s, Edad: %d, Salario: %.2f%n", nombre, edad, salario);


        int numeroEmpleado =12;
        //Formateo con rext block 
        mensaje= """
                %nDetalle Persona:\s
                --------------------
                \tNombre: %s 
                \tNo. Empleado: %04d
                \tEdad: %d años 
                \tSalario: %.2f
                """.formatted(nombre,numeroEmpleado, edad, salario);
        System.out.println(mensaje);

        //Formateo con tex block y prinf directamente
        System.out.printf( """
            %nDetalle Persona:\s
            --------------------------
            \tNombre: %s 
            \tNo. Empleado: %04d
            \tEdad: %d años 
            \tSalario: %.2f
            """, nombre, numeroEmpleado ,edad, salario);
    }
}
