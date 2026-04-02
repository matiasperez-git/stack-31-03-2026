package udla.mperez.pooh.p1;

public class Profesor extends Persona{
    /** Atributos de la sub clase Profesor*/
    private String materia;

    /** Construcutores y Destrucutores*/

    public Profesor() {
    }

    public Profesor(String materia) {
        this.materia = materia;
    }

    public Prozfesor(String nombre, String apellido, int edad, String genero, String materia) {
        super(nombre, apellido, edad, genero);
        this.materia = materia;
    }

    /** METODOS PROPIOS DE JAVA*/

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
