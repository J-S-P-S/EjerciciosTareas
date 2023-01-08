import java.util.Scanner;

public class ProgramaManejoDeNombres {

    public static void main(String[] args) {

        String n = "";  //Variable solicitada para almacenar nombre1
        String n2 = ""; //Variable solicitada para almacenar nombre2
        String n3 = ""; //Variable solicitada para almacenar nombre3

        Scanner input = new Scanner(System.in); // Clase de Java que permite obtener datos de entrada por consola.
        StringBuilder sb = new StringBuilder(); // Clase de Java que permite concatenar de la forma más eficiente.

        System.out.println("Escriba el primer nombre: ");
        n = input.nextLine();       //Leer línea siguiente por consola
        System.out.println("Escriba el segundo nombre: ");
        n2 += input.nextLine();     //Leer línea siguiente por consola
        System.out.println("Escriba el tercer nombre: ");
        n3 += input.nextLine();     //Leer línea siguiente por consola

        if (n.length() >= 2 && n2.length() >= 2 && n3.length() >= 2) {
            sb.append(n.substring(1, 2).toUpperCase()).append(".").append(n.substring(n.length() - 2)).
                    append("_").append(n2.substring(1, 2).toUpperCase()).append(".").append(n2.substring(n2.length() - 2)).
                    append("_").append(n3.substring(1, 2).toUpperCase()).append(".").append(n3.substring(n3.length() - 2));

            System.out.println("resultado = " + sb);
        } else {
            System.out.println("Por favor compruebe que los nombres ingresados tengan al menos 3 caracteres");
        }
       /* Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un nombre de un familiar:");
        String nombreA = scanner.nextLine();
        String nombreA2 = nombreA.toUpperCase().charAt(1) + "." + nombreA.substring(nombreA.length()-2);

        System.out.println("Ingrese otro nombre de un familiar:");
        String nombreB = scanner.nextLine();
        String nombreB2 = nombreB.toUpperCase().charAt(1) + "." + nombreB.substring(nombreB.length()-2);

        System.out.println("Ingrese otro nombre de un familiar:");
        String nombreC = scanner.nextLine();
        String nombreC2 = nombreC.toUpperCase().charAt(1) + "." + nombreC.substring(nombreC.length()-2);

        String resultado = nombreA2 + "_" + nombreB2 + "_" + nombreC2;

        System.out.println(resultado);*/
    }
}
