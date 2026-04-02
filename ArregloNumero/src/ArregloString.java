import java.util.Arrays;
import java.util.Comparator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ArregloString {
    public static void main(String[] args) {
        String[] pro = new String [5];
        int i;
        /*Asignar valores a los arreglos*/

        pro[0]="Memoria Kindston 63";

        pro [1]="Samsung Galaxy s23";

        pro [2]="Apple Phone 17 ProMax";

        pro [3]= "Notebook Air";

        pro [4]="Bicicleta Oxford";

        /** Desplegar valores del vector */
        for (i = -0; i < pro.length; i++) {
            System.out.println("Numero [" + i + "] : " + pro[i]);
        }
        System.out.println();

        /** Desplegar valores del vector ordenado ascendente*/
        Arrays.sort(pro);
        for (i = 0; i < pro.length; i++) {

            System.out.println("Numero [" + i + "] : " + pro[i]);
        }

        System.out.println();
        /** Desplegar valores del vector ordenado desscendente 1 froma*/
        for (i = pro.length - 1; i >= 0; i--) {

            System.out.println("Numero [" + i + "] : " + pro[i]);
        }
        System.out.println();
        /** Desplegar valores del vector ordenado descendente forma 2 */
        for (i = 0; i < pro.length; i++) {

            System.out.println("Numero [" + i + "] : " + pro[pro.length - 1 - i]);
        }
        System.out.println();
        /** Desplegar valores del vector ordenado desscendente optimizado*/
        Arrays.sort(pro, Comparator.reverseOrder());
        for (i = pro.length - 1; i >= 0; i--) {

            System.out.println("Numero [" + i + "] : " + pro[i]);


        }




    }
}