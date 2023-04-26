
package ejerextra2_poo;
import entidad.puntos;
/**
 *
 * @author Analia
 */
public class Ejerextra2_poo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       puntos p = new puntos();
       p.crearPuntos(2, 3, 1, 2);
        System.out.println("la distancia es: "+p.calcularDistancia());
    }
    
}
