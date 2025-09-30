/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

import java.util.Scanner;

/**
 *
 * @author octav
 */
public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa tu edad");
        int edad = Integer.parseInt(input.nextLine());
        
        if (edad < 12) {
            
            System.out.println("Eres un niño");
            
        }else if (edad >= 12 && edad <= 17){
            
            System.out.println("Eres adolescente");
            
        }else if (edad >= 18 && edad <= 59){
            
            System.out.println("Eres adulto");
            
        }else if (edad >=60){
            
            System.out.println("Eres adulto mayor");
            
        }else{
            
            System.out.println("Edad no valida");
        }
    
    
    }
    
}
