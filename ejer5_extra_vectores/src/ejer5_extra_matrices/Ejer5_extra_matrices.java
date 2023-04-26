package ejer5_extra_matrices;
import java.util.Scanner;
/**realizar un programa que llene una matriz de tamaño N x M con valores aleatorios
 * y muestre la suma de sus elementos.
 */
public class Ejer5_extra_matrices {
    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int N, M, suma=0;
        
        System.out.println("Ingrese la dimension de la matriz (MxN)");
        
        N = leer.nextInt();
        M = leer.nextInt();
                
        int matriz[][] = new int[N][M];
        
        for (int i=0; i<N; i++){
            for (int j=0; j<M; j++){
                matriz[i][j] = (int) (Math.random() * 10);
                System.out.print("[" +(matriz[i][j]) +"] ");
                suma = suma + matriz[i][j];
            }
            System.out.println("");
        }
        System.out.println("La suma de los elementos es: " +suma);   
       }   
}