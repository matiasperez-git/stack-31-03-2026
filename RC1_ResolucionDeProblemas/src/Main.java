
import udla.MPerez.RC1_ResolucionDeProblemas.P2.Inventario;
import udla.MPerez.RC1_ResolucionDeProblemas.P2.Producto;
import udla.MPerez.RC1_ResolucionDeProblemas.P2.ProductoNoPerecedero;
import udla.MPerez.RC1_ResolucionDeProblemas.P2.ProductoPerecedero;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import static java.time.LocalDate.*;

public class Main {

    private static Inventario inventario = new Inventario();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        inventario.setPresupuesto(200.0);
        inventario.setCapacidadAlmacenamiento(200);

        cargarDatosEjemplo();

        boolean salir = false;

        while (!salir) {
            mostrarMenu();
            int op = leerEntero("Selecciona una opción:");

            switch (op) {
                case 1: listarTodos(); break;
                case 2: listarBajoStock(); break;
                case 3: agregarProducto(); break;
                case 4: actualizarCantidad(); break;
                case 5: mostrarValorTotal(); break;
                case 6: reabastecer(); break;
                case 0: salir = true; break;
                default: System.out.println("Opción no válida.");
            }
        }

        System.out.println("Saliendo");
    }

    private static void cargarDatosEjemplo() {
        inventario.agregarProducto(new ProductoNoPerecedero(1, "Arroz 1kg", 10, 1.5, 5));
        inventario.agregarProducto(new ProductoNoPerecedero(2, "Aceite 1L", 4, 3.0, 3));
        inventario.agregarProducto(new ProductoPerecedero(3, "Leche 1L", 8, 0.9, 5, LocalDate.now().plusDays(5)));
        inventario.agregarProducto(new ProductoPerecedero(4, "Yogurt", 2, 0.7, 5, LocalDate.now().minusDays(1)));
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Menu Inventario ---");
        System.out.println("Presupuesto disponible: $" + inventario.getPresupuesto());
        System.out.println("Capacidad disponible: " + inventario.getCapacidadDisponible());
        System.out.println("1) Lista de productos");
        System.out.println("2) Listar productos bajos en stock");
        System.out.println("3) Agregar producto");
        System.out.println("4) Actualizar cantidad");
        System.out.println("5) Mostrar valor total del inventario");
        System.out.println("6) Reabastecer producto");
        System.out.println("0) Salir");
    }

    private static int leerEntero(String mensaje) {
        System.out.print(mensaje + " ");
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.print("Debe ingresar un número: ");
        }
        int v = sc.nextInt();
        sc.nextLine();
        return v;
    }

    private static double leerDouble(String mensaje) {
        System.out.print(mensaje + " ");
        while (!sc.hasNextDouble()) {
            sc.nextLine();
            System.out.print("Debe ingresar un número válido: ");
        }
        double v = sc.nextDouble();
        sc.nextLine();
        return v;
    }

    private static void listarTodos() {
        System.out.println("\n--- Productos en inventario ---");
        for (Producto p : inventario.listarProductos()) {

            if (p instanceof ProductoPerecedero) {
                ProductoPerecedero per = (ProductoPerecedero) p;
                System.out.println(per.infoPerecedero());
            } else {
                System.out.println(p.mostrarInfo());
            }
        }
    }

    private static void listarBajoStock() {
        System.out.println("\n--- Productos bajo stock ---");
        List<Producto> bajos = inventario.listarBajoStock();

        if (bajos.isEmpty()) {
            System.out.println("No hay productos bajo stock.");
        } else {
            for (Producto p : bajos) {
                if (p instanceof ProductoPerecedero) {
                    ProductoPerecedero per = (ProductoPerecedero) p;
                    System.out.println(per.infoPerecedero());
                } else {
                    System.out.println(p.mostrarInfo());
                }
            }
        }
    }

    private static void agregarProducto() {
        int id = leerEntero("ID:");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        int cantidad = leerEntero("Cantidad:");
        double precio = leerDouble("Precio unitario:");
        int stockMin = leerEntero("Stock mínimo:");

        if (!inventario.hayEspacio(cantidad)) {
            System.out.println("No hay suficiente espacio en el almacén.");
            return;
        }

        double costo = cantidad * precio;
        if (!inventario.tienePresupuesto(costo)) {
            System.out.println("No hay presupuesto suficiente.");
            return;
        }

        System.out.print("¿Es perecedero? (si/no): ");
        String r = sc.nextLine().trim().toLowerCase();

        if (r.equals("si")) {
            System.out.print("Fecha vencimiento (YYYY-MM-DD): ");
            LocalDate fv = LocalDate.parse(sc.nextLine());

            System.out.print("Días de entrega: ");
            int dias = leerEntero("");

            ProductoPerecedero per = new ProductoPerecedero(id, nombre, cantidad, precio, stockMin, fv);
            per.setTiempoEntrega(dias);

            inventario.agregarProducto(per);

        } else {
            inventario.agregarProducto(new ProductoNoPerecedero(id, nombre, cantidad, precio, stockMin));
        }

        inventario.ocuparEspacio(cantidad);
        inventario.restarPresupuesto(costo);

        System.out.println("Producto agregado.");
    }

    private static void actualizarCantidad() {
        int id = leerEntero("ID producto:");
        int cantidad = leerEntero("Nueva cantidad:");
        if (inventario.actualizarCantidad(id, cantidad)) {
            System.out.println("Cantidad actualizada.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    private static void mostrarValorTotal() {
        System.out.printf("Valor total del inventario: %.2f\n", inventario.calcularValorTotal());
    }

    private static void reabastecer() {
        int id = leerEntero("ID producto:");
        int cantidad = leerEntero("Cantidad a agregar:");

        if (!inventario.hayEspacio(cantidad)) {
            System.out.println("No hay suficiente espacio.");
            return;
        }

        Producto p = inventario.buscarProducto(id);
        if (p == null) {
            System.out.println("Producto no encontrado.");
            return;
        }

        double costo = cantidad * p.getPrecio();
        if (!inventario.tienePresupuesto(costo)) {
            System.out.println("No hay presupuesto suficiente.");
            return;
        }

        inventario.reabastecer(id, cantidad);
        inventario.ocuparEspacio(cantidad);
        inventario.restarPresupuesto(costo);

        System.out.println("Reabastecido.");
    }
}