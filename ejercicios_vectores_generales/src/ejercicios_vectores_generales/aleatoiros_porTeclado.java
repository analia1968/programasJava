
package ejercicios_vectores_generales;
import java.util.Scanner;

/**crea un arreglo insertando nros aleatorios entre 0 y 10. Muestrelo por 
 * pantalla.
 */
public class aleatoiros_porTeclado {
    public static void main (String []args){
        Scanner leer = new Scanner (System.in);
        System.out.println("inserte una longitud");
        int longitud = leer.nextInt();
        int numeros []= new int [longitud];
       // int num=0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]= generaNumeroAleatorio(0,10);
            System.out.println( numeros[i]);
        } 
    }
    public static int generaNumeroAleatorio(int minimo, int maximo){
        return (int)Math.floor(Math.random()*(minimo-(maximo+1) +(maximo +1)));
    }   
}
