import java.util.Queue;
import java.util.Scanner;

public class MenuComida {
    public Queue<FastFood> Menu(Queue<FastFood> p) {
        boolean bandera = true;
        int opt = 0;
        Method m = new Method();
        Scanner sc = new Scanner(System.in);
        while (bandera) {
            System.out.println("-----------------------------");
            System.out.println("Bienvenidos a estructuras fries!!");
            System.out.println("Que desea comer!!");
            System.out.println("1: Perro");
            System.out.println("2: Burger");
            System.out.println("3: Chorizo");
            System.out.println("4: French Fries");
            System.out.println("5: Salir");
            while (!sc.hasNextInt()) {
                System.out.println("Opción no valida por favor verifique....");
                System.out.println("-----------------------------------------------");
                sc.next();

            }
            opt = sc.nextInt();
            sc.nextLine();
            if (opt < 1 || opt > 5) {
                System.out.println("Por favor ingrese un numero entre 1 a 5");
                System.out.println("-------------------------------------------");
                continue;
            }
            switch (opt) {
                case 1:
                case 2:
                case 3:
                case 4:
                    p = m.IngresarPedido(p, opt);
                    break;

                default:
                    System.out.println("Fue un Gusto hasta Pronto...");
                    bandera = false;
                    break;
            }
        }
        return p;
    }
}
