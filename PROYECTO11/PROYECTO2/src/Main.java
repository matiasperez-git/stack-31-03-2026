
public class Main {
    public static void main(String[] args) {
    Flores flor1 = new Flores();
    Flores flor2 = new Flores();

    flor1.nombre = "Rosa";
    flor1.tamanocm = 20;
    flor1.color = "Rojo";
    flor1.momentoFloracion = "En boton";

    flor2.nombre = "Claveles";
    flor2.tamanocm = 15;
    flor2.color = "Rosada";
    flor2.momentoFloracion = "Abierta";

        flor1.detalle();

        flor2.detalle();

    }
}