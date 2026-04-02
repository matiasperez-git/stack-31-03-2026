public class PerfilMedico {
    /** Creacion de atributos**/
    private String Nombre;
    private String Apellido;
    private String Sexo;
    private double Dia;
    private double Mes;
    private double Año;
    private double Altura;
    private double Peso;

    /** Contructores y Destructores **/
    public PerfilMedico(String nombre, String sexo, String apellido, double dia, double mes, double año, double altura, double peso) {
        this.Nombre = nombre;
        this.Sexo = sexo;
        this.Apellido = apellido;
        this.Dia = dia;
        this.Mes = mes;
        this.Año = año;
        this.Altura = altura;
        this.Peso = peso;
    }

    public PerfilMedico() {

    }

    /** Metodos propios de JAVA (get / set)**/
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public double getDia() {
        return Dia;
    }

    public void setDia(double dia) {
        Dia = dia;
    }

    public double getMes() {
        return Mes;
    }

    public void setMes(double mes) {
        Mes = mes;
    }

    public double getAño() {
        return Año;
    }

    public void setAño(double año) {
        Año = año;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double altura) {
        Altura = altura;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }
    /** Metodos propios **/
    /** Edad en años **/
    public void AñosPaciente(){
        System.out.println("Edad: " + (2025-this.Año));
    }

    /** Mostrar datos del Paciente **/
    public void DetallePaciente(){
        System.out.println ("Nombre: "+ this.Nombre + "\n" +
                "Apellido: " + this.Apellido + "\n" +
                "Sexo: " + this.Sexo + "\n" +
                "Fecha de Nacimiento: " + this.Dia + "-" + this.Mes + "-" + this.Año + "\n" +
                "Altura: " + this.Altura + "\n" +
                "Peso: " + this.Peso + "\n");
    }

    /** BMI **/
    public void BMI(){
        System.out.println("BMI: " + (this.Peso / (this.Altura*this.Altura)));
    }

    /** Frecuencia Crdiaca **/
    public double FreCar(){
        double edad = 2025 - this.Año;
        return (220 - edad);
    }
}
