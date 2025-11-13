
package Ejercicio14;

/**
 *
 * @author adria
 */
public class EditorVideo {
    
    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato, proyecto);
        System.out.println("Exportando proyecto: " + render.getProyecto().getNombre() + " en formato " + render.getFormato());
    }
    
    
}
