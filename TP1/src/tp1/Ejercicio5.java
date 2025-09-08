package tp1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nIngresa un numero entero:");
        int num1 = input.nextInt();

        System.out.println("Ingresa otro numero entero:");
        int num2 = input.nextInt();

        int resta = num1 - num2;
        int suma = num1 + num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;

        System.out.println("Suma: " + suma + 
                           "\nResta: " + resta + 
                           "\nMultiplicacion: " + multiplicacion + 
                           "\nDivision: " + division);

        input.close();
    }
}
