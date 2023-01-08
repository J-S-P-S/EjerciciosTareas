import java.util.Scanner;

public class ProgramaMultiFlujos {

    public static void main(String[] args) {

        int n1 = 0, n2 = 0, m = 0;

        Scanner leer = new Scanner(System.in);

        try {
            System.out.println("Ingrese el primer valor: ");
            n1 = leer.nextInt();
            System.out.println("Ingrese el segundo valor: ");
            n2 = leer.nextInt();
        }catch (Exception e){
            System.out.println("Error!, ingreso un tipo de dato invalido");
            System.exit(0);
        }

        for (int i = 0; i < n2; i++) {
            m += n1;
        }
        System.out.println("Resultado : " + m);
/*
        El codigo del profe para revisarlo y mirarlo con detenimiento y aprender.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero a: ");
        int a = scanner.nextInt();

        System.out.println("Ingrese el numero b: ");
        int b = scanner.nextInt();
        int resultado = 0;

        // verificamos los signos de cada uno, si es positivo o negativo
        boolean positivoB = b > -1;
        boolean positivoA = a > -1;

        // calculamos el valor absoluto de a
        int absolutoA = positivoA? a: -a; // equivalente a Math.abs(a);

        // sumamos tantas veces el valor de b, segun el valor de a.
        for(int i = 0; i < absolutoA; i++){
            resultado = resultado + b;
        }

        // si ambos son negativos o si solo a es negativo damos vuelta el signo
        if((!positivoA && !positivoB) || !positivoA){
            resultado = -resultado;
        }

        System.out.println("el resultado es " + resultado);
*/
    }
}