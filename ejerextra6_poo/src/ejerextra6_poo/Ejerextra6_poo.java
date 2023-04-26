package ejerextra6_poo;
import entidad.rectangulo;
/**crea una clase "rectangulo" que tenga atributos "lado1" y "lado2" y un metodo
 * "calcular_area" que calcule y devuelva el area del rectangulo.Luego crea un 
 * objeto "rectangulo1" de la clase "rectangulo" con lados de 4 y 6 e imprime el 
 * area del rectangulo.
 */
public class Ejerextra6_poo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        rectangulo rec1= new rectangulo();
       
        System.out.println("el area del rectangulo es: "+rec1.calcularArea(4, 6));
         
    }   
}
