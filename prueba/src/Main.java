import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Appstore tienda = new Appstore();
        int opcion;

        do {
            System.out.println("\n--- MENÚ APP STORE ---");
            System.out.println("1. Ver información de los juegos");
            System.out.println("2. Comprar licencias");
            System.out.println("3. Vender licencias");
            System.out.println("4. Ver juego más vendido");
            System.out.println("5. Calcular descuento");
            System.out.println("6. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> tienda.mostrarJuegos();
                case 2 -> {
                    System.out.print("Nombre del juego: ");
                    String nombre = sc.nextLine();
                    System.out.print("Cantidad a comprar: ");
                    int cant = sc.nextInt();
                    tienda.comprarLicencia(nombre, cant);
                }
                case 3 -> {
                    System.out.print("Nombre del juego: ");
                    String nombre = sc.nextLine();
                    System.out.print("Cantidad a vender: ");
                    int cant = sc.nextInt();
                    tienda.venderLicencia(nombre, cant);
                }
                case 4 -> tienda.juegoMasVendido();
                case 5 -> {
                    System.out.print("Cantidad de licencias de rompecabezas: ");
                    int rompecabezas = sc.nextInt();
                    System.out.print("Cantidad de licencias de deportes: ");
                    int deportes = sc.nextInt();
                    System.out.print("Cantidad de licencias de acción: ");
                    int accion = sc.nextInt();
                    tienda.calcularDescuento(rompecabezas, deportes, accion);
                }
                case 6 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 6);
    }
}