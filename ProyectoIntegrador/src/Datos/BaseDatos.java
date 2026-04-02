package Datos;

import Hospital.*;
import java.sql.*;

public class BaseDatos {

    private static final String URL =
            "jdbc:mysql://localhost:3306/citasmedicas?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "sasa"; // cambia si tu contraseña es otra

    private Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }

    // ================= PACIENTE =================
    public void insertarPaciente(Paciente p) {
        String sql = "INSERT INTO paciente VALUES (?, ?, ?, ?, ?)";

        try (Connection con = conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, p.getId());
            ps.setString(2, p.getNombre());
            ps.setString(3, p.getCedula());
            ps.setInt(4, p.getEdad());
            ps.setString(5, p.getTelefono());

            ps.executeUpdate();
            System.out.println("Paciente guardado en la BD");

        } catch (SQLException e) {
            System.out.println("Error al insertar paciente: " + e.getMessage());
        }
    }

    public void mostrarPacientes() {
        String sql = "SELECT * FROM paciente";

        try (Connection con = conectar();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            System.out.println("\n--- LISTA DE PACIENTES ---");
            while (rs.next()) {
                System.out.println("ID=" + rs.getInt("idPaciente") +
                        ", Nombre=" + rs.getString("nombre") +
                        ", Edad=" + rs.getInt("edad") +
                        ", Teléfono=" + rs.getString("telefono"));
            }

        } catch (SQLException e) {
            System.out.println("Error al mostrar pacientes: " + e.getMessage());
        }
    }

    // ================= MEDICO =================
    public void insertarMedico(Medico m) {
        String sql = "INSERT INTO medico VALUES (?, ?, ?, ?)";

        try (Connection con = conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, m.getId());
            ps.setString(2, m.getNombre());
            ps.setString(3, m.getEspecialidad());
            ps.setString(4, m.getHorario());

            ps.executeUpdate();
            System.out.println("Médico guardado en la BD");

        } catch (SQLException e) {
            System.out.println("Error al insertar médico: " + e.getMessage());
        }
    }

    public void mostrarMedicos() {
        String sql = "SELECT * FROM medico";

        try (Connection con = conectar();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            System.out.println("\n--- LISTA DE MÉDICOS ---");
            while (rs.next()) {
                System.out.println("ID=" + rs.getInt("idMedico") +
                        ", Nombre=" + rs.getString("nombre") +
                        ", Especialidad=" + rs.getString("especialidad") +
                        ", Horario=" + rs.getString("horario"));
            }

        } catch (SQLException e) {
            System.out.println("Error al mostrar médicos: " + e.getMessage());
        }
    }

    // ================= CITA =================
    public void insertarCita(Cita c) {
        String sql = "INSERT INTO citas VALUES (?, ?, ?, ?, ?)";

        try (Connection con = conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, c.getId());
            ps.setString(2, c.getFecha());
            ps.setString(3, c.getHora());
            ps.setInt(4, c.getIdPaciente());
            ps.setInt(5, c.getIdMedico());

            ps.executeUpdate();
            System.out.println("Cita registrada en la BD");

        } catch (SQLException e) {
            System.out.println("Error al insertar cita: " + e.getMessage());
        }
    }

    public void mostrarCitas() {
        String sql = "SELECT * FROM citas";

        try (Connection con = conectar();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            System.out.println("\n--- LISTA DE CITAS ---");
            while (rs.next()) {
                System.out.println("ID=" + rs.getInt("idCitas") +
                        ", Fecha=" + rs.getString("fecha") +
                        ", Hora=" + rs.getString("hora") +
                        ", ID Paciente=" + rs.getInt("idPaciente") +
                        ", ID Médico=" + rs.getInt("idMedico"));
            }

        } catch (SQLException e) {
            System.out.println("Error al mostrar citas: " + e.getMessage());
        }
    }
}
