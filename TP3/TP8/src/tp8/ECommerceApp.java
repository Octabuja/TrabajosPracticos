/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp8;

import java.util.ArrayList;
import java.util.List;

// -----------------------------------------------
// INTERFACES
// -----------------------------------------------

interface Pagable {
    double calcularTotal();
}

interface Pago {
    boolean procesarPago(double monto);
}

interface PagoConDescuento extends Pago {
    double aplicarDescuento(double total);
}

interface Notificable {
    void notificarCambioEstado(String estadoAnterior, String nuevoEstado, Pedido pedido);
}

// -----------------------------------------------
// CLASES
// -----------------------------------------------

class Producto implements Pagable {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    double calcularTotal() { return this.precio; }
    public String getNombre() { return nombre; }
}

class Cliente implements Notificable {
    private String nombre;
    private String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    void notificarCambioEstado(String estadoAnterior, String nuevoEstado, Pedido pedido) {
        System.out.printf("  [NOTIFICACIÓN a %s]: Pedido #%d de '%s' a '%s'.\n",
            this.nombre, pedido.getId(), estadoAnterior, nuevoEstado);
    }
    public String getNombre() { return nombre; }
}

class Pedido implements Pagable {
    private static int nextId = 1000;
    private int id;
    private List<Producto> productos;
    private Cliente cliente;
    private String estado; 

    public Pedido(Cliente cliente) {
        this.id = nextId++;
        this.productos = new ArrayList<>();
        this.cliente = cliente;
        this.estado = "Pendiente";
    }

    public void agregarProducto(Producto p) {
        this.productos.add(p);
    }
    
    @Override
    double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }
    
    public void cambiarEstado(String nuevoEstado) {
        String estadoAnterior = this.estado;
        this.estado = nuevoEstado;
        
        if (!estadoAnterior.equals(nuevoEstado)) {
            System.out.printf("  [LOG Pedido #%d]: Estado cambiado.\n", this.id);
            cliente.notificarCambioEstado(estadoAnterior, nuevoEstado, this);
        }
    }
    public int getId() { return id; }
}

class TarjetaCredito implements PagoConDescuento {
    private String numeroTarjeta;

    public TarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    boolean procesarPago(double monto) { 
        System.out.printf("  -> Pagando $%.2f con Tarjeta. Estado: Aprobado.\n", monto);
        return true;
    }

    @Override
    double aplicarDescuento(double total) { 
        double descuento = total * 0.05;
        System.out.printf("  -> Descuento aplicado (5%%): $%.2f\n", descuento);
        return total - descuento;
    }
}

class PayPal implements Pago {
    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    boolean procesarPago(double monto) {
        System.out.printf("  -> Pagando $%.2f vía PayPal. Estado: Aprobado.\n", monto);
        return true;
    }
}

// -----------------------------------------------
// CLASE PRINCIPAL (MAIN)
// -----------------------------------------------

public class ECommerceApp {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA E-COMMERCE (INTERFACES) ---");
        
        Cliente cliente = new Cliente("Ana Torres", "ana.t@email.com");
        Producto libro = new Producto("Libro de Java", 45.00);
        Producto teclado = new Producto("Teclado Mecánico", 75.00);
        TarjetaCredito tc = new TarjetaCredito("1234");
        
        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(libro);
        pedido.agregarProducto(teclado);
        
        double subtotal = pedido.calcularTotal();
        System.out.printf("Subtotal: $%.2f\n", subtotal);

        // 1. Pago con Descuento (Interfaz PagoConDescuento)
        double totalConDescuento = tc.aplicarDescuento(subtotal);
        tc.procesarPago(totalConDescuento);

        // 2. Notificación (Interfaz Notificable)
        pedido.cambiarEstado("Procesando");
        pedido.cambiarEstado("Enviado");
    }
}