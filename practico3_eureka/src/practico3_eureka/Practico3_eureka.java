package practico3_eureka;
import java.util.Scanner;
/**crear un programa que pida una frase y si esta frase es igual a "eureka" el 
 * programa pondra un mensaje de correcto, sino mostrara un mensaje de incorrecto
 * nota: investigar la funcion equals()en java
 */
public class Practico3_eureka{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       String frase;
       String busqueda = "eureka";
       //String frase (String ev) = "eureka";
       System.out.println("inserte frase a evaluar");
       frase = leer.nextLine();
    
     if(frase.equals(busqueda)){
        System.out.println("correcto");  
    } else {
            System.out.println ("incorrecto");
            }
    }
}

