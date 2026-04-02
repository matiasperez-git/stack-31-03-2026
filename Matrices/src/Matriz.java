import java.util.Arrays;
import java.util.Collections;

public class Matriz {
    public static void main(String[] args){
        Integer[][] num= new Integer[5][1];
        int i;
        int j=0;
        num[0][0]=9;
        num[1][0]=2;
        num[2][0]=7;
        num[3][0]=5;
        num[4][0]=8;
        System.out.println("Vector de Numeros");
        for (i=0; i<num.length; i++){
            System.out.println("numero["+i+"]:"+num[i][j]);
        }
        System.out.println("Vector de numeros al reves primera forma");
        for (i=num.length-1; i>=0; i--){
            System.out.println("numero["+i+"]:"+num[i][j]);
        }
        System.out.println("Vector de numeros al reves segunda forma");
        for (i=0; i<num.length; i++){
            System.out.println("numero["+i+"]:"+num[num.length-1-i][j]);

        }
        System.out.println();
        System.out.println("Numeros ordenados");
        Arrays.sort(num, (a, b) -> a[0].compareTo(b[0]));

        for (i=0; i<num.length; i++){
            System.out.println("numero["+i+"]:"+num[i][j]);
        }
        System.out.println();
        System.out.println("Numeros ordenados de mayor a menor");
        Arrays.sort(num, (a, b) -> b[0].compareTo(a[0]));

        //No ordena nativos
        for (i=0; i<num.length; i++){
            System.out.println("numero["+i+"]:"+num[i][j]);
        }
    }

}
