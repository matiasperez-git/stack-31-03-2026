package udla.MPerez.RC1_ResolucionDeProblemas.P2;
import java.time.LocalDate;

public class Producto {

    protected int id;
    protected String nombre;
    protected int cantidad;
    protected double precio;
    protected int stockMinimo;

    public Producto(int id, String nombre, int cantidad, double precio, int stockMinimo) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.stockMinimo = stockMinimo;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public int getCantidad() { return cantidad; }
    public double getPrecio() { return precio; }
    public int getStockMinimo() { return stockMinimo; }

    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public String mostrarInfo() {
        return "ID: " + id +
                " | Nombre: " + nombre +
                " | Cantidad: " + cantidad +
                " | Precio: " + precio +
                " | Stock mínimo: " + stockMinimo;
    }
}