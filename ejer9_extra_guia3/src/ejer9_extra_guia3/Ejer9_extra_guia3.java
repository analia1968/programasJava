package ejer9_extra_guia3;
import java.util.Scanner;
/**
 *simular la division usando solamente restas.dados dos nros enteros mayores que uno
 * realizar un algoritmo que calcule el cociente y el residuo usando solo restas. 
 * metodo:restar el dividendo del divisor hasta obtener un resultado menor que el 
 * divisor, este resultado es el residuo, y el numero de restas realizadas es el 
 * cociente.
 */
public class Ejer9_extra_guia3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int cociente=0;
        System.out. print("ingrese el dividendo: ");
        int a = leer.nextInt();
        System.out.print("ingrese el divisor: ");
        int b = leer.nextInt();
        while (a>=b){
            a=a-b;
            cociente++;
        }
       System.out.println("el resto es:"+a);
       System.out.println("el cociente es:"+cociente);
    }   
}
