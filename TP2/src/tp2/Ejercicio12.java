/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

/**
 *
 * @author octav
 */
public class Ejercicio12 {
    
    public static void main(String[] args) {
        
        // a. Declarar e inicializar el array con precios
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        // b. Mostrar valores originales
        System.out.println("Precios originales:");
        
        for(int i =0; i<precios.length; i++){
            
            System.out.println("Precio: $ " + precios[i]);
        }
        
        // c. Modificar el precio de un producto específico
        precios[2] = 129.99;
        
        // d. Mostrar valores modificados
        System.out.println("Precios modificados:");
        
        for(int i=0; i < precios.length; i++){
            
            System.out.println("Precio: $ " + precios[i]);
        }
    }
}
