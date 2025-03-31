import javax.swing.JOptionPane;

public class Prestamo {

    public static void main(String[] args) {
        MetodosDisp m = new MetodosDisp();
        {

            while (true) {
                try {
                    int opc = Integer.parseInt(JOptionPane.showInputDialog(
                            "Inventario de Prestamos\n" +
                                    "1. Registrar Dispositivo\n" +
                                    "2. Registrar Estudiante\n" +
                                    "3. Modificar Dispositivo\n" +
                                    "4. Modificar Estudiante\n" +
                                    "5. Registrar Prestamo\n" +
                                    "6. Devoluciones\n" +
                                    "7. Mostrar Inventario\n" +
                                    "8. Mostrar Prestamos\n" +
                                    "9. Eliminar Equipo\n" +
                                    "10. Eliminar Estudiante\n" +
                                    "11. Salir"));

                    if (opc < 1 || opc > 11) {
                        JOptionPane.showMessageDialog(null, "Opción no válida, intente de nuevo");
                        continue;
                    }

                    switch (opc) {
                        case 1:
                            JOptionPane.showMessageDialog(null, "Mamañema 1");
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "Mamañema 2");
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null, "Mamañema 3");

                            break;
                        case 4:
                            JOptionPane.showMessageDialog(null, "Mamañema 4");

                            break;
                        case 5:
                            JOptionPane.showMessageDialog(null, "Mamañema 5");

                            break;
                        case 6:
                            JOptionPane.showMessageDialog(null, "Mamañema 6");

                            break;
                        case 7:
                            JOptionPane.showMessageDialog(null, "Mamañema 7");
                            break;
                        case 8:
                            JOptionPane.showMessageDialog(null, "Mamañema 8");
                            break;
                        case 9:
                            JOptionPane.showMessageDialog(null, "Mamañema 9");
                            break;
                        case 10:
                            JOptionPane.showMessageDialog(null, "Mamañema 10");
                            break;
                        case 11:
                            JOptionPane.showMessageDialog(null, "Hasta luego");
                            return;
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Entrada inválida, ingrese un número válido");
                }
            }
        }
    }
}
