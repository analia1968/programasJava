package ejer4_funcion;
import java.util.Scanner;
/**
 * crea una aplicacion que nos pida un nro por teclado y con una funcion se lo
 * pasamos por parametro para que nos indique si es o no un nro primo, debe
 * devolver true si es primo, sino false.(son nros naturales que pueden
 * dividirse por 1 y por si mismo
 */
public class Ejer4_funcion {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nro;
        boolean primo = false;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un nro por teclado");
        nro = leer.nextInt();
        mostrarNroprimo(nro, primo);
    }

    public static void mostrarNroprimo(int nro, boolean primo) {
        if ((nro==2)||(nro==3)){
            System.out.println("es primo");
        }else if ((nro % 2 == 0) || (nro % 3 ==0)) {
            System.out.println(" no es primo");
        } else {
            System.out.println(" es primo");       
        }
    }
}
