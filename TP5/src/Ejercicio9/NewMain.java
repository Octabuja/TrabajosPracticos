
package Ejercicio9;

/**
 *
 * @author adria
 */
public class NewMain {

  
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Juan Perez", "OSDE");
        Profesional profesional = new Profesional("Dr. Emanuel Lustoff", "Urologia");
        CitaMedica cita = new CitaMedica("2025-11-17", "12:00");
        cita.setProfesional(profesional);
        cita.setPaciente(paciente);
        System.out.println("Paciente: " + cita.getPaciente().getNombre());
        System.out.println("Profesional: " + cita.getProfesional().getNombre());

    }
    
}
