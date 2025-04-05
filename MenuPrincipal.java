import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MenuPrincipal {

    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        boolean bandera = true;
        int opt = 0;
        MetodosComida m = new MetodosComida();
        Queue<FastFood> pedido = new LinkedList<>();

        while (bandera) {
            System.out.println("Bienvenido a Fast Food");
            System.out.println("Que desea realizar");
            System.out.println("1. Ingresar Pedido\n"+ 
            "2. Mostrar Turno\n" + 
            "3. Despachar Turno\n" + 
            "4. Exportar Pedidos\n" + 
            "5. Importar Pedido\n" + 
            "6. Salir");

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
                    MenuComida mc = new MenuComida();
                    pedido = mc.MenuPrincipal(pedido);
                    break;
                case 2:
                
                    mc
                    break;
                case 3:
                    System.out.println("Pagina 3");
                    break;
                default:
                    System.out.println("Hasta pronto");
                    bandera = false;
                    break;
            }
        }
    }
}
