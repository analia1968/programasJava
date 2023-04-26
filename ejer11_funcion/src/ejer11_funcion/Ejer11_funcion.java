/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer11_funcion;
import java.util.Scanner;
/**
 *
 * @author Analia
 */
public class Ejer11_funcion {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        
        Scanner leer = new Scanner(System.in);
        
        String frase;
        
        System.out.println("Ingrese la frase:");
        frase = leer.nextLine();
        
        String frase_nueva = codificacion(frase);
        
        System.out.println(frase_nueva);
        
    }
    
        public static String codificacion(String frase) {       
                
            String codificacion;
            
            int longitud;
            String letra ="";
            
            longitud = frase.length();
            
            for (int i=0; i<(longitud-1); i++){
                
                switch (frase.substring(i,(i+1))){
                    case "a": 
                        frase = frase.replace("a", "@");
                    break;
                    case "e":
                        frase = frase.replace('e', '#');
                    break;
                    case "i":
                        frase = frase.replace('i', '$');
                    break;
                    case "o":
                        frase = frase.replace('o', '%');
                    break;
                    case "u":
                        frase = frase.replace('u', '*'); 
                    break;        
                }    
            }    
            return frase;
    }  
}  
    

