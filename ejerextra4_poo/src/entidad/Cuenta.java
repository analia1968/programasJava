package entidad;
import java.util.Scanner;
/**
 *
 */
    public class Cuenta {
        
    public double saldo=30000.75;
    public double trans;
    public String titular;

    public Cuenta() {
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public void retirar_dinero(){
        Scanner sc=new Scanner (System.in);
        System.out.println("---------------------------");
        System.out.println("Saldo total : $"+saldo);
        System.out.println("---------------------------");
        System.out.println("Ingrese monto a retirar: "); 
        trans=sc.nextDouble();

        if (trans<saldo){
            saldo-=trans;
            System.out.println("---------------------------");
            System.out.println("Monto retirado : $"+trans);
            System.out.println("Saldo total : $"+saldo);
            System.out.println("---------------------------");
        }else{
            System.out.println("---------------------------");
            System.out.println("Saldo insuficiente para realizar esta operación");
            System.out.println("Saldo disponible : $"+saldo);
            System.out.println("---------------------------");
        }
    }
}
    

