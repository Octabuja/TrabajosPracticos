
package Ejercicio14;

/**
 *
 * @author adria
 */
public class NewMain {

    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Promo Institucional", 4);
        EditorVideo editor = new EditorVideo();
        editor.exportar("MP4", proyecto);
       
    }
    
}
