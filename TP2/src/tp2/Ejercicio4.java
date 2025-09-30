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
public class Ejercicio4 {
    
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Solicitar precio
        System.out.println("Ingrese el precio del producto");
        double precio = Double.parseDouble(input.nextLine());
        
        //Solcitar categoria
        System.out.println("Ingrese la categoria del producto (A,B o C)");
        char categoria = input.next().toUpperCase().charAt(0);
        
        input.close();
        
        double descuento = 0;
        
        //Determinar descuento segun categoria
        
        switch (categoria) {
            case 'A':
                descuento = 0.1;
                break;
            case 'B':
                descuento = 0.15;
                break;
            case 'C':
                descuento = 0.2;
                break;    
            default:
                System.out.println("Categoria no valida.");
                
        }
        
        //Precio con descuento
        double montoDescuento = precio * descuento;
        double precioFinal = precio - montoDescuento;
        
        //Mostrar los resultados
        System.out.println("Precio original: " + precio);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);
        
        
    }
    
}
