import java.util.Scanner;

public class InventarioProductos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Definimos el número máximo de productos
        final int MAX_PRODUCTOS = 100;
        
        // Arrays para almacenar los datos de los productos
        String[] nombres = new String[MAX_PRODUCTOS];
        int[] cantidades = new int[MAX_PRODUCTOS];
        double[] precios = new double[MAX_PRODUCTOS];
        
        int contador = 0; // Contador para el número de productos
        
        // Bucle para ingresar productos
        while (contador < MAX_PRODUCTOS) {
            System.out.println("Ingrese el nombre del producto (o 'salir' para terminar): ");
            String nombre = scanner.nextLine();
            if (nombre.equalsIgnoreCase("salir")) {
                break; // Salir del bucle si el usuario escribe 'salir'
            }
            
            System.out.println("Ingrese la cantidad en inventario: ");
            int cantidad = scanner.nextInt();
            
            System.out.println("Ingrese el precio por unidad: ");
            double precio = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer
            
            // Almacenar los datos en los arrays
            nombres[contador] = nombre;
            cantidades[contador] = cantidad;
            precios[contador] = precio;
            contador++;
            
            // Preguntar si desea agregar más productos
            System.out.println("¿Desea agregar otro producto? (s/n): ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("n")) {
                break; // Salir del bucle si el usuario no desea agregar más productos
            }
        }
        
        // Calcular el valor total del inventario
        double valorTotalInventario = 0;
        System.out.println("\nReporte de Inventario:");
        System.out.printf("%-20s %-10s %-10s %-10s\n", "Nombre", "Cantidad", "Precio", "Total");
        System.out.println("---------------------------------------------------");
        
        for (int i = 0; i < contador; i++) {
            double totalProducto = cantidades[i] * precios[i];
            valorTotalInventario += totalProducto;
            System.out.printf("%-20s %-10d $%-9.2f $%-9.2f\n", nombres[i], cantidades[i], precios[i], totalProducto);
        }
        
        // Mostrar el valor total del inventario
        System.out.printf("\nValor total del inventario: $%.2f\n", valorTotalInventario);
        
        // Opción para actualizar la cantidad de un producto
        while (true) {
            System.out.println("\n¿Desea actualizar la cantidad de un producto? (s/n): ");
            String actualizar = scanner.nextLine();
            if (actualizar.equalsIgnoreCase("n")) {
                break; // Salir del bucle si el usuario no desea actualizar
            }
            
            System.out.println("Ingrese el nombre del producto a actualizar: ");
            String nombreActualizar = scanner.nextLine();
            boolean encontrado = false;
            
            // Buscar el producto en el inventario
            for (int i = 0; i < contador; i++) {
                if (nombres[i].equalsIgnoreCase(nombreActualizar)) {
                    System.out.println("Ingrese la nueva cantidad: ");
                    int nuevaCantidad = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer
                    cantidades[i] = nuevaCantidad; // Actualizar la cantidad
                    encontrado = true;
                    System.out.println("Cantidad actualizada con éxito.");
                    break;
                }
            }
            
            if (!encontrado) {
                System.out.println("Producto no encontrado en el inventario.");
            }
        }
        
        // Cerrar el escáner
        scanner.close();
    }
}
