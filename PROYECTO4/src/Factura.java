import javax.swing.*;

public class Factura {
    // Variables de instancia
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    // Constructor

    public Factura() {
    }

    public Factura(String numeroPieza, String descripcionPieza, int cantidad, double precioPorArticulo) {
        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;
        this.cantidad = cantidad;
        this.precioPorArticulo = precioPorArticulo;
    }

    // Métodos getter y setter
    public void setNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public String getNumeroPieza() {
        return numeroPieza;
    }

    public String getDescripcionPieza() {
        return descripcionPieza;
    }

    public void setDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad > 0)
            this.cantidad = cantidad;
        else
            this.cantidad = 0;
    }

    public double getPrecioPorArticulo() {
        return precioPorArticulo;
    }

    public void setPrecioPorArticulo(double precioPorArticulo) {
        if (precioPorArticulo > 0.0)
            this.precioPorArticulo = precioPorArticulo;
        else
            this.precioPorArticulo = 0.0;
    }

    public void detalleFact() {
        double pt = cantidad * precioPorArticulo; // Calcular total dentro del metodo
        String df1 = "Factura\n"
                + "Número de pieza: " + numeroPieza
                + "\nDescripción: " + descripcionPieza
                + "\nCantidad: " + cantidad
                + "\nPrecio por artículo: $" + precioPorArticulo
                + "\nPrecio total: $" + pt;

        JOptionPane.showMessageDialog(null, df1);
    }
}