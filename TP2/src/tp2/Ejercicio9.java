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
public class Ejercicio9 {
    
    static double precioProducto;
    
    public static double calcularCostoEnvio(double peso, String zona){
        int precioEnv;
        
        if (zona.equalsIgnoreCase("Nacional")) {
            precioEnv = 5;
        } else if(zona.equalsIgnoreCase("Internacional")){
            precioEnv = 10;
        }else{
            System.out.println("Zona invalida. Se asumira costo 0.");
            precioEnv = 0;
        }
        double costoEnvio = peso * precioEnv;
        return costoEnvio;
        
    }
    
    public static double calcularTotalCompra (double precioProducto, double costoEnvio){
        double totalCompra = precioProducto + costoEnvio;
        return totalCompra;
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Pedir el precio
        System.out.print("Ingrese el precio del producto: ");
        precioProducto = Double.parseDouble(input.nextLine());
        
        //Pedir el peso del producto en kg
        System.out.println("Ingrese el peso del paquete en kg");
        double peso = Integer.parseInt(input.nextLine());
        
        //Pedir zona
        System.out.println("Ingrese la zona de envio(Nacional/Internacional)");
        String zona = input.nextLine();
        
        //Calcular costos
        double costoEnvio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precioProducto, costoEnvio);
        
        //Mostrar resultados
        System.out.println("El costo del envio es: "+ costoEnvio);
        System.out.println("El total a pagar es: "+ total);
        
        input.close();
    }
    
}


