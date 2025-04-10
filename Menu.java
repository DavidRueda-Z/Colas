import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        boolean bandera = true;
        int opt = 0;
        Method m = new Method();
        Scanner sc = new Scanner(System.in);
        Queue<FastFood> p = new LinkedList<>();
        while (bandera) {
            System.out.println("-----------------------------");
            System.out.println("Bienvenidos a estructuras fries!!");
            System.out.println("Que desea realizar!!");
            System.out.println("1: Ingresar Pedido");
            System.out.println("2: Visualizar Turno");
            System.out.println("3: Despachar");
            System.out.println("4: Exportar Pedidos");
            System.out.println("5: Importar Pedidos");
            System.out.println("6: Modificar pedido ");
            System.out.println("7: Buscar Turno por nombre");
            System.out.println("8: Salir");
            System.out.println("-----------------------------");
            while (!sc.hasNextInt()) {
                System.out.println("Opción no valida por favor verifique....");
                System.out.println("-----------------------------");
                sc.next();
            }
            opt = sc.nextInt();
            sc.nextLine();

            if (opt < 1 || opt > 8) {
                System.out.println("Opcion no valida, Por favor ingrese un numero entre 1 a 6");
                System.out.println("-----------------------------");
                continue;
            }
            switch (opt) {
                case 1:
                    MenuComida mc = new MenuComida();
                    p = mc.Menu(p);
                    break;
                case 2:
                    m.MostrarTurno(p);
                    break;
                case 3:
                    p = m.Despachar(p);
                    break;
                case 4:
                    Exportar e = new Exportar();
                    if (p.isEmpty()) {
                        System.out.println("No puede exportar arcivos vacios");
                        System.out.println("-----------------------------");
                    } else {
                        e.exportarArchivo(p);
                    }
                    break;
                case 5:
                    Importar i = new Importar();
                    p = i.leerArchivo();
                    break;

                case 6:
                    p = m.Modificar(p);
                    break;
                case 7:
                    m.BuscarTurno(p);
                    break;
                default:
                    System.out.println("Fue un Gusto hasta Pronto...");
                    bandera = false;
                    break;
            }
        }
    }
}
