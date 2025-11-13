
package Ejercicio13;

/**
 *
 * @author adria
 */
public class NewMain {

  
    public static void main(String[] args) {
        Usuario user = new Usuario("Claudia Benitez", "claudiaben@gmail.com");
        GeneradorQR gen = new GeneradorQR();
        gen.generar("CDF-586", user);
       
    }
    
}
