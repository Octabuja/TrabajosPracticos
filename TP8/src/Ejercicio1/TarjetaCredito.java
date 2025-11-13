/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 * Clase 4: Implementa PagoConDescuento.
 */
class TarjetaCredito implements PagoConDescuento  {
    private String numeroTarjeta;

    public TarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public boolean procesarPago(double monto) {
        System.out.printf("  -> Pagando $%.2f con Tarjeta de Crédito (****%s). Estado: Aprobado.\n", 
            monto, numeroTarjeta.substring(numeroTarjeta.length() - 4));
        return true;
    }

    @Override
    public double aplicarDescuento(double total) {
        // Ejemplo de descuento: 5% por usar Tarjeta de Crédito
        double descuento = total * 0.05;
        System.out.printf("  -> Descuento aplicado (5%%): $%.2f\n", descuento);
        return total - descuento;
    }
}
