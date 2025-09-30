package tp1;

import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nIngresa tu nombre:");
        String nombre1 = input.nextLine();

        System.out.println("Ingresa tu edad:");
        int edad1 = input.nextInt();

        System.out.println("Tu nombre es: " + nombre1 + 
                           "\nTu edad es: " + edad1);

        input.close();
    }
}
