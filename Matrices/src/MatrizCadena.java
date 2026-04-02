import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class MatrizCadena {
    public static void main(String[] args) {
        String[] cad = new String[5];
        int i;
        cad[0] = "Memoria KIngstone 128GB";
        cad[1] = "Apple Phone 17 PROMAX";
        cad[2] = "Samsung Galaxy S24";
        cad[3] = "Notebook air";
        cad[4] = "Bicicleta Oxford";

        System.out.println("Vector de caracteres");
        for (i = 0; i < cad.length; i++) {
            System.out.println("Cadena [" + i + "] : " + cad[i]);

        }

        System.out.println();

        System.out.println("Vector ordenado Ascendente");
        Arrays.sort(cad);
        for (i = 0; i<cad.length; i++){
            System.out.println("Cadena ["+i+"] : " + cad[i]);
        }

        System.out.println();
        System.out.println("Vector ordenado descendente");
        Arrays.sort(cad, Comparator.reverseOrder());
        for (i = 0; i<cad.length; i++) {
        System.out.println("Cadena [" + i + "] : " + cad[i]);
    }
    }

}