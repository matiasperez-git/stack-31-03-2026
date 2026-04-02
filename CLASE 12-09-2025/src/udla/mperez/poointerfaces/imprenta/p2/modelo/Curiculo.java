package udla.mperez.poointerfaces.imprenta.p2.modelo;

import java.util.ArrayList;
import java.util.List;

public class curriculo extends  Hoja{
    private String persona;
    private String profesion;
    private List<String> conocimiento;


    public curriculo(String contenido, String persona, String profesion, String conocimiemnto) {
        super(contenido);
        this.persona = persona;
        this.profesion = profesion;
        this.conocimiento = new ArrayList<>()
    }

    public Curiculo(String contenido, List<String> conocimiento) {
        super(contenido);
        this.conocimiento = conocimiento;
    }

    @Override
    public String imprimir() {
        return "";
    }
}
