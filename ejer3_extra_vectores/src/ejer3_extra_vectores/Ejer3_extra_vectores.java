
package ejer3_extra_vectores;
import java.util.Scanner;
/**crear una funcion que rellene un vector con nros aleatorios, pasandole un 
 * arreglo por parametro.Despues haremos otra funcion o procedimiento que imprima
 * el vector.
 */
public class Ejer3_extra_vectores {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner random = new Scanner (System.in);
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese el tamaño del vector: ");
        int tamaño= leer.nextInt();
     
      int vector [] = new int [tamaño];  // declaracion de vector
      int numeros = (int)(Math.random()*10);
      rellenar [vector];
      imprimir [vector];
      
      public static void rellenar(int aleatorios){
          for (int i = 0; i < vector.length; i++) {
              vector[i]= random.nextInt(10);     
          }
      }
      public static void imprimir (int aleatorios){
          for (int i = 0; i < vector.length; i++) {
              System.out.println("[" +vector [i] + "]");
              
          }
      }
    }   
}
