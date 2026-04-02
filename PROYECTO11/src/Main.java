import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Instanciar la clase Auotmovil con el objeto auto1
        Automovil auto1 = new Automovil();
        Automovil auto2 = new Automovil();
        BufferedReader br = new BufferedReader( (new InputStreamReader(System.in)));


        //Asignar valores a las propiedades de la clase
        /*auto1.marca = "BMW";
        auto1.modelo = "1320";
        auto1.color = "Blanco";
        auto1.cilindraje = 3.2;
        auto1.numeroPuertas = 4;*/


        // Asignacion de valors con lectura de datos
        /*System.out.print("Marca :  ");
        auto1.marca = br.readLine();
        System.out.println("La marca del carro es : " + auto1.marca);
        System.out.println();

        auto1.marca = JOptionPane.showInputDialog("Marca del auto");
        //JOptionPane.showInputDialog("Marca del auto: " = auto1.marca);
        System.out.println();*/

        // Llamado a los metodos
        System.out.println("Informacion del metodo de la clase Auotmovil");
        auto2.detalle();
        System.out.println();






    }
}