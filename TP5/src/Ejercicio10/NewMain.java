
package Ejercicio10;

/**
 *
 * @author adria
 */
public class NewMain {

 
    public static void main(String[] args) {
        Titular titular = new Titular("Juan Garcia", "21202251");
        ClaveSeguridad cs = new ClaveSeguridad("sg586", "2025-01-20");
        CuentaBancaria cuenta = new CuentaBancaria("12589632542652103", 20000.00, "dfe586", "2025-06-14");
        titular.setCuenta(cuenta);
        System.out.println("Titular: " + cuenta.getTitular().getNombre());
        System.out.println("Saldo: " + cuenta.getSaldo());
        System.out.println("Clave: " + cuenta.getClave().getCodigo());

    }   
}
