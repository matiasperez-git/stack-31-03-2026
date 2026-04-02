import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, IOException {
        /** Ejercicio 3.17 **/
        /** Creacion de objetos de la clase **/
        PerfilMedico paciente1 = new PerfilMedico();

        /** Libreria **/
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        /** Lectura de Datos **/
        System.out.println("Datos del Paciente: ");
        System.out.println("Nombre: ");
        paciente1.setNombre(br.readLine());
        System.out.println("Apellido: ");
        paciente1.setApellido(br.readLine());
        System.out.println("Sexo: ");
        paciente1.setSexo(br.readLine());
        System.out.println("\nFecha de Nacimiento: ");
        System.out.println("Dia: ");
        paciente1.setDia(Double.parseDouble(br.readLine()));
        System.out.println("Mes: ");
        paciente1.setMes(Double.parseDouble(br.readLine()));
        System.out.println("Año: ");
        paciente1.setAño(Double.parseDouble(br.readLine()));
        System.out.println("\nAltura y Peso: ");
        System.out.println("Altura: ");
        paciente1.setAltura(Double.parseDouble(br.readLine()));
        System.out.println("Peso: ");
        paciente1.setPeso(Double.parseDouble(br.readLine()));

        /** Mostrar Datos **/
        paciente1.DetallePaciente();

        /** Edad en años **/
        paciente1.AñosPaciente();

        /** BMI **/
        paciente1.BMI();

        /** Tabla de BMI **/
        System.out.println("Valores de BMI: \n Bajo Peso: menos de 18.5 \n Normal: entre 18.5 y 24.9 \n Sobrepeso: entre 25 y 29.9 \n Obeso: 30 o más ");

        /** Frecuencia Cardiaca **/
        System.out.println("Frecuencia Crdiaca Maxima: " + paciente1.FreCar());
        System.out.println("Frecuencia Crdiaca Rango: " + (paciente1.FreCar()*0.50) + "-" + (paciente1.FreCar()*0.85));
    }

}