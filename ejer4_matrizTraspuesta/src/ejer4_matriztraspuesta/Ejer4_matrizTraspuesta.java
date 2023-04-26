package ejer4_matriztraspuesta;
import java.util.Random;
/**realizar un programa que rellene una matriz de 4 x 4 de valores aleatorios
 * y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se
 * denota por B y se obtiene cambiando sus filas por columnas (o viceversa)
 */
public class Ejer4_matrizTraspuesta {
    /**
     * @param args the command line arguments
     */   
public static void main(String[] args) {
     Random rand = new Random();
         
        int[][] matriz = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = rand.nextInt(100);
            }
        }       
        System.out.println("La matriz original es:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        int[][] traspuesta = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                traspuesta[i][j] = matriz[j][i];
            }
        }
        System.out.println("La matriz traspuesta es:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(traspuesta[i][j] + " ");
            }
            System.out.println();
        }
    }
  }
