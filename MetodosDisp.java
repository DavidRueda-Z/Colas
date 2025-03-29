import java.util.Queue;
import java.util.LinkedList;
import javax.swing.JOptionPane;


//  Queue<Objpcs>  push() = offer()  pop() = poll() 
public class MetodosDisp {
    
    private Queue<ObjPcs> ColaPc= new LinkedList<>();
    private Queue<ObjTab> ColaTab = new LinkedList<>();

    public void llenarPC(String opcion)
    {
        boolean bandera = true;
        while(bandera)
        {   
            if(opcion.equalsIgnoreCase("PC")){

            
            ObjPcs obj = new ObjPcs();

            obj.setSerial(JOptionPane.showInputDialog("Ingrese el Serial del PC: "));
            obj.setMarca(JOptionPane.showInputDialog("Ingrese la marca: "));
            obj.setRam(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el tamaño de la memoria RAM")));
            obj.setDiscoDuro(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del disco duro en GB: ")));
            obj.setPrecio(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del equipo: ")));
            

            }
            else{

            }
        }
    }

}
