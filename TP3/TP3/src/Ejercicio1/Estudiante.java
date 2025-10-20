/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author octav
 */
public class Estudiante {
    
     // Atributos
    String nombre;
    String apellido;
    String curso;
    double calificacion;


// Métodos
public void mostrarInfo() {
    System.out.println("----- Informacion del Estudiante -----");
    System.out.println("Nombre: " + nombre + " " + apellido);
    System.out.println("Curso: " + curso);
    System.out.println("Calificacion: " + calificacion);
    System.out.println("--------------------------------------");
}

public void subirCalificacion(double puntos) {
        calificacion += puntos;
        System.out.println("La calificacion ha aumentado en " + puntos + " puntos.");
    }
public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
        if (calificacion < 0) {
            calificacion = 0; // No puede ser negativa
        }
        System.out.println("La calificacion ha disminuido en " + puntos + " puntos.");
    }
}