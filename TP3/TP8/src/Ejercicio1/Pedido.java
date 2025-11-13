/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase 3 & 5: Pedido, implementa Pagable y utiliza Notificable.
 */
class Pedido implements Pagable {
    private static int nextId = 1000;
    private int id;
    private List<Producto> productos;
    private Cliente cliente;
    private String estado; // Ejemplo: "Pendiente", "Procesando", "Enviado", "Entregado"

    public Pedido(Cliente cliente) {
        this.id = nextId++;
        this.productos = new ArrayList<>();
        this.cliente = cliente;
        this.estado = "Pendiente";
        System.out.printf("Pedido #%d creado para %s. Estado inicial: %s\n", this.id, cliente.getNombre(), this.estado);
    }

    public void agregarProducto(Producto p) {
        this.productos.add(p);
    }
    
    // Implementación de Pagable
    @Override
    double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }
    
    // Método para la notificación (punto 5)
    public void cambiarEstado(String nuevoEstado) {
        String estadoAnterior = this.estado;
        this.estado = nuevoEstado;
        
        // Notificar al cliente si el estado realmente cambió
        if (!estadoAnterior.equals(nuevoEstado)) {
            System.out.printf("  [LOG Pedido #%d]: Estado cambiado.\n", this.id);
            cliente.notificarCambioEstado(estadoAnterior, nuevoEstado, this);
        }
    }
    
    public int getId() { return id; }
    public String getEstado() { return estado; }
}