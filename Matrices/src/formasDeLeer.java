import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class formasDeLeer {
    public static void main(String[] args) throws IOException {

        /** creacion de objetos de la clase*/
        /**Cliente cli1 = new Cliente();
        Cliente cli2= new Cliente("2345","Megamaxi","Quito Norte");
        Cliente cli3= new Cliente();
        Cliente cli4= new Cliente();/**

        /** primera forma de leer*/
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        /** Segunda forma de leer*/
        Scanner sc= new Scanner(System.in);
        /** tERCERA FORMA*/
        /**cli4.RUC= JOptionPane.showInputDialog("RUC");
         cli4.razonSocial= JOptionPane.showInputDialog("Razon Social");
         cli4.direccion= JOptionPane.showInputDialog("Direccion");
         String dc4= "RUC: "+ cli4.RUC+ "\nRazon social: "+ cli4.razonSocial + "\nDireccion: "+ cli4.direccion;
         JOptionPane.showMessageDialog(null,dc4); */

        /** Asignacion de valores de los atributos de la clase con la segunda forma de lectura
         System.out.print("RUC: ");
         cli3.RUC= sc.nextLine();
         System.out.print("Razon Social: ");
         cli3.razonSocial= sc.nextLine();
         System.out.print("Direccion: ");
         cli3.direccion= sc.nextLine();*/


        /** Asignacion de valores de los atributos de la clase con la primera forma de lectura*/
        /***/
        /**System.out.print("RUC: ");
        cli1.RUC= br.readLine();
        System.out.print("Razon Social: ");
        cli1.razonSocial= br.readLine();
        System.out.print("Direccion: ");
        cli1.direccion= br.readLine();*/




        /** desplegar valores de los atributos
         String DC;
         cli1.detalleCliente();
         DC =cli2.otroCliente(cli2.RUC, cli2.razonSocial, cli2.direccion);
         System.out.println("Datos Cliente \n"+ DC);
         cli3.detalleCliente();
         */
    }

}