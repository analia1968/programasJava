
package ejer11_funciones;
import java.util.Scanner;
/**
 *escribir un programa que procese una secuencia de caracteres ingresada por teclado
 * y terminada en punto,y luego codifique la palabra o frase ingresada de la 
 * siguiente manera: cada vocal se reemplaza por el caracter que se indica en la 
 * tabla y el resto de los caracteres incluyendo a las vocales acentuadas se 
 * mantienen sin cambio. realice un subprograma que reciba una secuencia de caracteres
 * y retorne la codificacion correspondiente.utilice la estructura segun para la 
 * transformacion.
 */
public class Ejer11_funciones {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
       String letra = "";
       String frase = "";
       
            System.out.println("Ingrese un frase");
            frase = leer.nextLine();
        
        int  longitud = frase.length();
        System.out.println("frase = " + frase + " y su longitud es de " + longitud);
       
        String retorno =codi(letra, frase, longitud);
        
        System.out.println("La frase retornada es: " + retorno);    
    }
    
    public static String codi (String letra, String frase, int longitud) {
        String codif = "";
        
        for (int i = 0; i < longitud; i++) {
            letra = frase.substring(i,i+1);
            letra = frase.toLowerCase();
            
            switch (letra) {
                case "a":
                    letra = "@";
                    break;
                case "e":
                    letra = "#";
                    break;
                case "i":
                    letra = "i";
                    break;
                case "o":
                    letra = "%";
                    break;
                case "u":
                    letra = "*";
                    break;
                default:
                    letra = letra;   
            }
        }   
        return codif;
    }
}
    
    

