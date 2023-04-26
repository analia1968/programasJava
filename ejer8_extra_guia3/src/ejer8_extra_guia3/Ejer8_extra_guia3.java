package ejer8_extra_guia3;
import java.util.Scanner;
/**
 *escriba un programa que lea numeros enteros. si el nro es multiplo de 5 debe
 * detener la lectura y mostrar la cantidad de nros leidos, la cantidad de pares e 
 * impares.los nros negativos no deben sumarse. recordar la sentencia break.
 */
public class Ejer8_extra_guia3 {
    /**
     @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            int contadorPares = 0; //Acumular la suma de pares
            int contadorImpares = 0; //Contar la cantidad de impares introducidos
            int numero = 0;
            
            do {
                //Pedimos número
                System.out.print("Introduce un número entero(0 para SALIR): ");
                numero = teclado.nextInt();
                
                //Evaluamos si es par o impar
                if (numero % 2 == 0) //Es par
                  //  sumaPares = sumaPares + numero; //Acumulamos suma
                    contadorPares++;
                else //Es impar
                    contadorImpares++; //Contamos el impar introducido
            }while (numero != 0);
            
            //Bucle terminado, mostramos resultados
            System.out.println("\nLa cantidad de pares es: " + contadorPares);
            System.out.println("Cantidad impares introducidos: " + contadorImpares);
        } //Acumular la suma de pares
 
	} 
}
    
    

