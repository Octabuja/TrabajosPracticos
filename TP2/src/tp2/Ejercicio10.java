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
public class Ejercicio10 {
    
    // Método para calcular el nuevo stock
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        return nuevoStock;
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = Integer.parseInt(input.nextLine());

        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = Integer.parseInt(input.nextLine());

        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = Integer.parseInt(input.nextLine());
        
        
        // Calcular stock actualizado usando el método
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);

        // Mostrar resultado
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
        
        input.close();
    }
    
}
