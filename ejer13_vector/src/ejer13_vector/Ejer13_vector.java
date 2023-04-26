
package ejer13_vector;
import java.util.Scanner;
/**
 *
 * 
 */
public class Ejer13_vector {

    /**
     * @param args the command line arguments
     */
    
//public class VectorNombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nombres = new String[3]; // Se define un vector de 3 nombres
        
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese el nombre " + (i+1) + ": ");
            nombres[i] = sc.nextLine();
        }
        
        // Se imprimen los nombres ingresados
        System.out.println("Los nombres ingresados son: ");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
    }
}



    
    

