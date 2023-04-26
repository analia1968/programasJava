
package ejer12_funcion;
import java.util.Scanner;
/**
 *crear un procedimiento es multiplo que reciba los dos nros pasados por el usuario
 * validando que el primer nro multiplo del segundo e imprima si el primer nro 
 * es multiplo del segundo, sino informe que no lo son
 */
public class Ejer12_funcion {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        Scanner leer = new Scanner(System.in);
        int num1, num2;
                
        System.out.println("Ingrese dos numeros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        EsMultiplo(num1,num2);   
    }
    public static void EsMultiplo(int num1,int num2){
        
        if ((num2 % num1)==0){
            System.out.println("El primer numero es multiplo del segundo");
        }else{
            System.out.println("El primer numero NO es multiplo del segundo");
        }  
    }    
}
    
    

