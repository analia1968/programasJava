package ejer4_practico3;
import java.util.Scanner;
/**escriba un programa que pida una frase o palabra y valide si la primera letra
 * de esa frase es una A.Si la primera letra es una A, se debera de imprimir un 
 * mensaje por pantalla que diga "correcto", en caso contrario, se debera imprimir
 * "incorrecto".Nota:investigar la funcion Substring y equals() de java
 */
public class Ejer4_practico3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese una palabra o frase: ");
        String frase = input.nextLine();
        
        String primerCaracter = frase.substring(0, 1);
        if(primerCaracter.equals("A")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}
