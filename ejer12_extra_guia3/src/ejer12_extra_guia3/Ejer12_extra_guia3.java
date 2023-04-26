package ejer12_extra_guia3;
import java.util.Scanner;
/**
 *necesitamos mostrar un contador con 3 digitos (xxx)que muestre los numeros del
 * 000 al 999 con la particularidad que cada vez que aparezca un 3 lo sustituya 
 * por una E.
 */
public class Ejer12_extra_guia3 {
    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
            
       Scanner leer= new Scanner(System.in);
       String numero, fraseFinal;
            System.out.println("nros de 3 digitos que lleve 3:");
       numero= leer.nextLine();
       
       fraseFinal = numero.replace("3", "E");
       
       System.out.println("el codigo reemplazado es");
       System.out.println(fraseFinal);
    }   
}
        
        
       
               
    
    

