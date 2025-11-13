
package Ejercicio3;

/**
 *
 * @author adria
 */
public class NewMain {

   
    public static void main(String[] args) {
        Autor autor = new Autor("Gabriel Garcia Marquez", "Colobiana");
        Editorial editorial = new Editorial ("Sudamericana", "Calle 129");
        Libro libro = new Libro("Cien años de Soledad", "254-125-201", editorial);
        libro.setAutor(autor);
        
        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor().getNombre());
        System.out.println("Editorial: " + libro.getEditorial().getNombre());
       
    }
    
}
