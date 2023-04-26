
package ejer1_guia4_funciones;
import java.util.Scanner;
/**
 *Crea una aplicación que le pida dos números al usuario y este pueda elegir 
 * entre sumar, restar, multiplicar y dividir. La aplicación debe tener una 
 * función para cada operación matemática y deben devolver sus resultados para 
 * imprimirlos en el main. 
 */
public class Ejer1_guia4_funciones {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int a,b;
       int resultado;
       System.out.print("ingrese primer nro ");
       a= leer.nextInt();
       System.out.print ("ingrese segundo nro ");
       b= leer.nextInt();
    
     resultado =  sumar( a,b);
     System.out.print("la suma es:");
    System.out.println(resultado);
     resultado = restar(a,b);
     System.out.print("la resta es:");
    System.out.println(resultado);
     resultado = multiplicar(a,b);
     System.out.print("la multiplicacion es:");
    System.out.println(resultado);
     resultado = dividir(a,b);
     System.out.print("la division es:");
    System.out.println(resultado);
    }
   public static int sumar(int a, int b){
       int resultado = a+b;
       return resultado;
   }
   public static int restar (int a, int b){
       int resultado = a-b;
       return resultado;
   }
   public static int multiplicar (int a, int b){
       int resultado = a*b;
       return resultado;
   }
   public static int dividir (int a, int b){
       int resultado = a/b;
       return resultado;
   }
}
