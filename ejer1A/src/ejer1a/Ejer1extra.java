package ejer1a;
import entidad.Cancion;
/**desarrollar una clase cancion con los siguientes atributos: titulo y autor.Se 
 * debera definir ademas dos constructores:uno vacio que inicializa el titulo y 
 * el autor de cadenas vacias y otro que reciba como parametros el titulo y el 
 * autor de la cancion.Se deberan ademas definir los metodos getters y setter
 * correspondientes.
 */
public class Ejer1extra {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Cancion can1= new Cancion();
      can1.setTitulo("navegar");
      can1.setAutor(" javier calamaro");
        System.out.println(" titulo de la cancion: "+ can1.getTitulo());
        System.out.println("autor de la cancion: "+can1.getAutor());
        Cancion can2= new Cancion("sin documentos","los rodriguez");
        System.out.println(can2);
    } 
}
