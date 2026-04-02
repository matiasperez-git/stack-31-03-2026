package Hospital;

import Datos.BaseDatos;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws Exception {

        BaseDatos bd = new BaseDatos();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== SISTEMA DE CITAS MÉDICAS =====");
            System.out.println("1. Registrar paciente");
            System.out.println("2. Registrar médico");
            System.out.println("3. Crear cita");
            System.out.println("4. Mostrar pacientes");
            System.out.println("5. Mostrar médicos");
            System.out.println("6. Mostrar citas");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("ID: ");
                    int idP = sc.nextInt(); sc.nextLine();
                    System.out.print("Nombre: ");
                    String nomP = sc.nextLine();
                    System.out.print("Cédula: ");
                    String ced = sc.nextLine();
                    System.out.print("Edad: ");
                    int edad = sc.nextInt(); sc.nextLine();
                    System.out.print("Teléfono: ");
                    String tel = sc.nextLine();

                    Paciente p = new Paciente(idP, nomP, ced, edad, tel);
                    bd.insertarPaciente(p);
                    System.out.println(p.imprimirDatos());
                    bd.mostrarPacientes();
                    break;

                case 2:
                    System.out.print("ID: ");
                    int idM = sc.nextInt(); sc.nextLine();
                    System.out.print("Nombre: ");
                    String nomM = sc.nextLine();
                    System.out.print("Especialidad: ");
                    String esp = sc.nextLine();
                    System.out.print("Horario: ");
                    String hor = sc.nextLine();

                    Medico m = new Medico(idM, nomM, esp, hor);
                    bd.insertarMedico(m);
                    System.out.println(m.imprimirDatos());
                    bd.mostrarMedicos();
                    break;

                case 3:
                    System.out.print("ID Cita: ");
                    int idC = sc.nextInt(); sc.nextLine();
                    System.out.print("Fecha: ");
                    String fecha = sc.nextLine();
                    System.out.print("Hora: ");
                    String hora = sc.nextLine();
                    System.out.print("ID Paciente: ");
                    int idPac = sc.nextInt();
                    System.out.print("ID Médico: ");
                    int idMed = sc.nextInt();

                    Cita c = new Cita(idC, fecha, hora, idPac, idMed);
                    bd.insertarCita(c);
                    System.out.println(c.imprimirDatos());
                    bd.mostrarCitas();
                    break;

                case 4:
                    bd.mostrarPacientes();
                    break;

                case 5:
                    bd.mostrarMedicos();
                    break;

                case 6:
                    bd.mostrarCitas();
                    break;

                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 0);

        sc.close();
    }
}