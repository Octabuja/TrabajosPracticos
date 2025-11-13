/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 * Clase 2: Producto, implementa Pagable.
 */
class Producto implements Pagable {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Implementación de Pagable: el total de un producto es su precio.
    @Override
    public double calcularTotal() {
        return this.precio;
    }

    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
}
