package udla.MPerez.RC1_ResolucionDeProblemas.P2;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> productos;

    // NUEVO
    private double presupuestoDisponible;
    private int capacidadMaxima;
    private int espacioOcupado;

    public Inventario() {
        this.productos = new ArrayList<>();
        this.presupuestoDisponible = presupuestoDisponible;
        this.capacidadMaxima = capacidadMaxima;
        this.espacioOcupado = 0;
    }

    public boolean agregarProducto(Producto p) {
        double costo = p.getCantidad() * p.getPrecioUnitario();
        int espacio = p.getCantidad();

        if (costo > presupuestoDisponible) {
            System.out.println("No hay presupuesto suficiente.");
            return false;
        }
        if (espacioOcupado + espacio > capacidadMaxima) {
            System.out.println("No hay espacio suficiente en almacenamiento.");
            return false;
        }

        productos.add(p);
        presupuestoDisponible -= costo;
        espacioOcupado += espacio;

        return true;
    }

    public List<Producto> listarProductos() {
        return new ArrayList<>(productos);
    }

    public Producto buscarPorId(int id) {
        for (Producto p : productos) {
            if (p.getId() == id)
                return p;
        }
        return null;
    }

    public Producto buscarProducto(int id) {
        return null;
    }

    public boolean hayEspacio(int cantidad) {
        return false;
    }

    public boolean tienePresupuesto(double costo) {
        return false;
    }

    public boolean reabastecer(int id, int cantidad) {
        return false;
    }

    public void ocuparEspacio(int cantidad) {
    }

    public void restarPresupuesto(double costo) {
    }

    public boolean actualizarCantidad(int id, int cantidad) {
        return false;
    }

    public List<Producto> listarBajoStock() {
        return List.of();
    }

    public String getCapacidadDisponible() {
        return "";
    }

    public String getPresupuesto() {
        return "";
    }

    public void setPresupuesto(double v) {
    }

    public void setCapacidadAlmacenamiento(int i) {
    }

    public Object calcularValorTotal() {
        return null;
    }
}