/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author octav
 */
public class Principal {

    public static void main(String[] args) {
        
        Libro libro1 = new Libro("Cien años de soledad", "Garcia Marquez",1967);
        
        // Mostrar información inicial
        libro1.mostrarInfo();

        // Intentar modificar con un año inválido
        libro1.setAnioPublicacion(3020); // año inválido

        // Modificar con un año válido
        libro1.setAnioPublicacion(2010);

        // Mostrar información final
        libro1.mostrarInfo();
        
        
    
        
    }
   
}
