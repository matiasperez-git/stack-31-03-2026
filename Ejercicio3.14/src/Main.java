import javax.swing.*;

public class  Main {
    public static void main(String[] args) {

        /**Creacion de objetos de la clase */
        Fecha fecha1 = new Fecha(10,14,2025);
        Fecha fecha2 = new Fecha(10,15,2025);

        /** Lectura de valores */
        System.out.println("MOSTRAR FECHA: ");
        fecha1.mostrarfecha();

        /** Modificacion de los metodos */
        fecha1.establecermes(11);
        fecha1.establecerdia(18);
        fecha1.estableceraño(2025);

        /** Ingreso de valores por medio de Cajas /
         int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes:"));
         int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día:"));
         int año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año:"));

         /**Creacion de objetos de la clase Cajas /
         Fecha fecha3 = new Fecha(mes, dia, año);

         /** Lectura de valores por cajas  /
         JOptionPane.showMessageDialog(null,"Fecha : "+ fecha3.mostrarfecha1()); */


        /** Lectura de valores */
        System.out.println("\n" + "Mostrar Fecha Modificada: ");
        fecha1.mostrarfecha();

    }

}