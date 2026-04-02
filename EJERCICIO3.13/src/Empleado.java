import javax.swing.*;

/** Se crea la clase empleados**/

public class Empleado {
    private String nombre;
    private String apellido;
    private double salario;
    private double aumento;


    /** Creacion del constructor **/

    public Empleado() {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.aumento = aumento;

    }



    /*Getter and Setter*/

    public double getAumento() {
        aumento=(13.2*salario);

        return aumento;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {



        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {

        return salario;
    }

    public void setSalario(double salario) {


        while (salario < 0) {
            salario = Double.parseDouble(JOptionPane.showInputDialog(
                    "El salario no puede ser negativo. Ingrese un salario válido:"));
        }
        this.salario = salario;

    }

    public void detalleEmpleado(String n, String a, Double s){
        JOptionPane.showMessageDialog(null,n + "\n" + a + "\n"+"Salario Anual :"+ s*12);

    }

    public void aumentoEmpleado(String n, Double a){
        JOptionPane.showMessageDialog(null,"SALARIO ANUAL +10% : \n"+n+"\n"+a);

    }

}