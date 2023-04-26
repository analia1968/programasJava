package ejer3_vector;
import java.util.Scanner;
/**recorrer un vector de N enteros contabilizando cuantos numeros son de 1 digito,
 * cuantos de 2 digitos, etc (hasta 5 digitos) 
 */
public class Ejer3_vector {
    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in); 
        int a,b,N;
        int num=0;
        int digitos=0;
        int dig1=0, dig2=0, dig3=0, dig4=0, dig5=0;
          
        System.out .println("Ingrese la dimension del vector");
        N = leer.nextInt();
        
        int vector[] = new int[N];         
        for (int i=0; i<vector.length ; i++){
         
            a = (int) (Math.random() * 100);
            b = (int) (Math.random() * 100);
              
            vector[i] = a*b;  
            System.out.println("[" +vector[i] +"]");    
        }
        for (int i=0; i<vector.length ; i++){  
           num = vector[i]; 
           if (num==0){
               dig1++;
           }
           while (num >0){
           num= num/10;
           digitos++;
           }        
           switch (digitos){
               case 1: dig1++;
               break;
               case 2: dig2++;
               break;
               case 3: dig3++;
               break;
               case 4: dig4++;
               break;
               case 5: dig5++;
               break;
           }
           digitos=0;     
        }
        System.out.println("el vector tiene " +dig1 +" numeros de un digito");
        System.out.println("el vector tiene " +dig2 +" numeros de 2 digitos");
        System.out.println("el vector tiene " +dig3 +" numeros de 3 digitos");
        System.out.println("el vector tiene " +dig4 +" numeros de 4 digitos");
        System.out.println("el vector tiene " +dig5 +" numeros de 5 digitos");
        
        
    }
    
}