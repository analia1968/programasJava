/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer3_practico3;

import java.util.Scanner;
/**
 * @author Analia
 */
public class Ejer3_practico3{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo.
    //Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por 
    //pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
    //Nota: investigar la función Lenght() RETORNA LONGITUD DE CADENA.
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Inserte palabra o frase");  
        frase = leer.nextLine();// Line para que te muestre la frase
        int longitud = frase.length();
        if (longitud==8) {
            System.out.println("CORRECTO");
        }else {
            System.out.println("INCORRECTO");    
        }
    }   
}
    
    

