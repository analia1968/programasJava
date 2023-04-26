package ejer7_guia3;
import java.util.Scanner;
/**
 *realizar un programa que simule el funcionamiento de un dispositivo RS232 este
 * tipo de dispositivo lee cadenas enviadas por el usuario.las cadenas deben 
 * llegar con un formato fijo: tiene que ser de un maximo de 5 caracteres de 
 * largo, el primer caracter tiene que ser X y el ultimo tiene que ser una o.
 * las secuencias leidas que respeten el formato se consideran correctas, la 
 * secuencia especial &&&&& marca el final de los envios y toda la secuencia
 * distinta que no respete el formato se considera incorrecta.al finalizar el 
 * proceso, se imprime un informe indicando la cantidad de lecturas correctas e
 * incorrectas recibidas.para resolver el ejercicio debera investigar como se
 * utilizan las siguientes funciones de java substring(), length(), equals().
 */
public class Ejer7_guia3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner leer = new Scanner(System.in);
        int cor,inc;
        String frase; 
        cor=0;
        inc=0;
        System.out.println("Marque &&&&& si desea finalizar");
        do{

        do {
        System.out.println("Ingresar una frase ");
        frase = leer.nextLine();
        }while (frase.length() > 5);

        if (frase.substring(0).equals("X") && frase.substring(5).equals("O") ){
             cor = cor + 1;
        } else 
            inc = inc + 1 ;

        } while (!"&&&&&".equals(frase) );

        System.out.println("La cantidad de lecturas correctas fueron: " + cor);
        System.out.println("La cantidad de lecturas incorrectas fueron: " + inc );
    }   
}
