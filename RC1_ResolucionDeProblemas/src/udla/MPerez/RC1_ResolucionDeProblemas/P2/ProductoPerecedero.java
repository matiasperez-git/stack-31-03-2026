package udla.MPerez.RC1_ResolucionDeProblemas.P2;

import java.time.LocalDate;

public class ProductoPerecedero extends Producto {

    private LocalDate fechaVencimiento;
    private int tiempoEntrega; // en días

    public ProductoPerecedero(int id, String nombre, int cantidad, double precio,
                              int stockMinimo, LocalDate fechaVencimiento) {
        super(id, nombre, cantidad, precio, stockMinimo);
        this.fechaVencimiento = fechaVencimiento;
    }

    public LocalDate getFechaVencimiento() { return fechaVencimiento; }
    public int getTiempoEntrega() { return tiempoEntrega; }

    public void setTiempoEntrega(int dias) { this.tiempoEntrega = dias; }

    public String infoPerecedero() {
        return mostrarInfo() +
                " | Vence: " + fechaVencimiento +
                " | Tiempo entrega: " + tiempoEntrega + " días";
    }
}