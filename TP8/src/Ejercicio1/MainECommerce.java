/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

class MainECommerce {
    public static void main(String[] args) {
        // Inicialización de entidades
        Cliente cliente = new Cliente("Ana Torres", "ana.t@email.com");
        
        Producto libro = new Producto("Libro de Java", 45.00);
        Producto teclado = new Producto("Teclado Mecánico", 75.00);
        
        TarjetaCredito tc = new TarjetaCredito("4567-XXXX-XXXX-1234");
        PayPal paypal = new PayPal("ana.paypal@email.com");

        // 1. Creación de Pedido y Pagable
        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(libro);
        pedido.agregarProducto(teclado);
        
        double subtotal = pedido.calcularTotal();
        System.out.printf("Subtotal del Pedido #%d: $%.2f\n", pedido.getId(), subtotal);

        // 2. Proceso de Pago con Descuento (TarjetaCredito)
        System.out.println("\n--- PROCESO DE PAGO CON TARJETA (PagoConDescuento) ---");
        double totalConDescuento = tc.aplicarDescuento(subtotal);
        tc.procesarPago(totalConDescuento);

        // 3. Proceso de Pago sin Descuento (PayPal)
        System.out.println("\n--- PROCESO DE PAGO CON PAYPAL (Pago) ---");
        paypal.procesarPago(subtotal);

        // 4. Notificación de Cambio de Estado
        System.out.println("\n--- CAMBIO DE ESTADO Y NOTIFICACIÓN ---");
        pedido.cambiarEstado("Procesando");
        pedido.cambiarEstado("Enviado");
    }
}
