package udla.mperez.pooh.p1;

public class Alumno extends  Persona{
    /** Atrbutos propios de Subclase alumnos*/
    private double notap1;
    private double notap2;
    private double notap3;

    /** Cosntrcutores y Destrucutores*/
    public  Alumno() {
    }

    public Alumno(double notap1, double notap2, double notap3) {
        this.notap1 = notap1;
        this.notap2 = notap2;
        this.notap3 = notap3;
    }

    public Alumno(String nombre, String apellido, int edad, String genero, double notap1, double notap2, double notap3) {
        super(nombre, apellido, edad, genero);
        this.notap1 = notap1;
        this.notap2 = notap2;
        this.notap3 = notap3;
    }

    /** METODOS PROPIOS DE JAVA*/
    public double getNotap1() {
        return notap1;
    }

    public void setNotap1(double notap1) {
        this.notap1 = notap1;
    }

    public double getNotap2() {
        return notap2;
    }

    public void setNotap2(double notap2) {
        this.notap2 = notap2;
    }

    public double getNotap3() {
        return notap3;
    }

    public void setNotap3(double notap3) {
        this.notap3 = notap3;
    }
}
