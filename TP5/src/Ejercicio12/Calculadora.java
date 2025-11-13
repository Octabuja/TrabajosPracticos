
package Ejercicio12;

/**
 *
 * @author adria
 */
public class Calculadora {
    public void calcular(Impuesto impuesto) {
        System.out.println("Calculo de impuesto de: " + impuesto.getContribuyente().getNombre());
        System.out.println("Monto: $" + impuesto.getMonto());
    }
    
}
