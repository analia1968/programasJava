
package ejercicios_vectores_generales;
/**con el arreglo anterior creado calcula la suma y la media de todos sus valores
 */
public class suma_nros_vector {
    
    public static void main(String []args){
        int [] numeros = new int [50];
        int suma=0;
        double media = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            numeros [i]= i+1;
            suma+= numeros [i];             
        }
        System.out.println("la suma es: " +suma);
        media= (double)suma/numeros.length;
        System.out.println("la media es: "+media);
    }
}
