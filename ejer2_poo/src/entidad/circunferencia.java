package entidad;
import java.util.Scanner;
/**
 * 
 */      
 public class circunferencia {
 
    private double radio;

    public circunferencia() {
    }

    public circunferencia(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    public void crearCircunferencia(){
    Scanner leer = new Scanner(System.in); 
    System.out.println("Ingrese el radio");
    this.radio = leer.nextDouble();
    }
  
    public void area(){
    double area;
    area = Math.pow(Math.PI*this.radio,2);
        System.out.println("El radio es:" + area);
      
}
   public void perimetro(){
   System.out.println("El area de la circunferencia es: "+ (2*Math.PI*this.radio));
    } 
  }