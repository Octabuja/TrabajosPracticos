/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author octav
 */
public class Libro {
    //Atributos
    
    private String nombre;
    private String autor;
    private int añoPublicacion;
    
    
    // Constructor
    public Libro(String nombre, String autor, int añoPublicacion) {
        this.nombre = nombre;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }
    
    //Getters
    
    public String getNombre(){
        return nombre;
    }
    public String getAutor(){
        return autor;
    }
    public int getAnioPublicacion(){
        return añoPublicacion;
    }
    
    //Setters
    
    public void setAnioPublicacion (int añoPublicacion){
       if (añoPublicacion > 0 && añoPublicacion <= 2025){
           this.añoPublicacion = añoPublicacion;
       }else{
            System.out.println("️ Año de publicación inválido: " + añoPublicacion);
            System.out.println("El año no se ha modificado.\n");
       } 
    }
    
    // Método para mostrar la información del libro
    
    public void mostrarInfo() {
        System.out.println("----- Información del Libro -----");
        System.out.println("Título: " + nombre);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + añoPublicacion);
    }
        
}
