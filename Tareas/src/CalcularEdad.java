import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalcularEdad {

    public static void main(String[] args) {

        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        Scanner leer = new Scanner(System.in);
        int año = 0, mes = 0, dia = 0;

        System.out.println("Ingrese su fecha de nacimiento con formato 'yyyy-MM-dd' ");

        try {
            Date fechaNacimiento = f.parse(leer.next());
            Date fechaActual = new Date();

            System.out.println("Fecha nacimiento = " + f.format(fechaNacimiento));
            System.out.println("Fecha actual = " + f.format(fechaActual));

            Calendar fn = Calendar.getInstance();
            Calendar fa = Calendar.getInstance();
            fn.setTime(fechaNacimiento);

            año = fa.get(Calendar.YEAR) - fn.get(Calendar.YEAR);
            mes = fa.get(Calendar.MONTH) - fn.get(Calendar.MONTH);
            dia = fa.get(Calendar.DATE) - fn.get(Calendar.DATE);

            if (mes < 0 || (mes == 0 && dia < 0)) {
                año--;
            }
            System.out.println("Edad = " + año);

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }

}