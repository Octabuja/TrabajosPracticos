
package Ejercicio4;

/**
 *
 * @author adria
 */
public class NewMain {
    public static void main(String[] args) {
       Cliente cliente = new Cliente("Carla Bianchi", "30158230");
       Banco banco = new Banco("Santander Rio", "27-30158230-2");
       TarjetaDeCredito tarjeta = new TarjetaDeCredito("4526-4521-7589-4521", "06-30", banco);
       cliente.setTarjeta(tarjeta);
       System.out.println("Clinete: " + tarjeta.getCliente().getNombre());
       System.out.println("Banco: " + tarjeta.getBanco().getNombre());
    }
    
}
