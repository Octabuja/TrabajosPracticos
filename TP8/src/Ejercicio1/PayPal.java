/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 * Clase 4: Implementa solo la interfaz Pago.
 */
class PayPal implements Pago {
    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public boolean procesarPago(double monto) {
        System.out.printf("  -> Pagando $%.2f vía PayPal (%s). Estado: Aprobado.\n", monto, email);
        return true;
    }
}
