package ejer13_b;
import java.util.Scanner;
/**realizar un vector con los nombres de los integrantes del grupo e imprimirlo 
 * por pantalla.
 */
public class Ejer13_B {
    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {

        String[] Equipo = new String[5];//declarar y construir vector

        for (int i = 0; i < Equipo.length; i++) {
            Scanner nombres = new Scanner(System.in);
            System.out.println(" Ingrese el nombre de los integrantes");
            Equipo[i] = nombres.nextLine();
        }
     for (int i = 0; i < 5; i++) {
        
            System.out.print("[" + Equipo[i] + "]");
    }
    System.out.println();
        }
}
    

