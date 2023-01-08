import java.util.Scanner;

public class ProgramaNotasAlumnos {

    public static void main(String[] args) {

        Double[] notas = new Double[20];
        Double c = 0.0, n4 = 0.0, n5 = 0.0;
        int a = 0, f = 0, g = 0;

        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            System.out.println("Escriba la calificación " + (i + 1));
            try {
                notas[i] = leer.nextDouble();
                if (notas[i] == 0) {
                    System.out.println("Error, finalizando el programa.");
                    System.exit(0);
                }
            } catch (Exception e) {
                System.out.println("Error, ingreso un tipo de dato invalido");
                System.exit(0);
            }
        }

        for (int i = 0; i < 20; i++) {
            if (notas[i] == 1) {
                a++;
            }
            if (notas[i] > 5) {
                n5 += notas[i];
                f++;
            }
            if (notas[i] < 4) {
                n4 += notas[i];
                g++;
            }
            c += notas[i];
        }
        c = (c / 20);
        n4 = (n4 / g);
        n5 = (n5 / f);

        System.out.println("Promedio de notas mayores a 5: " + n5);
        System.out.println("Promedio de notas menores a 4: " + n4);
        System.out.println("Cantidad de notas en 1 son: " + a);
        System.out.println("Promedio total = " + c);

    }
}