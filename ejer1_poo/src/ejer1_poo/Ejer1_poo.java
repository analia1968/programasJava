package ejer1_poo;
import entidad.Libro;
/**crear una clase llamada libro que contenga los siguientes atributos: ISBN,
 * titulo, autos, numero de paginas y constructor con todos los atributos pasados
 * por parametro y un constructor vacio.Crear un metodo para cargar un libro
 * pidiendo los datos al usuario y luego informar mediante otro metodo el numero
 * de ISBN, el titulo, el autor del libro y el numero de paginas.
 */
public class Ejer1_poo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       Libro libro1 = new Libro();
      libro1.cargarLibro();
      libro1.mostrarLibro();
    }
}
