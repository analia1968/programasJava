package entidad;
/**
 * 
 */
public class rectangulo {
    private double base;
    private double altura;

    public rectangulo() {
    }

    public rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
    
    public void crearRectangulo(double altura, double base){
      
        this.altura= altura;
        this.base =base;
                         
    }
   public double calcularSuperficie() {
       return this.base*this.altura;
       
   }
   public double calcularPerimetro(){
       return (this.base+this.altura)*2;
       
   }
   public void dibujar(){
       for (int i = 0; i < this.altura; i++) {
           System.out.println("");
           for (int j = 0; j < this.base; j++) {
               System.out.print("*");       
           }
       }
       System.out.println("");
   }
}
