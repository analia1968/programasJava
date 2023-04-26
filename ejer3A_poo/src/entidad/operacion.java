package entidad;
import java.util.Scanner;
/**
 *
 * @author Analia
 */
   public class operacion {
     private double numero1;
     private double numero2;

    public operacion() {
    }

    public operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
 public void crearOperacion(){
  Scanner leer = new Scanner(System.in);
     System.out.println("Ingrese dos numeros enteros: ");
     this.numero1=leer.nextDouble();
     this.numero2=leer.nextDouble();
 }    
public void sumanumeros(){
      System.out.println("El valor de la suma es :" + (this.numero1+this.numero2) );   
    }

public void restarnumeros (){
    System.out.println("El valor de la resta es: " + (this.numero1-this.numero2) );
  }
 public void multiplicarnumeros() {
        if (this.numero1 == 0 || this.numero2 == 0) {
            System.out.println("Al menos uno de los digitos ingresados es 0, por lo tanto la multiplicacion sera 0");
        } else {
            System.out.println("La multiplicacion de " + this.numero1 + " y de " + this.numero2 + " es = " + (this.numero1 * this.numero2));
        }
 }
 public void dividirnumeros() {
        if (this.numero1 == 0 || this.numero2 == 0) {
            System.out.println("Al menos uno de los digitos ingresados es 0, por lo tanto la division no es valida");
        } else {
            System.out.println("La division de " + this.numero1 + " y de " + this.numero2 + " es = " + (this.numero1 / this.numero2));
        }
    }
} 

