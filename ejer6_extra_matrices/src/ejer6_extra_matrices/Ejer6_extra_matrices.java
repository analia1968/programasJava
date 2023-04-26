
package ejer6_extra_matrices;
import java.util.Scanner;
/**
 *
 * @author Analia
 */
public class Ejer6_extra_matrices {
    /**
     * @param args the command line arguments
     */
   
      public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] palabras = new String[5];
        String str;
        String[][] matriz = new String[20][20];
        int c, f,cont=0;

        //INGRESO LAS PALABRAS, Y VALIDO SU LONGITUD
        System.out.println("Por favor,ingrese 5 palabras de entre 3 y 5 caracteres");
        for (int i = 0; i < 5; i++) {
            do {
                System.out.println("ingrese la " + (i + 1) + "º palabra");
                str = leer.next();
                palabras[i] = str;
                if (str.length() < 3 || str.length() > 5) {
                    System.out.println("ERROR, DIJE ENTRE 3 y 5 CARACTERES, CABEZON/A");
                }
            } while (str.length() < 3 || str.length() > 5);

        }
       //UBICO LAS PALABRAS
        for (int i = 0; i < 5; i++) {
            f = (int) (Math.random() * 20);
            c = (int) (Math.random() * 15);
            for (int j = 0; j < palabras[cont].length(); j++) {
    }
        }  
}
}