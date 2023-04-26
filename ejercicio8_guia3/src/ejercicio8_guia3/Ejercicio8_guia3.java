package ejercicio8_guia3;
import java.util.Scanner;
/**dibujar un cuadrado de N elementos por lado utilizando el caracter "*". por
 * ejemplo si el cuadrado tiene 4 elementos por lado se debera dibujar lo
 * siguiente: 
 */
public class Ejercicio8_guia3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el nuemro de elementos por lado del cuadrado: ");
        int elementosPorLado = leer.nextInt();
        //
        for (int i = 1; i <= elementosPorLado; i++) {
            for (int j = 1; j <= elementosPorLado; j++) {
                if ((i == 1) || (i == elementosPorLado)) {
                    System.out.print("*");
                } else if ((j == 1) || (j == elementosPorLado)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
} 

