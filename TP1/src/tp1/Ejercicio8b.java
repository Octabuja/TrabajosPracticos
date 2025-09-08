package tp1;

import java.util.Scanner;

public class Ejercicio8b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nIngresa un numero:");
        double num5 = input.nextDouble();

        System.out.println("Ingresa otro numero:");
        double num6 = input.nextDouble();

        double resultadoDecimal = num5 / num6;

        System.out.println("Resultado de la división decimal: " + resultadoDecimal);

        input.close();
    }
}
