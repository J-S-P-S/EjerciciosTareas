import java.util.Scanner;

public class CalcularAreaCirculo {

    public static void main(String[] args) {

        Double area, pi, r = 0.0;
        System.out.println("Ingrese el radio del circulo: ");
        Scanner leer = new Scanner(System.in);

        try {
            r = leer.nextDouble();
            pi = Math.PI;
            area = pi * Math.pow(r, 2.0);
            System.out.println("área del circulo = " + area);

        } catch (Exception e) {
            System.err.println("Error!, ingreso un tipo de dato invalido" + e.getMessage());
            System.exit(1);
        }
    }
}