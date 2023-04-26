/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1sumadenros;

import java.util.Scanner;

/**
 *
 * @author Analia
 */
public class Ejer1sumadenros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       int num1 = 0;
       int num2 = 0;
       int suma = 0;
        System.out.println("ingrese un nro entero");    
         num1 = leer.nextlnt();
         
      System.out.println("ingrese otro nro entero");
      num2 = leer.nextlnt();
      System.out.println("la suma es:");
         suma= leer.nextlnt(num1 + num2);
         System.out.println("la suma es: ");
    }



        
       
