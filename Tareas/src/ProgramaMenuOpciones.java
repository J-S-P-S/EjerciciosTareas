import javax.swing.*;

public class ProgramaMenuOpciones {

    public static void main(String[] args) {

        int v = 0;
        String c = "";

        do {
            JOptionPane.showMessageDialog(null, "Seleccione una opción", "Mantenedor de productos", 1);
            c = JOptionPane.showInputDialog(null, "Actualizar escriba 1 \nEliminar escriba 2 \nAgregar escriba 3 \nListar escriba 4 \nSalir escriba 5", "Opciones", 1);

            if (c == null) {
                JOptionPane.showMessageDialog(null, "Opción invalida", "Error!", 0);
                main(args);
            }

            v = c.equals("1") ? 1 : v;
            v = c.equals("2") ? 2 : v;
            v = c.equals("3") ? 3 : v;
            v = c.equals("4") ? 4 : v;
            v = c.equals("5") ? 5 : v;

            switch (v) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Producto actualizado correctamente", "Actualizar", 1);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Producto eliminado correctamente", "Eliminar", 1);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Producto agregado correctamente", "Agregar", 1);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Mostrar listado de productos", "Listar", 1);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Haz salido con exito", "Salir", 1);
                    System.exit(0);
                default:
                    main(args);
            }
        } while (v != 5);

    }
}