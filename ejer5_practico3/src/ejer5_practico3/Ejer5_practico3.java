package ejer5_practico3;
import java.util.Scanner;
/**escriba un programa en el cual se ingrese un valor limite positivo, y a 
 * continuacion solicite numeros al usuario hasta que la suma de los numeros
 * introducidos supere el limite inicial.
 */
public class Ejer5_practico3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer= new Scanner(System.in);
      int numero,valorlimite,suma=0;
      System.out.println("ingrese el valor limite");
      valorlimite= leer.nextInt();
      
      while(suma< valorlimite){
          System.out.println("ingrese un nro");
          numero= leer.nextInt();
          suma+= numero;   
      }        
     System.out.println("la suma de los nros es: " +suma +" supera el valor limite ingresado");   
    }
}
