/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author octav
 */
public class Mascota {
//Atributos

String nombre;
String especie;
int edad;
   
//Metodos
    
public void mostrarInfo(){
    
    System.out.println("----- Informacion de la mascota ----");
    System.out.println("Nombre: " + nombre );
    System.out.println("Especie: " + especie );
    System.out.println("Edad: " + edad );
}

public void cumplirAnios(){
    edad++;
    System.out.println("Se ha cumplido un año mas. Ahora tiene " + edad + " años.");
}
}
