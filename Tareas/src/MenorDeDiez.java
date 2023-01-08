import java.util.Scanner;

public class MenorDeDiez {

    public static void main(String[] args) {

        int[] n = new int[10];
        int menor = 0, k = 0;

        Scanner leer = new Scanner(System.in);

        try {

            for (int i = 0; i < 10; i++) {
                System.out.println("Ingresa el " + (i + 1) + " número");
                n[i] = leer.nextInt();
                System.out.println("El número " + (i + 1) + " es " + n[i]);
            }

        } catch (Exception e) {

            System.out.println("Error, el valor ingresado es incorrecto!");
            System.exit(0);

        }
        menor = n[k];
        for (int i = 0; i < 10; i++) {
            if (n[i] < menor) {
                menor = n[i];
            }
        }

        if (menor < 10){
            System.out.println("El número " + menor + " es menor que 10.");
        } else {
            System.out.println("El número " + menor + " es igual o mayor que 10.");
        }

        /* Código del profe para revisar y ajustar a mi código y sacar un solo código uniendo lo mejor de los 2.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números a comparar: ");
        int cantidad = scanner.nextInt();

        // preguntamos, si es menor a 10, ya que el mínimo según la letra de la tarea es 10 (buscar el número menor de minimo 10 valores enteros).
        if (cantidad < 10) {
            System.out.println("Error: Debe comparar al menos 10 números enteros!");
        } else {
            int menor = Integer.MAX_VALUE; // asignamos un valor máximo por defecto como numero menor para comenzar
            int numero;

            for (int i = 0; i < cantidad; i++) {
                System.out.println("Ingrese el numero " + (i + 1) + ": ");
                numero = scanner.nextInt();
                menor = (numero < menor) ? numero : menor;
            }

            System.out.println("El número menor es: " + menor);

            if (menor < 10) {
                System.out.println("El número " + menor + " es menor que 10!");
            } else {
                System.out.println("El número " + menor + " es igual o mayor que 10!");
            }
        }*/

    }
}