import java.util.Queue;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;

//  Queue<Objpcs>  push() = offer()  pop() = poll() 
public class MetodosDisp {

    private Queue<ObjPcs> ColaPc = new LinkedList<>();
    private Queue<ObjTab> ColaTab = new LinkedList<>();

    public void RegistroPC(String opcion) {
        boolean bandera = true;
        while (bandera) {
            if (opcion.equalsIgnoreCase("PC")) {

                //Creo los campos de entrada
                JTextField seriaField = new JTextField();
                JTextField marcaField = new JTextField();
                JTextField ramField = new JTextField();
                JTextField discoDuroField = new JTextField();
                JTextField precioField = new JTextField();

                //Panel 
                JPanel panel
                
            } else {

            }
        }
    }

}
