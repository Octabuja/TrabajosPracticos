
package Ejercicio2;

/**
 *
 * @author adria
 */
public class NewMain {

    public static void main(String[] args) {
       Usuario usuario = new Usuario("Pedro Lopez", "25362102");
       Bateria bateria = new Bateria("Samsung SDI", 5100);
       Celular celular = new Celular ("Samsung", "S23Ultra", "253621021562288", bateria);
       usuario.setCelular(celular);
       System.out.println("Uusuario: " + celular.getUsuario().getNombre());
       System.out.println("Bateria: " + celular.getBateria().getModelo());
    }   
}
