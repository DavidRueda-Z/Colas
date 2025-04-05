import java.util.Queue;
import java.util.Scanner;

public class MetodosComida {
    Scanner sc = new Scanner(System.in);
    public Queue<FastFood> IngresarPedido(Queue<FastFood> cola, int opt)
    {
        while(cola.isEmpty()){
            System.out.println("No hay pedidos:");
             continue;
        }
        FastFood obj = new FastFood();
        switch (opt) {
            case 1:
                obj.setTipo("Perro");
                break;
            case 2:
                obj.setTipo("Hamburguesa");
                break;
            case 3:
            obj.setTipo("Burrito");
                break;
        
            default:
            obj.setTipo("Papas Fritas"); 
                break;
        }
        System.out.println("Ingrese el nombre del cliente: ");
        obj.setNombre(sc.next());
        System.out.println("Ingrese la cantidad: ");
        obj.setCantidad(sc.nextInt());
        System.out.println("Ingrese el precio: ");
        obj.setPrecio(sc.nextDouble());
        return cola;
    }

    public void MostrarTurno(Queue<FastFood> cola)
    {   
        if(cola.isEmpty()){
            System.out.println("No hay turnos:");
        }
        else{
            for (FastFood item : cola) {
                System.out.println(item.getNombre());
            }
        }
    }

    public Queue<FastFood> Despachar(Queue<FastFood> cola)
    {
        if(cola.isEmpty()){
            System.out.println("No hay pedidos:");
        }
        else{
        for (FastFood item : cola) {
        }
        }
        return cola;
    }
}   
