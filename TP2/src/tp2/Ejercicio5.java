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
public class Ejercicio5 {
    
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    
    int numero;
    int sumaPares = 0;
    
    System.out.println("Ingrese un numero (0 para terminar): ");
    
    numero = Integer.parseInt(input.nextLine());
    
    while (numero != 0){
        if (numero % 2 == 0){
            sumaPares += numero;
        }
        System.out.println("Ingrese un numero (0 para terminar): ");
        numero = Integer.parseInt(input.nextLine());
            
        }
        System.out.println("La suma de los numeros pares es: " + sumaPares);
        
        input.close();
    
    

}
    
}