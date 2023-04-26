package ejer12_b;
/**necesitamos mostrar un contador con 3 digitos, que muestre los nros del 000 al 
 * 999,con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
 */
public class Ejer12_B {
    /**
     * @param args the command line arguments
     */  
  public static void main(String[] args) {
    for (int i = 0; i < 1000; i++) {
      String num = String.format("%03d", i); // convierte el número en una cadena de 3 dígitos
      String numReemplazado = num.replace("3", "E"); // reemplaza los 3 por E
      System.out.println(numReemplazado);
    }
  }
}
    
 
