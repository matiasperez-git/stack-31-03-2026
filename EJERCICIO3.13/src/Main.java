import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
public class Main {
    public static void main(String[] args) {

        /*Creacion de objetos de la clase*/
        Empleado trabajador1 = new Empleado();
        Empleado trabajador2 = new Empleado();

        /*Leer los datos de empleado*/
        JOptionPane.showMessageDialog(null, "Prueba Empleado\n De click en OK para comenzar");
        trabajador1.setNombre(JOptionPane.showInputDialog("Nombre"));
        trabajador1.setApellido(JOptionPane.showInputDialog("Apellido"));
        trabajador1.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Salario")));

        /*Llamar a nuestro metodo*/
        trabajador1.detalleEmpleado(trabajador1.getNombre(), trabajador1.getApellido(), trabajador1.getSalario());

        trabajador2.setNombre(JOptionPane.showInputDialog("Nombre"));
        trabajador2.setApellido(JOptionPane.showInputDialog("Apellido"));
        trabajador2.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Salario")));


        trabajador2.detalleEmpleado(trabajador2.getNombre(), trabajador2.getApellido(), trabajador2.getSalario());

        //Desplegar el Menu de Aumento//
        JOptionPane.showMessageDialog(null, "Zona de aumento\n De click en OK para ver el aumento 10%\n");
        trabajador1.aumentoEmpleado(trabajador1.getNombre(), trabajador1.getAumento());
        trabajador2.aumentoEmpleado(trabajador2.getNombre(), trabajador2.getAumento());
    }
}