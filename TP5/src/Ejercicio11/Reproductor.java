
package Ejercicio11;

/**
 *
 * @author adria
 */
public class Reproductor {
    public void reproducir (Cancion cancion) {
        System.out.println("Reproduciendo: " + cancion.getTitulo()
                + " por " + cancion.getArtista().getNombre());
    }
    
}
