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
public class Ejercicio6 { 
        
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int numero ;
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        
        for(int i = 1; i <= 10; i ++){
            System.out.println("Ingrese el numero " + i + ":");
            numero = Integer.parseInt(input.nextLine());
            
            if (numero < 0){
                negativos++;
            }else if (numero > 0){
                positivos++;
            }else{
                ceros++;
            }
        }
    
        System.out.println("Resultados:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
        
        input.close();
    }
    
}
