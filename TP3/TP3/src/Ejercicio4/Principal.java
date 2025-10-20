/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author octav
 */
public class Principal {
    public static void main(String[] args) {
        
        // Crear dos gallinas
        Gallina gallina1 = new Gallina(001,3);
        Gallina gallina2 = new Gallina(002,6);
        
        // Simular acciones de la primera gallina
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();
        gallina1.envejecer();

        // Simular acciones de la segunda gallina
        gallina2.ponerHuevo();
        gallina2.envejecer();
        gallina2.envejecer();
        
        // Mostrar estado final de ambas
        System.out.println("\n=== ESTADO FINAL DE LAS GALLINAS ===");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
    }
}
