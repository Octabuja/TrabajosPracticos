
package Ejercicio6;

/**
 *
 * @author adria
 */
public class NewMain {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Julian Ramirez", "25136520");
        Mesa mesa = new Mesa(2, 4);
        Reserva reserva = new Reserva("2025-11-22", "20:30", mesa);
        reserva.setCliente(cliente);
        System.out.println("Cliente: " + reserva.getCliente().getNombre());
        System.out.println("Mesa numero: " + reserva.getMesa().getNumero());

    }
    
}
