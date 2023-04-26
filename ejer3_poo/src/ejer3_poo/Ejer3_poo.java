package ejer3_poo;
import entidad.operacion;
/**crear una clase llamada Operacion que tenga como atributos privados numero1 y 
 * numero2.A continuacion, se deben crear los siguientes metodos:
 * a) metodo constructor con todos los atributos pasados por parametro.
 * b) metodo constructor con sin los atributos pasados por parametro.
 * c) metodos get y set.
 * d) metodo para crearOperacion(): que le pide al usuario los dos numeros y los
 * guarda en los atributos del objeto.
 * e) metodo sumar(): calcular la suma de los numeros y devolver el resultado al
 * main.
 * f) metodo restar(): calcular la resta de los numeros y devolver el resultado
 * al main.
 * g) metodo multiplicar(): primero valida que no se haga una multiplicacion por 
 * cero, si fuera a multiplicar por cero, el metodo devuelve 0 y se le informa al 
 * usuario el error. Si no, se hace la multiplicacion y se devuelve el resultado 
 * al main.
 * h) metodo dividir(): primero valida que no se haga una division por cero, si 
 * fuera a pasar una division por cero, el metodo devuelve 0 y se le informa al 
 * usuario el error se le informa al usuario. Si no, se hace la division y se 
 * devuelve el resultado al main.
 */
public class Ejer3_poo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instanciamos el objeto
        operacion op = new operacion();
        
        //aplico los metodos 
        op.crearOperacion();
        System.out.println("la suma es:"+op.sumar());
        System.out.println("la resta es:"+op.restar());
        System.out.println("la multiplicacion es:"+op.multiplicar());
        System.out.println("la division es:"+op.dividir());
    
    }
    
}
