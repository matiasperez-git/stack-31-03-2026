    package Hospital;

    import Excepciones.DatosInvalidos;

    public class Paciente {

        private int id;
        private String nombre;
        private String cedula;
        private int edad;
        private String telefono;

        public Paciente(int id, String nombre, String cedula, int edad, String telefono)
                throws DatosInvalidos {

            if (nombre == null || nombre.isEmpty())
                throw new DatosInvalidos("Nombre obligatorio");
            if (edad <= 0)
                throw new DatosInvalidos("Edad inválida");

            this.id = id;
            this.nombre = nombre;
            this.cedula = cedula;
            this.edad = edad;
            this.telefono = telefono;
        }

        public int getId() { return id; }
        public String getNombre() { return nombre; }
        public String getCedula() { return cedula; }
        public int getEdad() { return edad; }
        public String getTelefono() { return telefono; }

        public String imprimirDatos() {
            return "Paciente {ID=" + id + ", Nombre=" + nombre +
                    ", Edad=" + edad + ", Teléfono=" + telefono + "}";
        }
    }