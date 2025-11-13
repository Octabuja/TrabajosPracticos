
package Ejercicio8;

/**
 *
 * @author adria
 */
public class NewMain {

  
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Emanuel Farias", "julianfQgmail.com");
        Documento doc = new Documento("Contrato", "Contenido del contrato ", "abc456", "2025-03-25", usuario);
        
        System.out.println("Documento: " + doc.getTitulo());
        System.out.println("Usuario de la firma: " + doc.getFirma().getUsuario().getNombre());
        System.out.println("Hash de Firma: " + doc.getFirma().getCodigoHash());
 
    }
    
}
