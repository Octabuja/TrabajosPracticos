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
public class Ejercicio8 {
    
     // Variable global para almacenar el precio base ingresado desde main
    static double precioBase;

    // Método que calcula el precio final
    public static double calcularPrecioFinal(double impuesto, double descuento) {
        double precioFinal = precioBase + (precioBase * (impuesto / 100)) - (precioBase * (descuento / 100));
        return precioFinal;
    
 }
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Pedir el precio base
        System.out.print("Ingrese el precio base del producto: ");
        precioBase = Double.parseDouble(input.nextLine());

        // Pedir impuesto y descuento
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = Double.parseDouble(input.nextLine());

        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = Double.parseDouble(input.nextLine());

        // Llamar al método
        double precioFinal = calcularPrecioFinal(impuesto, descuento);

        // Mostrar resultado
        System.out.println("El precio final del producto es: " + precioFinal);

        input.close();
    }    
}
