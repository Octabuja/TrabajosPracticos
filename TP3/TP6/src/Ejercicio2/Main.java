/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

public class Main {
    
    public static void main(String[] args) {
        // 1. Crear biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // 2. Crear autores
        Autor autor1 = new Autor("A1", "Gabriel García Márquez", "Colombiana");
        Autor autor2 = new Autor("A2", "J.K. Rowling", "Británica");
        Autor autor3 = new Autor("A3", "Ernesto Sábato", "Argentina");

        // 3. Agregar libros
        biblioteca.agregarLibro("ISBN001", "Cien años de soledad", 1967, autor1);
        biblioteca.agregarLibro("ISBN002", "Harry Potter y la piedra filosofal", 1997, autor2);
        biblioteca.agregarLibro("ISBN003", "Sobre héroes y tumbas", 1961, autor3);
        biblioteca.agregarLibro("ISBN004", "El amor en los tiempos del cólera", 1985, autor1);
        biblioteca.agregarLibro("ISBN005", "Harry Potter y la cámara secreta", 1998, autor2);

        // 4. Listar todos los libros
        biblioteca.listarLibros();

        // 5. Buscar libro por ISBN
        System.out.println("\n🔍 Buscando libro ISBN002:");
        Libro encontrado = biblioteca.buscarLibroPorIsbn("ISBN002");
        if (encontrado != null) encontrado.mostrarInfo();

        // 6. Filtrar libros por año
        System.out.println("\n📆 Filtrando libros del año 1997:");
        biblioteca.filtrarLibrosPorAnio(1997);

        // 7. Eliminar libro
        System.out.println("\n🗑 Eliminando libro ISBN003...");
        biblioteca.eliminarLibro("ISBN003");
        biblioteca.listarLibros();

        // 8. Mostrar cantidad total
        System.out.println("\n📦 Cantidad total de libros: " + biblioteca.obtenerCantidadLibros());

        // 9. Mostrar autores disponibles
        biblioteca.mostrarAutoresDisponibles();
    }
}
