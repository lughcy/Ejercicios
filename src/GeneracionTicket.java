import java.util.Scanner;

public class GeneracionTicket {
    public static void main(String[] args) {
        System.out.println("*** Generacion de ticket de venta ***");
        Scanner consola = new Scanner(System.in);

        System.out.print("Precio leche: ");
        double precioLeche = Double.parseDouble(consola.nextLine());

        System.out.print("Precio pan: ");
        double precioPan = Double.parseDouble(consola.nextLine());

        System.out.print("Precio lechuga: ");
        double precioLechuga = Double.parseDouble(consola.nextLine());

        System.out.print("Precio platanos: ");
        double precioPlatano = Double.parseDouble(consola.nextLine());

        System.out.print("Aplicar algún descuento (%)? ");
        int descuentoPorcentaje = Integer.parseInt(consola.nextLine());
       
        //Calculo subtotal sin impuestos 
        double subtotal= precioLeche+precioLechuga+precioPan+precioPlatano;

        //Aplicar el descuento 
        double descuento = subtotal * (descuentoPorcentaje/100.0);

        //Subtotal con descuento
        double subtotalConDescuento= subtotal-descuento;

        //Calculo con impuesto (16%)
        double impuesto = subtotalConDescuento * 0.16;

        //Calculo total de la compra (con impuestos)
        double costoTotalCompra= subtotalConDescuento+impuesto;

        //Imprimir ticket de venta 
        System.out.printf("""
            %nTicket de Venta 
            %n-------------
            Subtotal: %.2f
            Descuento: %.2f (%d%%)
            Impuesto: (16%%): %.2f
            Costo total de la compra: %.2f
        """, subtotal,descuento,descuentoPorcentaje, impuesto, costoTotalCompra);

    }
}
