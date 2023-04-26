
package ejer3_pract3;
import java.util.Scanner;
/**realizar un programa que solo permita introducir solo frases o palabras de 8
 * caracteres de largo.Si el usuario ingresa una frase o palabra de 8 caracteres
 * de largo se debera imprimir un mensaje por pantalla que diga "correcto", en 
 * caso contrario, se debera imprimir "incorrecto".Nota: investigar la funcion
 * lenght() en java
 */
public class Ejer3_pract3 {
    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {   
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingresa una Frase o Palabra.");
        frase = leer.nextLine();
        
        if (frase.length() == 8  ) {
            System.out.println("CORRECTO.");
        } else {
            System.out.println("INCORRECTO.");
        }
    }
}
  
    

