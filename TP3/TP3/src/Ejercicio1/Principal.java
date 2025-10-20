
package Ejercicio1;


public class Principal {

   
    public static void main(String[] args) {
       // Crear una instancia de Estudiante
        Estudiante estudiante1 = new Estudiante();
        
        estudiante1.nombre = "Octavio";
        estudiante1.apellido = "Bujaldon";
        estudiante1.curso = "Programacion 2";
        estudiante1.calificacion = 8.5;
        
        // Mostrar información inicial
        estudiante1.mostrarInfo();

        // Subir calificación
        estudiante1.subirCalificacion(1.0);
        estudiante1.mostrarInfo();

        // Bajar calificación
        estudiante1.bajarCalificacion(2.0);
        estudiante1.mostrarInfo();
    }
                
    }
    

