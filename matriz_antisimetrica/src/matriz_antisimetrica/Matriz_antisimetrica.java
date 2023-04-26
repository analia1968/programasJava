 package matriz_antisimetrica;
import java.util.Scanner;
/**realice un programa que compruebe si una matriz dada es antisimetrica.Se dice
 * que una matriz A es antisimetrica cuando esta es igual a su propia traspuesta,
 * pero cambiada de signo.Es decir, A es antisimetrica si A=-AT.La matriz 
 * traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas
 * por columnas (o viceversa)
 */
public class Matriz_antisimetrica {
    /**
     * @param args the command line arguments
     */
  // private static void Scanner leer = new Scanner (System.in);
    public static void main(String[] args) {
        
       Scanner leer = new Scanner (System.in);
        System.out.println("ingrese dimension de la matriz"); 
       int n=0;  
        int m=0;
        n = leer.nextInt();
        m= leer.nextInt();
        while (n <=1){
            System.out.println("error! ingrese dimension positiva");
            n= leer.nextInt();
        }
        int[][]M = new int [n][m];
        cargar (M);
        comprobar(int[][],M);
        mostrar(int[][],M);
        
        public static void cargar (int [][] M){
        }
            for (int i = 0; i < M.length; i++) {
                for (int j = 0; j < M.length; j++) {
                    System.out.print ("ingrese el valor en la posicion ["+ i +"]["+ j +"]");
                    M [i][j] = leer.nextInt();        
                }     
            }
        }
        public static void comprobar (int [][] M){
            boolean log = false;
            for (int i = 0; i < M.length; i++) {
                for (int j = 0; j < M.length; j++) {
                    if (M [i][j] != -M [j][i]){
                        log = true;
                    }    
                }   
            }
            if (log){
                System.out.println("la matriz no es antisimetrica");
            }else{
                System.out.println("la matriz es antisimetrica");
            }
        }
        public static void mostrar (int[][] M){
            System.out.println("matriz cargada");
            for (int i = 0; i < M.length; i++) {
                for (int j = 0; j < M.length; j++) {
                    System.out.print(M [i][j] + "");    
                }
                System.out.println("");     
            }
            System.out.println("traspuesta de la matriz ");
            for (int i = 0; i < M.length; i++) {
                for (int j = 0; j < M.length; j++) {
                    System.out.print(M [j][i] + "");   
                }  
                System.out.println("");
            }
        }  
}
