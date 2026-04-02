package udla.mperez.poointerfaces.imprenta.p2.modelo;

public class informe extends Hoja{

    /** Atributos*/
    private String autor;
    private String revisor;

    /** Constructor */

    public informe(String contenido, String autor, String revisor) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String imprimir() {
        return "Informe escrito por : " + this.autor + "\n" +
                "Informe revisado por: " + this.revisor + "\n" +
                this.contenido;
    }
}
