
package Ejercicio12;

/**
 *
 * @author adria
 */
public class NewMain {

    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("Guido Soto", "20-52364120-7");
        Impuesto impuesto = new Impuesto(100000.0, contribuyente);
        Calculadora calc = new Calculadora();
        calc.calcular(impuesto);

    }
    
}
