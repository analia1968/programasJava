package ejer1_vectores;
/**realizar un algoritmo que llene un vector con los 100 primeros numeros enteros
 * y los muestre por pantalla en orden descendente.
 */
public class Ejer1_vectores {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[]nros= new int[100];
        for (int i = 0; i< nros.length; i++) {
             nros[i]=i+1;
        }
             for (int i= 99; i >= 0;i--){
           System.out.println("["+nros[i]+"]");       
        }                    
        }  
    }
    

