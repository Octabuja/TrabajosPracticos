
package Ejercicio11;

/**
 *
 * @author adria
 */
public class NewMain {

    
    public static void main(String[] args) {
        Artista artista = new Artista("Los Angeles Azules, Emilia", "Cumbia Mexicana");
        Cancion cancion = new Cancion("Perdonarte ¿Para que?", artista);
        Reproductor r = new Reproductor();
        r.reproducir(cancion);
        
    }
    
}
