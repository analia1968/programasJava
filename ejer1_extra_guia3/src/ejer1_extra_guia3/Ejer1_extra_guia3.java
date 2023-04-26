package ejer1_extra_guia3;
import java.util.Scanner;
/**
 *dado un tiempo en minutos, calcular su equivalente en dias y horas. por ejemplo
 * si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente:
 * 1 dia, 2 horas.
 */
public class Ejer1_extra_guia3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int minutos, horas, dias;
        Scanner leer= new Scanner(System.in);
        System.out.println("introducir el numero de minutos: ");
        minutos = leer.nextInt();
     
        horas = minutos /60;
        minutos = minutos % 60;
        dias = horas /24;
        horas= horas % 24;
        System.out.println( "los valores ingresados son:" + dias+ " dias, " + horas+ " horas " +minutos +" minutos");
    }  
}
