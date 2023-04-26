
package ejer6_matrizmagica;
/**
 * @author Analia
 */
public class magico {
    public static void esMagico(int[][] m){
        int sumaFila =0;
        int sumaColumna =0;
        int cont=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumaFila += m[i][j];
                sumaColumna+=m[j][i];    
            }
            if(isIgual(sumaFila, sumaColumna)){
                cont++;
                if (cont == 3){
                    System.out.println("es magico");
                    mostrar(m);
                }else {
                    sumaFila =0;
                    sumaColumna =0;
                }
            }else {
                System.out.println("No es magico");
                mostrar(m);
                return;   
            }  
        }
    }
   private static boolean isIgual(int sumaFila, int sumaColumna){
       return sumaFila == sumaColumna;
   }
 private static void mostrar (int[][] m){ 
     for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
             System.out.print("("+m [i][j]+ ")");       
         }
         System.out.println();     
     }
 }
}
