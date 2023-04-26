
package ejer6_matrizmagica;
import java.util.Scanner;
/**un cuadrado magico 3 x 3 es una matriz formada por numeros del 1 al 9 donde
 * la suma de sus filas, sus columnas y sus diagonales son identicas.Crear un 
 * programa que permita introducir un cuadrado por teclado y determine si este 
 * cuadrado es magico o no. El programa debera comprobar que los numeros 
 * introducidos son correctos, es decir, estan entre el 1 y el 9
 */
public class Ejer6_matrizMagica extends magico{
    /**
     * @param args the command line arguments
     */
    public static void main (String[] args){
        //333
        //432
        //234
        int [][]m = new int [3][3];
        Scanner leer =new Scanner (System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("ingrese el dato de la fila "+i);
                int d = leer.nextInt();
                m [i][j]= d;      
            }
        }
           esMagico(m); 
        }
        
    }
     