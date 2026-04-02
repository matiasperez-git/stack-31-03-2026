import udla.mperez.ejercicios8.p2.CuentaAhorro;
import udla.mperez.ejercicios8.p2.CuentaCorriente;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Crear cuentas de ejemplo
        CuentaAhorro ahorro = new CuentaAhorro(101, "Andres", 500000, 0.01);
        CuentaCorriente corriente = new CuentaCorriente(202, "Maria", 200000);

        int opcion;

        do {
            System.out.println("\n==== BANCO EL AHORRADOR FELIZ ====");
            System.out.println("1. Consultar cuenta de ahorro");
            System.out.println("2. Consultar cuenta corriente");
            System.out.println("3. Depositar en cuenta de ahorro");
            System.out.println("4. Depositar en cuenta corriente");
            System.out.println("5. Retirar de cuenta de ahorro");
            System.out.println("6. Retirar de cuenta corriente");
            System.out.println("7. Depositar intereses en cuenta de ahorro");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("\n--- CONSULTA CUENTA DE AHORRO ---");
                    ahorro.consultarDatos();
                    break;

                case 2:
                    System.out.println("\n--- CONSULTA CUENTA CORRIENTE ---");
                    corriente.consultarDatos();
                    break;

                case 3:
                    System.out.print("Monto a depositar en ahorro: ");
                    double depAhorro = sc.nextDouble();
                    ahorro.depositar(depAhorro);
                    System.out.println("Depósito realizado.");
                    break;

                case 4:
                    System.out.print("Monto a depositar en corriente: ");
                    double depCorr = sc.nextDouble();
                    corriente.depositar(depCorr);
                    System.out.println("Depósito realizado.");
                    break;

                case 5:
                    System.out.print("Monto a retirar de ahorro: ");
                    double retAhorro = sc.nextDouble();
                    if (ahorro.retirar(retAhorro)) {
                        System.out.println("Retiro exitoso.");
                    } else {
                        System.out.println("Error: No puede retirar más del saldo disponible.");
                    }
                    break;

                case 6:
                    System.out.print("Monto a retirar de corriente: ");
                    double retCorr = sc.nextDouble();

                    boolean retiroCorr = corriente.retirar(retCorr);

                    if (retiroCorr) {
                        System.out.println("Retiro realizado.");
                        if (corriente.saldo < 0) {
                            System.out.println("ALERTA: La cuenta tiene sobregiro.");
                        }
                    } else {
                        System.out.println("Error: El monto supera el sobregiro máximo permitido (-300000).");
                    }
                    break;

                case 7:
                    System.out.println("\n--- DEPÓSITO DE INTERESES AHORRO ---");
                    ahorro.depositarInteres();
                    System.out.println("Intereses depositados.");
                    break;

                case 8:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 8);

        sc.close();
    }
}
