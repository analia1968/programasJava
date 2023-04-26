package ejer11_extra_guia3;
import java.util.Scanner;
/**
 * escribir un programa que lea un numero entero y devuelva el numero de digitos
 * que componen ese nro. por ejemplo, si introducimos el numero 12345, el programa
 * debera devolver 5. calcular la cantidad de digitos matematicamente utilizando
 * el operador de division. nota:recordar que las variables de tipo entero truncan
 * los numeros o resultados.
 */
public class Ejer11_extra_guia3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in); 
       int cantidad=0;
       int numero;
       System.out.println("ingrese un nro por teclado");
       numero = leer. nextInt();
       while (numero >0){
           numero= numero/10;
                   cantidad++;
       }
       System.out.println("el nro tiene " + cantidad + " digitos");
    } 
}  

