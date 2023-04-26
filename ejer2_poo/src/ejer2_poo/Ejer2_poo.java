package ejer2_poo;
import entidad.circunferencia;
/**declarar la clase circunferencia que tenga como atributo privado el radio de 
 * tipo real.A continuacion, se deben crear los siguientes metodos:
 * a) metodo constructor que inicialice el radio pasado como parametro.
 * b) metodos get y set para el atributo radio de la clase circunferencia.
 * c) metodo para crear circunferencia():que le pide el radio y lo guarda en el 
 * atributo del objeto.
 * d) metodo real():para calcular el area de la circunferencia (area=(pi*radio),2)
 * e) metodo perimetro():para calcular el perimetro (perimetro=2*pi*radio)
 */      
public class Ejer2_poo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //instancio el objeto circunferencia
     circunferencia c1 = new circunferencia(0);
     
     //aplico los 3 metodos e imprimo area y perimetro
        c1.crearCircunferencia();
        c1.area();
        c1.perimetro();
   
   }
}