/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author octav
 */
public class Gallina {
    
    //Atributos
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    
    //Constuctor
    
    public Gallina(int idGallina,int edad){
        this.edad = edad;
        this.idGallina = idGallina;
        this.huevosPuestos =0;
    }
    
    // Método para poner un huevo
    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println("La gallina " + idGallina + " ha puesto un huevo. Total: " + huevosPuestos);
    }

    // Método para envejecer
    public void envejecer() {
        edad++;
        System.out.println("La gallina " + idGallina + " ha envejecido. Ahora tiene " + edad + " años.");
    }
    
    // Método para mostrar el estado actual
    public void mostrarEstado() {
        System.out.println("----- Estado de la Gallina -----");
        System.out.println("ID: " + idGallina);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Huevos puestos: " + huevosPuestos);
        
    }
}
