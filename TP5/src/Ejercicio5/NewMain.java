
package Ejercicio5;

/**
 *
 * @author adria
 */
public class NewMain {
    public static void main(String[] args) {
        Propietario propietario = new Propietario("Juan Garcia", "32104526");
        Computadora pc = new Computadora ("ASUS VIVOBOOK", "SM456354", "ASUS HGF", "F520");
        propietario.setComputadora(pc);
        
        System.out.println("Propietario: " + pc.getPropietario().getNombre());
        System.out.println("Placa Madre: " + pc.getPlacaMadre().getModelo());
 
    }
    
}
