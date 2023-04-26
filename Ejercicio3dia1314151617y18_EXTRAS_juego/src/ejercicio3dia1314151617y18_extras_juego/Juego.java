package ejercicio3dia1314151617y18_extras_juego;
import java.util.Scanner;
/* 
 * Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a 
 * dos jugadores jugar un juego de adivinanza de números. El primer jugador 
 * elige un número y el segundo jugador intenta adivinarlo. El segundo jugador 
 * tiene un número limitado de intentos y recibe una pista de "más alto" o "más 
 * bajo" después de cada intento. El juego termina cuando el segundo jugador 
 * adivina el número o se queda sin intentos. Registra el número de intentos 
 * necesarios para adivinar el número y el número de veces que cada jugador 
 * ha ganado.
 */
public class Juego {
    private String nombreJugador1;
    private String nombreJugador2;
    private int num1;
    private int num2;
    
    public Juego() {
    }
    public void iniciar_Juego(){
        boolean opc=false;
        int contjg1=0;
        int contjg2=0;
        String opc1;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingroduzca el nombre de los jugadores por favor");
        System.out.println("===============Jugador Nro 1: ===========================");
        nombreJugador1=leer.next();
        System.out.println("===============Jugador Nro 2: ===========================");
        nombreJugador2=leer.next();
        while (opc!=true){
        int cont=1;
        System.out.println("===================EL JUEGO ESTA POR COMENZAR==================");
        System.out.println("El jugador "+nombreJugador1+" debe escribir un número sin que lo vea el jugador "+nombreJugador2+ " por favor");
        num1=leer.nextInt();
        System.out.println("===================  EL JUEGO HA COMENZADO  ==================");
        System.out.println("El jugador " + nombreJugador2+ " debe adivinar el número que escribio el jugador "+ nombreJugador1);
        System.out.println("Cuenta de 5 intentos y pequeñas ayudas");
        for (int i = 1; i < 6; i++) {
            System.out.println(nombreJugador2+" Ingrese un número por favor (intento nro "+i+"/5)");
            num2=leer.nextInt();
            if (num2 == num1) {
                System.out.println("El jugador "+nombreJugador2+" ha sido el VENCEDOR con "+i+" intentos");
                System.out.println("======================EL NUMERO MAGICO ERA "+ num1+"============================");
                contjg2++;
                break;
            }else if (num2 > num1) {
                System.out.println("El número ingresado es -=MAYOR=- al que escribio el jugador "+nombreJugador1);
            }else {
                System.out.println("El número ingresado es -=MENOR=- al que escribio el jugador " +nombreJugador1);
            }
            cont++;
        }
        if (cont>5) {
        System.out.println("El VENCEDOR ha sido el jugador "+nombreJugador1+ " porque el jugador "+nombreJugador2+" agoto todos sus intentos");
        System.out.println("======================EL NUMERO MAGICO ERA "+ num1+"============================");
        contjg1++;
        }System.out.println("Desea seguir jugando? S/N");
        opc1=leer.next();
        if (opc1.equalsIgnoreCase("N")){
            opc=true;
            System.out.println("=================RESULTADOS=====================");
            System.out.println("====="+nombreJugador1+" GANO "+contjg1+" VECES");
            System.out.println("====="+nombreJugador2+" GANO "+contjg2+" VECES");   
        }
         }     
    }
    public Juego(String nombreJugador1, String nombreJugador2, int num1, int num2) {
        this.nombreJugador1 = nombreJugador1;
        this.nombreJugador2 = nombreJugador2;
        this.num1 = num1;
        this.num2 = num2;
    }

    public void setNombreJugador1(String nombreJugador1) {
        this.nombreJugador1 = nombreJugador1;
    }

    public void setNombreJugador2(String nombreJugador2) {
        this.nombreJugador2 = nombreJugador2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public String getNombreJugador1() {
        return nombreJugador1;
    }

    public String getNombreJugador2() {
        return nombreJugador2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }
      
}
