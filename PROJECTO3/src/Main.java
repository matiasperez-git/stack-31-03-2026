import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.classfile.instruction.BranchInstruction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Declaracion de pbjetos
        Proveedor vendor1 = new Proveedor();
        Proveedor vendor2 = new Proveedor("1234567890", "Curso POO");
        Proveedor vendor3 = new Proveedor("1234567890", "Curso POO", "Nayon S/N");
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        // Desplegar los valores
        vendor3.detalle1();

    }
}