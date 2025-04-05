import java.util.Queue;
import java.util.Scanner;

public class MenuComida {
    
    
    
    public Queue<FastFood> MenuComidas( Queue<FastFood> cola) {

        Scanner sc = new Scanner(System.in);
        boolean bandera = true;
        int opt = 0;
        MetodosComida m = new MetodosComida();

        while (bandera) {
            System.out.println("Bienvenido a Fast Food");
            System.out.println("Haga su pedido");
            System.out.println("1. Perro\n"+ 
            "2. Hamburguesa\n" + 
            "3. Burrito\n" + 
            "4. Papas Fritas\n" + 
            "5. Salir");

            while(!sc.hasNextInt()){
                System.out.println("Opcion no valida por favor verifique...");
                sc.next();
            }
            opt = sc.nextInt();
            sc.nextLine();

            if(opt < 1 || opt > 6)
            {
                System.out.println("Por favor ingrese un numero entre 1 y 5");
                continue;
            }

            switch (opt) {
                case 1: 
                case 2:
                case 3:
                case 4:
                    cola = m.IngresarPedido(cola, opt);
                    break;
                default:
                    System.out.println("Hasta pronto");
                    bandera = false;
                    break;
            }
        }
        return cola;
    }
}
