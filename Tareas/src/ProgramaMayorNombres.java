import javax.swing.*;

public class ProgramaMayorNombres {


    public static void main(String[] args) {

        String n1 = "",n2="",n3="", a1="",a2="",a3="",r=""; //tener en cuenta si hay un empate o los nombres tienen     la misma cantidad de caracteres.

        
        n1 = JOptionPane.showInputDialog("Ingrese el primer nombre: ");
        a1 = JOptionPane.showInputDialog("Ingrese el primer apellido: ");

        n2 = JOptionPane.showInputDialog("Ingrese el segundo nombre: ");
        a2 = JOptionPane.showInputDialog("Ingrese el segundo apellido: ");

        n3 = JOptionPane.showInputDialog("Ingrese el tercer nombre: ");
        a3 = JOptionPane.showInputDialog("Ingrese el tercer apellido: ");

        n1 = n1.replace(" ", "");
        a1 = a1.replace(" ", "");

        n2 = n2.replace(" ", "");
        a2 = a2.replace(" ", "");

        n3 = n3.replace(" ", "");
        a3 = a3.replace(" ", "");

        r = (n1+a1).length()>(n2+a2).length()?n1+" "+a1:n2+" "+a2;
        r = r.length()>(n3+a3).length()?r:n3+" "+a3;

        System.out.println(r + " tiene el nombre más largo");

       /* String persona1 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");
        String persona2 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");
        String persona3 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");

        String max = (persona1.split(" ")[0].length() < persona2.split(" ")[0].length()) ? persona2 : persona1;
        max = (persona3.split(" ")[0].length() < max.split(" ")[0].length()) ? max: persona3;

        System.out.println("La persona con el nombre mas largo es " + max);*/
    }

}
