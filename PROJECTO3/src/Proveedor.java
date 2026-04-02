public class Proveedor {
    //Atrbutos de la clase
    String RUC;
    String razonSocial;
    String dirrecion = "Nayon S/N";

    //Creacion de los constructores y Destructores

    public Proveedor() {
    }

    public Proveedor(String RUC, String razonSocial) {
        this.RUC = RUC;
        this.razonSocial = razonSocial;
    }

    public Proveedor(String RUC, String razonSocial, String dirrecion) {
        this.RUC = RUC;
        this.razonSocial = razonSocial;
        this.dirrecion = dirrecion;
    }

    //Metodos
    public void  detalle1(){
        //Desplegar los valores
        //String RUC = "123";
        //This. Reserva
        System.out.println("El RUC del Proveedor es : " + this.RUC);
        System.out.println("Razon social del Proveedor : " + this.razonSocial);
        System.out.println("Dirrecion del Proveedor: " + this.dirrecion);
    }
}
