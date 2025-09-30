/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

/**
 *
 * @author octav
 */
public class Ejercicio13 {
 
     // b. Función recursiva para mostrar los precios originales
    public static void mostrarPrecios(double[] precios, int indice) {
        if (indice < precios.length) {
            System.out.println("Precio: $" + precios[indice]);
            mostrarPrecios(precios, indice + 1); // llamada recursiva
        }
    }
    
    public static void main(String[] args) {
        
        // a. Declarar e inicializar el array con precios
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // Mostrar precios originales
        System.out.println("Precios originales:");
        mostrarPrecios(precios, 0);
        
        // c. Modificar el precio de un producto específico
        precios[2] = 129.99;

        // d. Mostrar precios modificados usando la misma función recursiva
        System.out.println("Precios modificados:");
        mostrarPrecios(precios, 0);
    }
}
