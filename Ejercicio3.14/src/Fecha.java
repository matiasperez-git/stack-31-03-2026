public class Fecha {

    /** Creacion de atributos o propiedades */
    private int mes;
    private int dia;
    private int año;


    /** Creacion de Constructores y de destructores */
    public Fecha(int mes, int dia, int año) {
        this.mes = mes;
        this.dia = dia;
        this.año = año;
    }

    /** Metodos propios del desarollador */

    /** Metodo establecer */
    public void establecermes(int mes){

        this.mes= mes;
    }
    public void establecerdia(int dia){

        this.dia= dia;
    }
    public void estableceraño(int año){

        this.año= año;
    }


    /** Metodo obtener */

    public int obtenermes(){

        return mes;
    }
    public int obtenerdia(){

        return dia;
    }
    public int obteneraño(){

        return año;
    }

    /** Metodo mostrar */

    public void mostrarfecha(){
        System.out.println(mes + "/" + dia + "/" + año);
    }

    /**
     public String mostrarfecha1() {
     return mes + "/" + dia + "/" + año;
     } */

}

