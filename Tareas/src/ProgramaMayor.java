import java.util.Scanner;

public class ProgramaMayor {

    public static void main(String[] args) {

        int n1 = 0, n2 = 0, r = 0, r2 = 0;
        Scanner l = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        n1 = l.nextInt();
        System.out.println("Ingrese el segundo número: ");
        n2 = l.nextInt();

        r = (n1 > n2) ? n1 : n2;
        r2 = (r > n1) ? n1 : n2;
        System.out.println("El número mayor es = " + r + " y el menor es: " + r2);

    }
}
    /*import java.util.Scanner;

public class ProgramaOrdenarNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero 1: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el numero 2: ");
        int num2 = scanner.nextInt();

        String resultado = (num1 > num2) ? num1 + " y " + num2 : num2 + " y " + num1;

        System.out.println("El orden es: " + resultado);

    }*/
