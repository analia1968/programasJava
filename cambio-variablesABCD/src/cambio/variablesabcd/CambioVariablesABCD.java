
package cambio.variablesabcd;
/**declarar cuatro variables de tipo entero A,B,C,D y asignarle un valor diferente.
 * A continuacion, realizar las instrucciones necesarias para que:
 * B tome el valor de C
 * C tome el valor de A
 * A tome el valor de D
 * D tome el valor de B
 */
public class CambioVariablesABCD {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int A = 2, B = 3, C = 4, D = 5, aux;

        System.out.println("Los valores para: ");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);

        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;

        System.out.println("Los valores para: ");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
    }
    }
    

