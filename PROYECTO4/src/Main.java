import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Crear objetos Factura
        Factura factura1 = new Factura();
        String ca;
        String da;
        String cana;
        String pa;

        //Ingreso de datos del usuario
        ca = JOptionPane.showInputDialog("Ingrese numero de pieza");
        da = JOptionPane.showInputDialog("Ingrese descripcion");
        cana = JOptionPane.showInputDialog("Ingrese cantidad");
        pa = JOptionPane.showInputDialog("Ingrese precio");

        //Convertir caracteres en enteros
        int cantidadnum = Integer.parseInt(cana);
        double precionum = Double.parseDouble(pa);

        //Asignar valokres en la clase
        factura1.setNumeroPieza(ca);
        factura1.setDescripcionPieza(da);
        factura1.setCantidad(cantidadnum);
        factura1.setPrecioPorArticulo(precionum);

        //Llamar metodo
        factura1.detalleFact();



    }
}
