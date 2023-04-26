
package ejercicios_vectores_generales;

import java.util.Scanner;

/**crear un arreglo de una longitud que determine el usuario y que le permita 
 * insertar nros entre 0 y 10
 */
public class vector_nrosAleatorios {
    
    public static void main (String []args){
        
        Scanner leer = new Scanner(System.in);
        System.out.println("inserte una longitud");
       int longitud = leer.nextInt();
        
        int numeros []= new int [longitud];
        int num;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("inserte un nro en la posicion "+i);
        }
            do{
                num = leer.nextInt();
                if  (!(num>=0 && num <=10)){
                    System.out.println("error. solo nros del 0 al 10"
                                       +"Inserte un nro en la posicion "+i);
                }
            } while  (!(num >= 0 && num <= 10));
                numeros [i] =num;   
            }
          System.out.println(" estos son los nros elegidos por el usuario");
            for (int i = 0; i < numeros.length; i++) {
                System.out.println( numeros[i]);
            
        }
            
        }
    
    
    

