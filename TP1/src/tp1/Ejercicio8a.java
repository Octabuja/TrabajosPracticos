package tp1;

import java.util.Scanner;

public class Ejercicio8a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nIngresa un numero entero:");
        int num3 = input.nextInt();

        System.out.println("Ingresa otro numero entero:");
        int num4 = input.nextInt();

        int resultadoEnteros = num3 / num4;

        System.out.println("Resultado de la división entera: " + resultadoEnteros);

        input.close();
    }
}
