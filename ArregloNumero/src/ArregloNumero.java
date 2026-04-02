//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ArregloNumero {
    public static void main(String[] args){
        /** Declaracion de arreglos */
        int[] num = new int[5];
        int i;
        num[0] = 9;
        num[1] = 1;
        //num[1] = Integer.valueOf("1"); // Transformar cadena de caracteres o el caracter a clase tipo integer
        num[2] = 7;
        //num[3] = 3;
        num[3] = (int) 3L; // transforma un valor decimal a un int
        num[4] = 8;

        //Despleggar el vector
        for ( i = 0; i < num.length; i++){
            System.out.println("NUMERO [" + i + "] : "+num[i]);
        }
    }
}