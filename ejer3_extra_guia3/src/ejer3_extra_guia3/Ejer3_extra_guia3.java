package ejer3_extra_guia3;
import java.util.Scanner;
/**
 *elaborar un algoritmo en el cual se ingrese una letra y se detecte si se trata
 * de una vocal. caso contrario mostrar un mensaje. nota:investigar la funcion
 * equals(), de la clase string. 
 */
public class Ejer3_extra_guia3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
       Scanner leer= new Scanner(System.in);
        String letra;
       letra = leer.nextLine();
       if (letra ="a")||(letra ="e")||(letra ="i")||(letra ="o")||(letra ="u"){
       
       System.out.println("su letra es una vocal");
    } else {
            System.out.println("su letra es una consonante");
    }
    }
}
