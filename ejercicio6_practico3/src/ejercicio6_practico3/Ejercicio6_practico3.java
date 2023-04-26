/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6_practico3;
import java.util.Scanner;
/**
 * @author Analia
 */
public class Ejercicio6_practico3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
       Scanner leer = new Scanner (System.in);
       System.out.println ("ingrese un nro entero");
       int num1 = leer.nextInt();
       System.out.println("ingrese otro nro entero");
       int num2 = leer.nextInt();
       int opcion;
       String conf;
     
        System.out.println("elija una opcion");
        System.out.println("1.sumar");
        System.out.println("2.restar");
        System.out.println("3.multiplicar");
        System.out.println("4.dividir");
        System.out.println("5.salir");
        System.out.print("la opcion es: ");
        opcion = leer.nextInt(); 
     
            switch (opcion){
        case 1: System.out.println("la suma es:" +(num1+num2));
        break;
        case 2: System.out.println("la resta es:"+(num1-num2));
        break;
        case 3: System.out.println("la multiplicacion es:"+(num1*num2));
        break;
        case 4: System.out.println("la division es:"+(num1/num2));
        break;
        case 5: System.out.println("esta seguro que quiere salir?");
        System.out.println("elija si/no :");
         conf = leer.nextLine();
        
                 
        if (conf.equalsIgnoreCase("s")){
         
            System.out.println("saliendo del sistema");
            break;
        } else {
            System.out.println("volver al menu");
      
        }
       
            }
    }
}
