/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2;

import java.util.Scanner;

/**
 *
 * @author octav
 */
public class Ejercicio1 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Igrese un año ");
        int anio = Integer.parseInt(input.nextLine());
        
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 ==0)) {
            System.out.println("El año " + anio + " Es bisiesto");
            
        } else {
            System.out.println("El año " + anio + " No es bisiesto");
        }
        input.close();
    }
    
}
