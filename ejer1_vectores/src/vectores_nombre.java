import java.util.ArrayList;
/**Ingresar los nombres a un vector e imprimirlos por pantalla.
 */
public class vectores_nombre {
    public static void main (String[]args){
        ArrayList <String> listaNombres = new ArrayList();
        //metodo para añadir a nuestro arraylist
        //.add()añade elementos a nuestra arraylist
        
        listaNombres.add("bernardo");
        listaNombres.add("julieta");
        listaNombres.add("elena");
        listaNombres.add("teresa");
        listaNombres.add("analia");
        
        //metodo para recorrer nuestro arraylist
        //.size() indica el tamaño de nuestro arraylist
        
        for (int i = 0; i < listaNombres.size(); i++) {
            
            //.get()sirve para devolverme un elemento especifico
            
            System.out.println(listaNombres.get(i));    
        }
    }   
}
