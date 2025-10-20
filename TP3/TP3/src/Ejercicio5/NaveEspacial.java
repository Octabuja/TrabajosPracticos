/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author octav
 */
public class NaveEspacial {
    
    // Atributos
    private String nombre;
    private double combustible;
    private final double MAX_COMBUSTIBLE = 100.0; // límite máximo del tanque
    
    // Constructor
    public NaveEspacial(String nombre, double combustibleInicial) {
        this.nombre = nombre;
        if (combustibleInicial <= MAX_COMBUSTIBLE) {
            this.combustible = combustibleInicial;
        } else {
            this.combustible = MAX_COMBUSTIBLE;
        }
    }
    
    // Método para despegar
    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println("La nave " + nombre + " ha despegado. Combustible restante: " + combustible);
        } else {
            System.out.println("No hay suficiente combustible para despegar.");
        }
    }
    
    // Método para avanzar una distancia (consume 1 unidad por km)
    public void avanzar(double distancia) {
        double consumo = distancia * 1.0;
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println("La nave avanzó " + distancia + " km. Combustible restante: " + combustible);
        } else {
            System.out.println("Combustible insuficiente para avanzar " + distancia + " km.");
        }
    }
    
    // Método para recargar combustible con validación de límite
    public void recargarCombustible(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad de recarga debe ser positiva.");
            return;
        }

        if (combustible + cantidad > MAX_COMBUSTIBLE) {
            combustible = MAX_COMBUSTIBLE;
            System.out.println("Tanque lleno. No se puede superar el máximo de " + MAX_COMBUSTIBLE + " unidades.");
        } else {
            combustible += cantidad;
            System.out.println("Se recargaron " + cantidad + " unidades. Combustible actual: " + combustible);
        }
    }
    
     // Método para mostrar el estado de la nave
    public void mostrarEstado() {
        System.out.println("----- Estado de la Nave Espacial -----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Combustible actual: " + combustible + " / " + MAX_COMBUSTIBLE);
    }
    
    
}
