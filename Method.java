import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Method {
    Scanner sc = new Scanner(System.in);

    public Queue<FastFood> IngresarPedido(Queue<FastFood> p, int opt) {
        FastFood o = new FastFood();
        String tipo = "";
        double precioUnitario = 0;
        switch (opt) {
            case 1:
                tipo = "Perro";
                precioUnitario = 8000;
                break;
            case 2:
                tipo = "Burger";
                precioUnitario = 12000;
                break;
            case 3:
                tipo = "Chorizo";
                precioUnitario = 7000;
                break;

            default:
                tipo = "French Fries";
                precioUnitario = 5000;
                break;
        }

        o.setTipo(tipo);

        System.out.println("Ingrese el Nombre del cliente");
        String nombre = sc.next();

        boolean yaExiste = false;
        for (FastFood pedido : p) {
            if (pedido.getNombreCliente().equalsIgnoreCase(nombre)) {
                yaExiste = true;

                System.out.println("Ya existe un pedido a nombre de '" + nombre + "'");
                System.out.println("¿Qué desea hacer?");
                System.out.println("1. Agregar más cantidad al pedido existente");
                System.out.println("2. Registrar el pedido con otro nombre");
                System.out.println("3. Cancelar");

                int decision = sc.nextInt();

                if (decision == 1) {
                    System.out.println("Ingrese la cantidad a agregar:");
                    while (!sc.hasNextInt()) {
                        System.out.println("Cantidad inválida. Intente nuevamente:");
                        sc.next();
                    }
                    int extra = sc.nextInt();
                    int nuevaCantidad = pedido.getCantidad() + extra;
                    pedido.setCantidad(nuevaCantidad);
                    pedido.setTotal(nuevaCantidad * precioUnitario);
                    System.out.println("Cantidad actualizada exitosamente.");
                    return p;
                } else if (decision == 2) {
                    System.out.println("Ingrese el nuevo nombre del cliente:");
                    nombre = sc.next(); // seguimos con el nuevo nombre
                    break;
                } else {
                    System.out.println("Registro cancelado.");
                    return p;
                }
            }
        }

        o.setNombreCliente(nombre);

        System.out.println("Ingrese la cantidad");
        while (!sc.hasNextInt()) {
            System.out.println("Opcion no valida, intentelo de nuevo");
            System.out.println("-----------------------------");
            sc.next();
        }
        int cantidad = sc.nextInt();
        o.setCantidad(cantidad);

        double total = precioUnitario * cantidad;
        o.setTotal(total);

        p.offer(o);

        return p;
    }

    public void MostrarTurno(Queue<FastFood> p) {
        if (p.isEmpty()) {
            System.out.println("No hay Turnos acabaste de entrar a trabajar");
            System.out.println("-----------------------------");

        } else {
            for (FastFood o : p) {
                System.out.println(o.getNombreCliente());
                System.out.println(o.getTipo());
                System.out.println(o.getCantidad());
                System.out.println(o.getTotal());
                System.out.println();
                System.out.println("-----------------------------");
            }

        }

    }

    public Queue<FastFood> Despachar(Queue<FastFood> p) {
        if (p.isEmpty()) {
            System.out.println("No hay pedidos");
            System.out.println("-----------------------------");
        } else {
            p.remove();
        }
        return p;
    }

    public Queue<FastFood> Modificar(Queue<FastFood> p) {
        if (p.isEmpty()) {
            System.out.println("No hay pedidos para modificar:");
            return p;
        }

        System.out.println("Ingrese el nombre del cliente que desea modificar:");
        String nombreBuscar = sc.next();

        Queue<FastFood> temporal = new LinkedList<>();
        boolean encontrado = false;

        while (!p.isEmpty()) {
            FastFood actual = p.poll();

            if (actual.getNombreCliente().equals(nombreBuscar) && !encontrado) {
                encontrado = true;
                System.out.println("Pedido encontrado:");
                System.out.println("Nombre: " + actual.getNombreCliente());
                System.out.println("Comida: " + actual.getTipo());
                System.out.println("Cantidad: " + actual.getCantidad());
                System.out.println("Total: " + actual.getTotal());

                System.out.println("¿Que desea modificar?");
                System.out.println("1. Tipo de comida");
                System.out.println("2. Cantidad");
                System.out.println("3. Ambas");

                int opcion = sc.nextInt();
                sc.nextLine();

                String tipoNuevo = actual.getTipo();
                int cantidadNueva = actual.getCantidad();
                double precioUnitario = 0;

                switch (opcion) {
                    case 1:
                        tipoNuevo = selecionartipocomida();
                        break;
                    case 2:
                        System.out.println("Ingrese la nueva cantidad");
                        while (!sc.hasNextInt()) {
                            System.out.println("Opcion no valida, intentelo de nuevo");
                            System.out.println("-----------------------------");
                            sc.next();
                        }
                        cantidadNueva = sc.nextInt();
                        break;
                    case 3:
                        tipoNuevo = selecionartipocomida();
                        System.out.println("Ingrese la nueva cantidad");
                        while (!sc.hasNextInt()) {
                            System.out.println("Opcion no valida, intentelo de nuevo");
                            System.out.println("-----------------------------");
                            sc.next();
                        }
                        cantidadNueva = sc.nextInt();
                        break;
                    default:
                        System.out.println("Opcion no valida, no se realizo ningun cambio");
                        break;
                }
                switch (tipoNuevo.toLowerCase()) {
                    case "perro":
                        precioUnitario = 8000;
                        break;
                    case "burger":
                        precioUnitario = 12000;
                        break;
                    case "chorizo":
                        precioUnitario = 7000;
                        break;
                    case "french fries":
                        precioUnitario = 5000;
                        break;
                }
                actual.setTipo(tipoNuevo);
                actual.setCantidad(cantidadNueva);
                actual.setTotal(precioUnitario * cantidadNueva);

                System.out.println("Pedido actualizado exitosamente");
            }
            temporal.offer(actual);
        }

        if (!encontrado) {
            System.out.println("No se encontro ningun pedido con ese nombre");
        }
        return temporal;
    }

    private String selecionartipocomida() {
        System.out.println("Selecciona nuevo tipo de comida: ");
        System.out.println("1. Perro");
        System.out.println("2. Burger");
        System.out.println("3. Chorizo");
        System.out.println("4. French Fries");

        while (!sc.hasNextInt()) {
            System.out.println("Opción no valida por favor verifique....");
            System.out.println("-----------------------------------------------");
            sc.next();
        }
        int tipo = sc.nextInt();
        sc.nextLine();

        if (tipo < 1 || tipo > 4) {
            System.out.println("Por favor ingrese un numero entre 1 y 4");
            System.out.println("-------------------------------------------");
        }

        switch (tipo) {
            case 1:
                return "Perro";
            case 2:
                return "Burger";
            case 3:
                return "Chorizo";
            default:
                return "French Fries";
        }
    }

    public void BuscarTurno(Queue<FastFood> p) {
        if (p.isEmpty()) {
            System.out.println("No hay turnos");
            return;
        }

        System.out.println("Ingrese el nombre del cliente para buscar el turno");
        String nombre = sc.next();
        int turno = 1;
        boolean encontrado = false;

        for (FastFood item : p) {
            if (item.getNombreCliente().equalsIgnoreCase(nombre)) {
                System.out.println("El cliente ' " + nombre + " ' tiene el turno número: " + turno);
                System.out.println("-------------------------------------------");
                encontrado = true;
                break;
            }
            turno++;
        }

        if (!encontrado) {
            System.out.println("No se encotró ningún pedido con el nombre ' " + nombre + " ' ");
            System.out.println("-------------------------------------------");
        }
    }

}
