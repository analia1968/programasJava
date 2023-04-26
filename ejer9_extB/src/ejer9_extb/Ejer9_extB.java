package ejer9_extb;
import java.util.Scanner;
/**simular la division usando solamente restas.Dado dos numeros enteros mayores
 * que uno, realizar un algoritmo que calcule el cociente y el residuo usando solo
 * restas.Metodo: restar el dividendo del divisor hasta obtener un resultado menor
 * que el divisor, este resultado es el residuo, y el numero de restas realizadas
 *  es el cociente.
 */
public class Ejer9_extB {
    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, residuo = 0, cociente = 0;
        System.out.println("Ingrese 2 numeros enteros mayores a 1");
        num1 = leer.nextInt();
        num2 = leer.nextInt();

        while (num1 >= num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
                cociente++;
            }
        }
        residuo = num1;
        
        System.out.println("El residuo es: " + residuo);
        System.out.println("El cociente es: " + cociente);
    }
}
    
