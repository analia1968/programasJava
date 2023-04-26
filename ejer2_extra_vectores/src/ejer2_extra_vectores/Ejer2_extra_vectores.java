package ejer2_extra_vectores;
import java.util.Scanner;

/**escriba un programa que averigue si dos vectores de N enteros son iguales
 * (la comparacion debera detenerse en cuanto se detecte alguna diferencia entre
 * los elementos)
 */
public class Ejer2_extra_vectores {
    /**
     * @param args the command line arguments
     */
	public static void main(String[] args){
         Scanner leer = new Scanner (System.in);
        
            System.out.println("leer la dimension del primer vector");
            int a = leer.nextInt();
        
            System.out.println("leer la dimension del segundo vector");
            int b = leer.nextInt();
            
		int[] primero = 0;//{1,3,8,2};
		int[] segundo = 0; //{4,5,7,6};
                for (int i = 0; i < primero.length; i++) {
                    System.out.println("["+ primero[i]+"]");
                    for (int j = 0; j < segundo.length; j++) {
                        System.out.println("["+ segundo[i]+ "]");   
                    }
                }
            }
		//boolean result = false; //leer.Equals( primero, segundo );
		//if ( primero = segundo) {
			//System.out.println("los arreglos son iguales");
		//}else {
			//System.out.println("los arreglos no son iguales");
		//}
	//}
public static boolean isEqual (int[] primero, int[] segundo ){
	
	if (primero == segundo) {
			return true;
		}

		if (primero == null || segundo == null) {
			return false;
		}

		if (primero.length != segundo.length) {
			return false;
		}

		for (int i = 0; i < primero.length; i++)
		{
			if (primero[i] != segundo[i]) {
			return false;
			}
		}

		return true;
	}
}
