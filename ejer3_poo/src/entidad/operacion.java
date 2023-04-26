
package entidad;
import java.util.Scanner;
/**
 *
 */
public class operacion {
    
    private double num1;
    private double num2;

    public operacion() {
    }

    public operacion(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }   

public void crearOperacion(){
    Scanner leer= new Scanner(System.in);
    System.out.println("ingrese num1:");
           this.num1=leer.nextDouble();
           System.out.println("ingrese num2:");
           this.num2= leer.nextDouble();
                     
}
public double sumar(){
    
   return   this.num1 +this.num2;
}
public double restar(){
    
   return   this.num1 -this.num2;
}
public double multiplicar(){
    if (this.num1==0 || this.num2==0){
        System.out.println("se produjo un error");
        return 0;     
    }
    else{
           return this.num1*this.num2;
    }
   
}
public double dividir(){
   if (this.num1==0 || this.num2==0){
        System.out.println("se produjo un error");
        return 0;     
    }
    else{
           return this.num1/this.num2;
    } 
}

}
