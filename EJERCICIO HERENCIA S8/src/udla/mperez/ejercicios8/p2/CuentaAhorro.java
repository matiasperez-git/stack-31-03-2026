package udla.mperez.ejercicios8.p2;

public class CuentaAhorro extends Cuenta {

    private double interesMensual;

    public CuentaAhorro(int numeroCuenta, String nombreCliente, double saldo, double interesMensual) {
        super(numeroCuenta, nombreCliente, saldo);
        this.interesMensual = interesMensual;
    }

    public void depositarInteres() {
        double interes = saldo * interesMensual;
        saldo += interes;
    }

    public boolean retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            return true;
        }
        return false;
    }
}
