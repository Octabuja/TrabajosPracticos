
package Ejercicio7;

/**
 *
 * @author adria
 */
public class NewMain {

  
    public static void main(String[] args) {
        Conductor conductor = new Conductor ("Carlos Windsor", "Lic52321");
        Motor motor = new Motor("Nafta", "FSG00125");
        Vehiculo vehiculo = new Vehiculo("AA251FG", "Chevrolet Onix", motor);
        conductor.setVehiculo(vehiculo);
        
        System.out.println("Conductor: " + vehiculo.getConductor().getNombre());
        System.out.println("Motor: " + vehiculo.getMotor().getTipo());
    }
    
}
