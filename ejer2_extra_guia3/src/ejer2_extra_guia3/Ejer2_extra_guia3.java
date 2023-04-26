package ejer2_extra_guia3;
import java.util.Scanner;
/**declarar cuatro variables de tipo entero A,B,C,D y asignarle una valor diferente
 * a cada una.A continuacion, realizar las intrucciones necesarias para que:
 * B tome el valor de C.
 * C tome el valor de A
 * A tome el valor de D
 * D tome el valor de B
 */
public class Ejer2_extra_guia3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("a=");      //a=d
      int a =leer.nextInt();  
        System.out.print("b=");      // b=c
      int b =leer.nextInt(); 
         System.out.print("c=");   //c=a
     int c =leer.nextInt();   
             
         System.out.print("d=");   //d=b
     int d =leer.nextInt();         
     // int aux;
        System.out.println("la variables toman los siguientes valores:");

        System.out.println("a=" +d);
                System.out.println("b=" +c);
        System.out.println("c="+ a);      
                    System.out.println("d="+ b);
    }   
}
