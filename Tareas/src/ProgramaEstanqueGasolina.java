import java.util.Scanner;

public class ProgramaEstanqueGasolina {

    public static void main(String[] args) {

        int v = 0;
        String cap ="";
        Scanner l = new Scanner(System.in);


        System.out.println("Ingrese un valor: ");

        try {
            v = l.nextInt();
        }catch (Exception e){
            System.out.println("Por favor ingrese un número, sin puntos ni comas.");
            System.exit(0);
        }

        if(v>=1 && v<=70){

            cap = v==70?"Estanque lleno":cap;
            cap = v>=60 && v<70?"Estanque casi lleno":cap;
            cap = v>=40 && v<60?"Estanque 3/4":cap;
            cap = v>=35 && v<40?"Medio Estanque":cap;
            cap = v>=20 && v<35?"Suficiente":cap;
            cap = v>=1 && v<20?"Insuficiente":cap;

            System.out.println(cap);
        } else if(v<=0) {
            System.out.println("El valor ingresado no es valido");
        } else {
            System.out.println("El valor ingresado excede la capacidad del tanque de 70 litros");
        }

    }

}
