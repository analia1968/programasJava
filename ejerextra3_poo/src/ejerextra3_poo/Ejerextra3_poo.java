package ejerextra3_poo;
/**crear una clase juego que tenga un metodo "iniciar_juego" que permita a dos 
 * jugadores jugar un juego de adivinanza de numeros.El primer jugador elige un 
 * numero y el segundo jugador intenta adivinarlo.El segundo jugador tiene un 
 * numero limitado de intentos y recibe una pista de "mas alto" o "mas bajo" 
 * despues de cada intento.El juego se termina cuando el segundo jugador adivina
 * el numero o se queda sin intentos.Registra el numero de intentos necesarios
 * para adivinar el numero y el numero de veces que cada jugador ha ganado.
 */
public class Ejerextra3_poo {
    /**
     * @param args the command line arguments
     */
	public static void main(String[] args) {
 
		Juego adivinar = new Juego(); //Indicamos vidas y el número secreto
		adivinar.juega();
		System.out.println("\n\t\tFIN DE PROGRAMA");
 
	}
 
}
    
    

