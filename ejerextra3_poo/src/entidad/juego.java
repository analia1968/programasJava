package entidad;

/*
 *
 */
import java.util.Scanner;

public class juego {

    public int numAdivinar;
    public Scanner teclado;

    public Juego(int vidas, int numAdivinar) {
        super(vidas);
        this.numAdivinar = numAdivinar;
        teclado = new Scanner(System.in);
    }

    public void juega() {

        reiniciaPartida();
        boolean continuar = true;

        while (continuar) {

            System.out.print("Adivina un numero entre 0 y 100: ");
            int numero = teclado.nextInt();

            if (numero == numAdivinar) {
                System.out.println("Acertaste!!");
                actualizaRecord();
                continuar = false;
            } else {
                if (quitaVida()) {
                    System.out.print("El numero secreto es ... ");
                    System.out.println(numAdivinar > numero ? "Mayor" : "Menor");
                    System.out.println("Inténtalo otra vez...\n");
                } else {//quitaVida() retorna false
                    System.out.println("Perdiste!! Has agotado tus vidas.");
                    continuar = false;
                }
            }
        }
    }

}
