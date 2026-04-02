import java.util.Scanner;

public class MatrizEjercicio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i ;
        int j ;
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        int[][] Suma = new int[3][3];

        System.out.println("Ingrese los valores de la matriz A:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("A[" + (i + 1) + "][" + (j + 1) + "]: ");
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println(("\nIngrese los valores de la matriz B"));
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("B[" + (i + 1) +"][" + (j + 1) +"} : ");
                B[i][j] = sc.nextInt();
            }
        }
        //Sumar Matricez

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++){
                Suma[i][j] = A[i][j] + B[i][j];


            }
        }
        System.out.println("\nResultado de la suma de matrices (A + B):");

        for ( i = 0; i < 3; i++) {
            for ( j = 0; j < 3; j++) {
                System.out.print(Suma[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
