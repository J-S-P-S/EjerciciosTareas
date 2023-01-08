import java.util.InputMismatchException;
import java.util.Scanner;

public class DetalleFactura {
    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);

        String factura = ""; // Se crea una variable de tipo String para almacenar el nombre/descripción de la factura.
        Double p1 = 0.0d; // Se crea una variable de tipo Double para almacenar el precio del primer producto.
        Double p2 = 0.0d; // Se crea otra variable de tipo Double para almacenar el precio del segundo producto.

        System.out.println("Bienvenido al programa DetalleDeFactura");
        System.out.println("Por favor escriba el nombre o descripción de la factura");
        factura = dato.nextLine();

        try {
            System.out.println("Precio del producto 1");
            p1 = dato.nextDouble();
            System.out.println("Precio del producto 2");
            p2 = dato.nextDouble();
        } catch (InputMismatchException e){
            System.out.println("Error, debe ingresar un precio valido");
            main(args);
            System.exit(0);
        }

        p1 = p1 + p2;

        factura = factura + " tiene un total bruto de " + p1 + ", con un impuesto de " + (p1 * 0.19);
        factura = factura + " y el monto después de impuesto es de " + (p1 + (p1 * 0.19));

        System.out.println(factura);

    }
}