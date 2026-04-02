package udla.mperez.ejercicios8.p2;

public class CuentaCorriente extends Cuenta {

    private final double costoTransaccion = 4.000;
    private final double sobregiroMaximo = 300.000;

    public CuentaCorriente(int numeroCuenta, String nombreCliente, double saldo) {
        super(numeroCuenta, nombreCliente, saldo);
    }

    public boolean retirar(double monto) {
        double saldoPosible = saldo - monto - costoTransaccion;

        if (saldoPosible >= -sobregiroMaximo) {
            saldo = saldoPosible;
            return true;
        }
        return false;
    }
}
