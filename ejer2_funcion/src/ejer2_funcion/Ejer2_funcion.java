
package ejer2_funcion;
import java.util.Scanner;
/**diseñe una funcion que pida el nombre y la edad de N personas e imprima los 
 * datos delas personas ingresadas por teclado e indique si son mayores o menores
 * de edad despues de cada persona el programa debe preguntarle al usuario si quiere
 * seguir mostrando personas y frenar cuando el usuario ingrese la palabra "no"
 */
public class Ejer2_funcion {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        int edad;
        String respuesta;
      do{       
       Scanner leer= new Scanner(System.in);
       System.out.println("ingrese nombre");
       nombre= leer.nextLine();
       System.out.println("ingrese edad");
       edad= leer.nextInt();
       
       mostrarMayor(nombre, edad);
       leer.nextLine();
      System.out.println("desea seguir mostrando personas");
      respuesta=leer.nextLine();
      }while (!respuesta.equalsIgnoreCase("no"));
    }
    public static void mostrarMayor( String nombre, int edad){
        if (edad >=18){
            System.out.println(nombre +" es mayor de edad ");    
        }else{
          System.out.println(nombre +" No es mayor de edad ");  
        }
    }   
}
