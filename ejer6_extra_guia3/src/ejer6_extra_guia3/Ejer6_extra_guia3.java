package ejer6_extra_guia3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *leer la altura de N personas y determinar el promedio de estaturas que se encuentran
 * por debjajo de 1.60mts y el promedio de estaturas en general.
 */
public class Ejer6_extra_guia3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean continuar = true;
        double estatura, totalGeneral, total160;
        int contadorGeneral = 0;
        int contador160 = 0;
        totalGeneral = 0;
        total160 = 0;
        while (continuar) {
            try {
                System.out.print("Introduzca una altura: ");
                estatura = Double.parseDouble(br.readLine());
                totalGeneral += estatura;
                contadorGeneral++;
                if (estatura < 1.60) {
                    total160 += estatura;
                    contador160++;
                }
                System.out.println("Introduce S para ingresar una nueva altura: ");
                System.out.println("de otro modo introduzca otro valor para los resultados: ");
                continuar = br.readLine().equalsIgnoreCase("S");
            } catch (IOException | NumberFormatException ex) {
                System.out.println("Hubo un error de lectura");
            }
        }
        System.out.println("El promedio general: "+(totalGeneral/contadorGeneral));
       // System.out.println("\nEl promedio de estaturas por debajo de 1,60:"+total160/contador160);
    }
}
    
    

