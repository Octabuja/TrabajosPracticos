/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author octav
 */
public class Principal {
    
    public static void main(String[] args) {
    
        //Instanciar mascota 
        
        Mascota mascota1 = new Mascota();
        
        mascota1.nombre = "Roco";
        mascota1.especie = "Perro";
        mascota1.edad = 12;
        
        // Mostrar información inicial    
        
        mascota1.mostrarInfo();
        
        // Simular el paso del tiempo
        
        mascota1.cumplirAnios();
        
        // Mostrar información actualizada
        
        mascota1.mostrarInfo();
    
    }
}
