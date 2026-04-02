public class Appstore {
    // Arreglo fijo con 4 juegos
    Juego[] juegos = new Juego[4];

    // Constructor para inicializar los juegos
    public Appstore() {
        juegos[0] = new Juego("PuzzleMania", "rompecabezas", 20, 500, 30, 10);
        juegos[1] = new Juego("FutbolPro", "deporte", 25, 700, 20, 15);
        juegos[2] = new Juego("ShooterMax", "accion", 30, 900, 25, 18);
        juegos[3] = new Juego("MotoSpeed", "deporte", 22, 600, 10, 12);
    }

    // Mostrar todos los juegos
    public void mostrarJuegos() {
        for (int i = 0; i < juegos.length; i++) {
            juegos[i].mostrarInfo();
        }
    }

    // Comprar licencias
    public void comprarLicencia(String nombre, int cantidad) {
        for (int i = 0; i < juegos.length; i++) {
            if (juegos[i].nombre.equalsIgnoreCase(nombre)) {
                juegos[i].licenciasDisponibles += cantidad;
                System.out.println("Se compraron " + cantidad + " licencias de " + nombre);
                return;
            }
        }
        System.out.println("Juego no encontrado.");
    }

    // Vender licencias
    public void venderLicencia(String nombre, int cantidad) {
        for (int i = 0; i < juegos.length; i++) {
            if (juegos[i].nombre.equalsIgnoreCase(nombre)) {
                if (cantidad <= juegos[i].licenciasDisponibles) {
                    juegos[i].licenciasDisponibles -= cantidad;
                    juegos[i].licenciasVendidas += cantidad;
                    System.out.println("Se vendieron " + cantidad + " licencias de " + nombre);
                } else {
                    System.out.println("No hay suficientes licencias disponibles.");
                }
                return;
            }
        }
        System.out.println("Juego no encontrado.");
    }

    // Buscar el juego más vendido
    public void juegoMasVendido() {
        Juego masVendido = juegos[0];
        for (int i = 1; i < juegos.length; i++) {
            if (juegos[i].licenciasVendidas > masVendido.licenciasVendidas) {
                masVendido = juegos[i];
            }
        }
        System.out.println("El juego más vendido es: " + masVendido.nombre +
                " con " + masVendido.licenciasVendidas + " ventas.");
    }

    // Calcular descuento según las reglas del enunciado
    public void calcularDescuento(int rompecabezas, int deportes, int accion) {
        double descuento = 0;

        if (rompecabezas >= 25) {
            descuento = 0.20;
            System.out.println("Aplica descuento del 20% (por juegos de rompecabezas).");
        } else if (deportes >= 20 && accion >= 15) {
            descuento = 0.15;
            System.out.println("Aplica descuento del 15% (por deportes y acción).");
        } else {
            System.out.println("No aplica ningún descuento.");
        }
    }
}