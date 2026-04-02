import javax.swing.*;

public class Automovil {
    String marca;
    String modelo;
    String color = "Negro";
    double cilindraje;
    int numeroPuertas = 5;

    public Automovil(){

    }
public Automovil (String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
}

public  Automovil (String marca, String modelo, double cilindraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindraje = cilindraje;

}
// Metodos Propios

public void detalle(){
        //String modelo = "AUDI";
    System.out.println("Marca            : " + this.marca);
    System.out.println("Modelo           : " + this.modelo);
    System.out.println("Color            : " + this.color);
    System.out.println("Cilindraje       : " + this.cilindraje);
    System.out.println("numeroPuertas    : " + this.numeroPuertas);
}
 public void detalle1(){
     JOptionPane.showMessageDialog(null, "La marca del auto es : " + this.marca);
 }
}
