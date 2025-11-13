/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 * Clase 5: Cliente, implementa Notificable.
 */
class Cliente implements Notificable {
    private String nombre;
    private String email;

    Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public void notificarCambioEstado(String estadoAnterior, String nuevoEstado, Pedido pedido) {
        System.out.printf("  [NOTIFICACIÓN a %s]: Su pedido #%d ha cambiado de estado de '%s' a '%s'.\n",
            this.nombre, pedido.getId(), estadoAnterior, nuevoEstado);
    }
    
    public String getNombre() { return nombre; }
}