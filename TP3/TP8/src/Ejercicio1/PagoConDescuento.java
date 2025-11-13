/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Ejercicio1;

/**
 * Interfaz 4b: Extiende la interfaz Pago e incluye la funcionalidad de descuento.
 */
public interface PagoConDescuento extends Pago {
    double aplicarDescuento(double total);
}