
package ejercicios_vectores_generales;
/**crear un arreglo que contenga los nros del 1 al 100. Muestrelo por pantalla.
 * con el arreglo creado anteriormente, calcula la suma y la media de todos sus 
 * valores.
 */
public class Ejercicios_vectores_generales {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numeros []= new int [100];
       
       for (int i=0; i< 100;i++){
           numeros[i]=i +1;
        System.out.println(numeros [i]);
    }
    }  
}
