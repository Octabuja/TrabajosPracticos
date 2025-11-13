
package Ejercicio1;

/**
 *
 * @author adria
 */
public class NewMain {
    public static void main(String[] args) {
        Titular titular = new Titular("Sofia Garcia", "30254123");
        Pasaporte pasaporte = new Pasaporte ("AB456789", "2022-05-12", "foto.jpg", "JPEG");
        titular.setPasaporte(pasaporte);
        System.out.println("Pasaporte numero: " + pasaporte.getNumero());
        System.out.println("Titular: " + pasaporte.getTitular().getNombre());
        System.out.println("Foto: " + pasaporte.getFoto().getImagen());
    }
    
}
