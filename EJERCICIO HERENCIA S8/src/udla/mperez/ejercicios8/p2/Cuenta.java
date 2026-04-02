package udla.mperez.ejercicios8.p2;

public class Cuenta {

    protected int numeroCuenta;
    protected String nombreCliente;
    public double saldo;

    public Cuenta(int numeroCuenta, String nombreCliente, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.nombreCliente = nombreCliente;
        this.saldo = saldo;
    }

    public void consultarDatos() {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Saldo: " + saldo);
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    public boolean retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            return true;
        }
        return false;
    }
}
