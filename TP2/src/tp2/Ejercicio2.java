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
public class Ejercicio2 {
    
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Igrese el primer numero ");
        int num1 = Integer.parseInt(input.nextLine());
        System.out.println("Igrese el segundo numero ");
        int num2 = Integer.parseInt(input.nextLine());
        System.out.println("Igrese el tercer numero ");
        int num3 = Integer.parseInt(input.nextLine());
        
        int mayor = num1;
        
        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }
        System.out.println("El numero mayor es: " + mayor);
       
       input.close();
        
    }
    
}
