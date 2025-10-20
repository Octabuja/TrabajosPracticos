/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author octav
 */
public class Principal {
    public static void main(String[] args) {
        
        NaveEspacial nave1 = new NaveEspacial("Apolo", 50);
        
        // Mostrar estado inicial
        nave1.mostrarEstado();

        // Intentar avanzar sin recargar
        nave1.despegar();
        nave1.avanzar(60); // no debería poder avanzar
        
        // Recargar combustible
        nave1.recargarCombustible(40);

        // Avanzar correctamente
        nave1.avanzar(30);
        
        // Mostrar estado final
        System.out.println("\n=== ESTADO FINAL DE LA NAVE ===");
        nave1.mostrarEstado();
    }
}
