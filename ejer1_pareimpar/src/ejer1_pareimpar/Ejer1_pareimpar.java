package ejer1_pareimpar;
import java.util.Scanner;
/**crear un programa que dado un nro determine si es par o impar
 */
public class Ejer1_pareimpar {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int numero;
     Scanner leer = new Scanner(System.in);{          
     System.out.println("ingrese un nro por teclado");
       numero = leer.nextInt();
    if( numero % 2 == 0 )
     System.out.println("el numero es par");
    else
   System.out.println("el numero es impar");
    }
    }
}
