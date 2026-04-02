public class Juego {
    // Atributos básicos
    String nombre;
    String categoria;
    double precio;
    int tamanioKB;
    int licenciasDisponibles;
    int licenciasVendidas;

    // Constructor
    public Juego(String nombre, String categoria, double precio, int tamanioKB, int licenciasDisponibles, int licenciasVendidas) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.tamanioKB = tamanioKB;
        this.licenciasDisponibles = licenciasDisponibles;
        this.licenciasVendidas = licenciasVendidas;
    }

    // Mostrar la información del juego
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Categoría: " + categoria);
        System.out.println("Tamaño: " + tamanioKB + " KB");
        System.out.println("Precio: $" + precio);
        System.out.println("Licencias disponibles: " + licenciasDisponibles);
        System.out.println("Licencias vendidas: " + licenciasVendidas);
        System.out.println("-----------------------------");
    }
}