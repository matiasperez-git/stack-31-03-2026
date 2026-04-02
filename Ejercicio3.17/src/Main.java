import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FrecuenciasCardiacas persona1 = new FrecuenciasCardiacas();
        Scanner sc = new Scanner(System.in);

        /** Registro Paciente*/
        System.out.print("Ingrese el nombre: ");
        persona1.setPrimerNombre(sc.nextLine());
        System.out.println();
        System.out.print("Ingrese el apellido: ");
        persona1.setApellido(sc.nextLine());
        System.out.println();
        System.out.println("Ingrese Fecha de nacimiento: ");
        System.out.print("Dia: ");
        persona1.setDia(Integer.parseInt(sc.nextLine()));
        System.out.println();
        System.out.print("Mes: ");
        persona1.setMes(Integer.parseInt(sc.nextLine()));
        System.out.println();
        System.out.print("Año: ");
        persona1.setAño(Integer.parseInt(sc.nextLine()));

        /** Impresion de Datos*/
        persona1.Paciente(persona1.getPrimerNombre(), persona1.getApellido());
        persona1.fechaNacimiento(persona1.getDia(), persona1.getMes(), persona1.getAño());
        persona1.EdadPersona(persona1.getAño());







    }
}