
package ejer3_funcion;
import java.util.Scanner;
/**crea una aplicacion que a traves de una funcion nos convierta una cantidad de 
 * euros introducida por teclado a otra moneda, estas pueden ser a dolares, yenes
 * o libras.La funcion tendra como parametros, la cantidad de euros y la moneda
 * a convertir que sera una cadena, este no devolvera ningun valor y mostrara
 * un mensaje indicando el cambio
 */
public class Ejer3_funcion {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int euros;
     
        Scanner leer= new Scanner(System.in);
        System.out.print("ingrese la cantidad de euros: ");
       euros = leer.nextInt();
      convertirEuros(euros);
    }
   public static void convertirEuros( int euros){
       System.out.println(euros +" euros es equivalente a: " +(euros * 0.86) + " libras");
    System.out.println(euros +" euros es equivalente a: " +(euros *1.286) + " dolares");
System.out.println(euros +" euros es equivalente a: " +(euros *129.85) + " yenes");
   }
}
