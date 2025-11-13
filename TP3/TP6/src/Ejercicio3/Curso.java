/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import java.util.Objects;

public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor; // N -> 1

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    /**
     * Asigna/cambia el profesor sincronizando ambos lados.
     * Si tenía profesor previo, se quita de su lista (invariante de asociación).
     */
    public void setProfesor(Profesor nuevoProfesor) {
        // 1. Quitar la referencia del profesor actual (si existe)
        if (this.profesor != null && this.profesor != nuevoProfesor) {
            this.profesor.eliminarCurso(this, false); // 'false' para evitar recursión
        }

        // 2. Asignar el nuevo profesor
        this.profesor = nuevoProfesor;

        // 3. Sincronizar el lado del nuevo profesor (si existe)
        if (nuevoProfesor != null) {
            nuevoProfesor.agregarCurso(this, false); // 'false' para evitar recursión
        }
    }

    public void mostrarInfo() {
        String nombreProfesor = (profesor != null) ? profesor.getNombre() : "Sin asignar";
        System.out.printf("[%s] %s (Profesor: %s)\n", codigo, nombre, nombreProfesor);
    }

    // Getters y Setters
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }

    // Métodos para evitar duplicados en listas de la Universidad
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(codigo, curso.codigo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}