package ejer6_menu;
import java.util.Scanner;
/**realizar un programa que pida dos numeros enteros positivos por teclado y muestre
 * por pantalla el siguiente menu: el usuario debera elegir una opcion y el programa
 * debera mostrar el resultado por pantalla y luego volver al menu. El programa
 * debera ejecutarse hasta que se elija la opcion 5. Tener en cuenta que, si el 
 * usuario selecciona la opcion 5, en vez de salir del programa directamente, se
 *  debe mostrar el siguiente mensaje de confirmacion:¿esta seguro que desea salir
 * del programa (s/n)?.Si el usuario selecciona el caracter "s" se sale del programa
 * caso contrario se vuelve a mostrar el menu.
 */
public class Ejer6_menu {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner readIn = new Scanner(System.in);
        int num1, num2, option;
        boolean salir = false;
          
        System.out.print("Ingrese el primer numero: ");
        num1 = readIn.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2 = readIn.nextInt();
        
        while(!salir){
            System.out.println("Menu");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.print("elija opción: ");
            
            option = readIn.nextInt();
            
            switch(option){
                case 1:
                    System.out.println("El resultado de la suma es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("El resultado de la resta es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("El resultado de la multiplicacion es: " + (num1 * num2));
                    break;
                case 4:
                    if(num2 == 0){
                        System.out.println("No es posible dividir por 0, intente nuevamente");
                    }else{    
                        System.out.println("El resultado de la division es: " + (num1 / num2));
                    }
                    break;
                case 5:
                    System.out.println("Realmente desea salir? S/N ");
                    String confirm = readIn.next();
                    if(confirm.equalsIgnoreCase("S")){
                       salir = true;
                        System.out.println("Gracias por utilizar nuestro sistema! Hasta luego");
                    }
                    break;
                    
                default:
                    System.out.println("La opción ingresada no es válida. Intente nuevamente");
                    break;
            }    
        }                 
        }          
    }




   
    
