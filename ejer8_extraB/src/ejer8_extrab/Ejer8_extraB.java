
package ejer8_extrab;
import java.util.Scanner;
/**escriba un programa que lea numeros enteros.Si el numero es multiplo de cinco
 * debe detener la lectura y mostrar la cantidad de numeros leidos, la cantidad
 * de numeros pares y la cantidad de numeros impares.Al igual que el ejercicio 
 * anterior los numeros negativos no deben sumarse. Nota:recordar el uso de la 
 * sentencia break.
 */
public class Ejer8_extraB {
    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num, pares = 0, impares = 0, suma = 0;

        do {
            System.out.println("Ingrese numeros enteros");
            num = leer.nextInt();
            if (num > 0) {
                if ((num % 2) == 0) {
                    pares++;

                } else {
                    impares++;
                }
                suma = suma + num;
            }
        } while (!(num % 5 == 0));

        System.out.println(pares + " pares");
        System.out.println(impares + " impares");
        System.out.println("La cantidad total de numeros ingresados es "+(pares+impares));
    }
}
  
   
