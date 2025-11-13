
package Ejercicio8;

/**
 *
 * @author adria
 */
public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firma;
    
    public Documento(String titulo, String contenido, String codigoHash, String fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = new FirmaDigital(codigoHash, fecha, usuario);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public FirmaDigital getFirma() {
        return firma;
    }

    public void setFirma(FirmaDigital firma) {
        this.firma = firma;
    }
    
    
    
}
