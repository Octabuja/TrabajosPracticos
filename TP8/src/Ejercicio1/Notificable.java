/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Ejercicio1;

/**
 * Interfaz 5: Define el comportamiento de cualquier entidad que pueda ser notificada.
 */
public interface Notificable {
     void notificarCambioEstado(String estadoAnterior, String nuevoEstado, Pedido pedido);
}