package udla.mperez.poointerfaces.imprenta.p2.modelo;

abstract public class Hoja {
    /**Atributos*/
    protected String contenido;

    /** Constructores**/
    public Hoja(String contenido) {
        this.contenido = contenido;
    }

    /** Metodo Abstracto*/
    abstract public  String imprimir();

}
