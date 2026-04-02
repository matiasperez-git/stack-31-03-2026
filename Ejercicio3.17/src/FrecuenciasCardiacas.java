import java.time.LocalDate;
public class FrecuenciasCardiacas {
    /** Atributos de la clase*/

    private String primerNombre;
    private String apellido;
    private int año;
    private int dia;
    private int mes;
    private int frecuenciaMax;
    /** Creacion de constructores*/

    public FrecuenciasCardiacas() {
    }

    public FrecuenciasCardiacas(String primerNombre, String apellido,
                                int año, int dia, int mes, int frecuenciaMax,
                                int frecuenciasMin) {
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.año = año;
        this.dia = dia;
        this.mes = mes;
        this.frecuenciaMax = frecuenciaMax;
    }

    /** Metodos del programa */

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getFrecuenciaMax() {
        return frecuenciaMax;
    }

    public void setFrecuenciaMax(int frecuenciaMax) {
        this.frecuenciaMax = frecuenciaMax;
    }

    /** Metodos del programador*/

    /** Pide los datos del paciente y sus datos */

    public void Paciente(String pn, String ap){
        // Desplegar detalles de nombre y apell
        System.out.println("Nombre:" + pn);
        System.out.println("Apellido:" + ap);
    }

    /**Desplegar detalles de la fecha de nacimiento */

    public void fechaNacimiento (int d,int m,int a){
        System.out.println("Fecha de nacimiento " + d + "-" + m + "-" + a);
    }

    /**Calcula la edad de la persona*/

    public void EdadPersona(int a) {
        int edad;
        int anioActual = LocalDate.now().getYear(); // Obtiene el año actual del sistema
        edad = anioActual - a;
        System.out.println("Edad: " + edad);
        FrecuenciaCardiaca(edad);
    }
    /** Calcula las frecuencias cardicas (Maxima y Relativa) */

    public void FrecuenciaCardiaca(int edad) {
        int pulsoMax = 220 - edad;
        frecuenciaMax = pulsoMax;
        double fceMin = 0.50 * pulsoMax;
        double fceMax = 0.85 * pulsoMax;
        System.out.println("Frecuencia Cardiaca Maxima: " + frecuenciaMax + " ppm");
        System.out.println("FCE Minima (50%): " + fceMin + " ppm");
        System.out.println("FCE Maxima (85%): " + fceMax + " ppm");
    }
}
