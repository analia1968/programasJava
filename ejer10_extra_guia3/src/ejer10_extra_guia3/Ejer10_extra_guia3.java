package ejer10_extra_guia3;
import java.util.Scanner;
/**
 *realice un programa para que el usuario adivine el resultado de una multiplicacion
 * entre dos numeros generados aleatoriamente entre 0 y 10. el programa debe indicar
 * al usuario si su respuesta es o no correcta. en caso que la respuesta sea incorrecta
 * se debe permitir al usuario ingresar su respuesta nuevamente. para realizar este 
 * ejercicio investigue como utilizar la funcion Math.random() de java.
 */
public class Ejer10_extra_guia3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {            
     Scanner leer= new Scanner(System.in);
     int num1, num2;
     double resultado, respuesta;
    num1=(int)(Math.random()*10);
    num2=(int)(Math.random()*10); 
    resultado=num1*num2;
        System.out.println(num1+ " y " +num2);
        resultado=num1+num2;
        resultado=num1/num2;
       resultado=num1-num2;
    do{ 
        System.out.println("escriba el resultado de la multiplicacion");
     respuesta= leer.nextInt();
     System.out.println("escriba el resultado de la suma");
     respuesta= leer.nextInt();
      System.out.println("escriba el resultado de la division");
     respuesta= leer.nextInt();
      System.out.println("escriba el resultado de la resta");
     respuesta= leer.nextInt();
     
    }while (resultado != respuesta);
        System.out.println("la respuesta ingresada es correcta");             
    }   
}
