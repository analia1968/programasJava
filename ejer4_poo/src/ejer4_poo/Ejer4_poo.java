package ejer4_poo;
import entidad.rectangulo;
import java.util.Scanner;
/**crear una clase rectangulo que modele rectangulos por medio de un atributo 
 * privado base y un atributo privado altura.La clase incluira un metodo para 
 * crear el rectangulo con los datos del rectangulo dados por el usuario. Tambien
 * incluira un metodo para calcular la superficie del rectangulo y un metodo para
 * calcular el perimetro del rectangulo.Por ultimo, tendremos un metodo que 
 * dibujara el rectangulo mediante asteriscos usando la base y la altura.Se 
 * deberan ademas definir los metodos getters, setters y constructores correspon
 * dientes.   
 * superficie= base *altura/ perimetro=(base +altura)*2
 */
public class Ejer4_poo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la base: ");
        double base = leer.nextDouble();
        System.out.println("ingrese la altura: ");
        double altura =leer.nextDouble();
        
        rectangulo rec= new rectangulo();
        
        rec.crearRectangulo(altura, base);
        
        System.out.println("la superficie es : "+rec.calcularSuperficie());
        System.out.println("el perimetro es: "+rec.calcularPerimetro());
        rec.dibujar();
        
    }  
}
