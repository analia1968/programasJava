package ejer1_extra_vector;
import java.util.Scanner;
/**
 *realizar un algoritmo que calcule la suma de todos los elementos de un vector
 * de tamaño N, con los valores ingresados por el usuario.
 */
public class Ejer1_extra_vector {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.print("ingrese el tamaño del vector: ");
        int tamaño = leer.nextInt();
        int suma =0;
        int vector[]= new int[tamaño];//crear un vector
         
        System.out.println("ingrese los nros enteros");
        for(int i=0;i< vector.length ;i++){
            {      
           vector[i]= leer.nextInt();
            suma= suma+ vector[i];
    } 
            System.out.println("la suma es: " +suma );
            } 
    }
}
