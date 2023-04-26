
package ejer_prueba_poo;
import entidad.Persona;
/**
 * @author Analia
 */
public class Ejer_prueba_poo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       //instanciacion utilizando el constructor por parametros
       Persona p2 = new Persona("marquez", "analia", 20415789);
        System.out.println(p2.apellido + " +"+ p2.nombre +" +"+ p2.dni);
    }
    
}
