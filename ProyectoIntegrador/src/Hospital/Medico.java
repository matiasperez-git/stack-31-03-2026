package Hospital;

import Excepciones.DatosInvalidos;

public class Medico {

    private int id;
    private String nombre;
    private String especialidad;
    private String horario;

    public Medico(int id, String nombre, String especialidad, String horario)
            throws DatosInvalidos {

        if (nombre == null || nombre.isEmpty())
            throw new DatosInvalidos("Nombre obligatorio");

        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.horario = horario;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }
    public String getHorario() { return horario; }

    public String imprimirDatos() {
        return "Médico {ID=" + id + ", Nombre=" + nombre +
                ", Especialidad=" + especialidad + ", Horario=" + horario + "}";
    }
}