/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;

public class Main {

    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // Crear y agregar productos
        Producto p1 = new Producto("P001", "Arroz", 850, 20, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Televisor", 2500, 5, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Remera", 1200, 15, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Licuadora", 1800, 10, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Fideos", 900, 30, CategoriaProducto.ALIMENTOS);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        // Listar productos
        System.out.println("LISTA DE PRODUCTOS:");
        inventario.listarProductos();

        // Buscar producto por ID
        System.out.println("BUSCAR PRODUCTO P003:");
        Producto buscado = inventario.buscarProductoPorId("P003");
        if (buscado != null) buscado.mostrarInfo();

        // Filtrar por categoria
        System.out.println("PRODUCTOS DE ALIMENTOS:");
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);

        // Eliminar un producto
        inventario.eliminarProducto("P002");
        System.out.println("PRODUCTOS RESTANTES:");
        inventario.listarProductos();

        // Acrualizar stock
        inventario.actualizarStock("P003", 25);

        // Mostrar total de stock
        System.out.println("TOTAL DE STOCK DISPONIBLE: " + inventario.obtenerTotalStock());

        // Producto con mayor stock
        System.out.println("PRODUCTO CON MAYOR STOCK:");
        inventario.obtenerProductoConMayorStock().mostrarInfo();

        // Filtrar por rango de precios
        System.out.println("PRODUCTOS ENTRE $1000 Y $3000:");
        inventario.filtrarProductosPorPrecio(1000, 3000);

        // Mostrar categorías
        System.out.println("CATEGORÍAS DISPONIBLES:");
        inventario.mostrarCategoriasDisponibles();
    }
}
    

