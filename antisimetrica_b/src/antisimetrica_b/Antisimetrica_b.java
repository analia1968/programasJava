package antisimetrica_b;
/**realice un programa que compruebe si una matriz dada es antisimetrica.Se dice
 * que una matriz A es antisimetrica cuando esta es igual a su propia traspuesta,
 * pero cambiada de signo.Es decir, A es antisimetrica si A=-AT.La matriz 
 * traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas
 * por columnas (o viceversa).
 */
public class Antisimetrica_b {
    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {

        int matriz[][] = new int[3][3];
        int matrizT[][] = new int[3][3];
        boolean flag= true;
       
        matriz[0][1] = -2;
        matriz[0][2] = 4;
        matriz[1][0] = 2;
        matriz[1][1] = 0;
        matriz[1][2] = 2;
        matriz[2][0] = -4;
        matriz[2][1] = -2;
        matriz[2][2] = 0;
  
        System.out.println("Matriz:");
        
        for (int i = 0; i < 3; i++) {
            System.out.print("[");
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] +" ");
                matrizT[j][i] = matriz[i][j];}

                System.out.println("]");
            }
        System.out.println("");
        System.out.println("Matriz transpuesta:");
        
            for (int i = 0; i < 3; i++) {
                System.out.print("[");
                for (int j = 0; j < 3; j++) {
                    System.out.print(matrizT[i][j] +" ");
                }
                System.out.println("]");
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
            
                    if (matriz[i][j]+matrizT[i][j]==0){
                        flag=true;
                    }else {
                        flag=false;}
                }   
            }       
                   System.out.println("La matriz es antisimétrica:" +flag);    
        }
}
    
    

