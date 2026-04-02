package Hospital;

import Excepciones.DatosInvalidos;

public class Cita {

    private int id;
    private String fecha;
    private String hora;
    private int idPaciente;
    private int idMedico;

    public Cita(int id, String fecha, String hora, int idPaciente, int idMedico)
            throws DatosInvalidos {

        if (fecha == null || fecha.isEmpty())
            throw new DatosInvalidos("Fecha obligatoria");

        if (hora == null || hora.isEmpty())
            throw new DatosInvalidos("Hora obligatoria");

        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.idPaciente = idPaciente;
        this.idMedico = idMedico;
    }

    public int getId() { return id; }
    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
    public int getIdPaciente() { return idPaciente; }
    public int getIdMedico() { return idMedico; }

    public String imprimirDatos() {
        return "Cita {" +
                "ID=" + id +
                ", Fecha='" + fecha + '\'' +
                ", Hora='" + hora + '\'' +
                ", ID Paciente=" + idPaciente +
                ", ID Médico=" + idMedico +
                '}';
    }
}
