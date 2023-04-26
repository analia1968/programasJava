
package ejer3_extra;
import java.util.Scanner;
/**elaborar un algoritmo en el cual se ingrese una letra y se detecte si se trata
 * de una vocal.Caso contrario mostrar un mensaje.Nota:investigar la funcion 
 * equals() de la clase String.
 */
public class Ejer3_extra {
    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String letra;
        System.out.println("Escriba una letra");
        letra = leer.next();
        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
            System.out.println("La letra es una vocal, gracias!!"); 
        } else  {
            System.out.println("La letra no es una vocal, por favor reintente con otra letra.");
        }
    } 
}
    
    

