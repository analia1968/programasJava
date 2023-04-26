package entidad;
import java.util.Scanner;
/**
 * @author Analia
 */
public class Libro {
       int ISBN;
     String Titulo;
     String Autor;
     int numPaginas;
    
    public Libro(int ISBN, String Titulo, String Autor, int numPaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.numPaginas = numPaginas;
    }

    public Libro() {
    }
          public void cargarLibro() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el ISBN del libro: ");
        this.ISBN = scanner.nextInt();
        System.out.print("Ingrese el título del libro: ");
        this.Titulo = scanner.next();
        System.out.print("Ingrese el autor del libro: ");
        this.Autor = scanner.next();
        System.out.print("Ingrese el número de páginas del libro: ");
        this.numPaginas = scanner.nextInt();
    }
     public void mostrarLibro() {
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Título: " + this.Titulo);
        System.out.println("Autor: " + this.Autor);
        System.out.println("Número de páginas: " + this.numPaginas);
}
}
