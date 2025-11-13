/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Profesor {
    private String id; // Identificador único
    private String nombre;
    private String especialidad;
    private List<Curso> cursos; // 1 -> N

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    /**
     * Agrega el curso a su lista si no está y sincroniza el lado del curso.
     * @param c El curso a agregar.
     * @param sincronizarCurso Indica si debe llamar a c.setProfesor (true para llamadas externas, false para recursión).
     */
    public void agregarCurso(Curso c, boolean sincronizarCurso) {
        if (c != null && !cursos.contains(c)) {
            cursos.add(c);
            if (sincronizarCurso) {
                // Sincronizar: Asegurar que el curso apunte a este profesor
                c.setProfesor(this);
            }
        }
    }

    /**
     * Sobrecarga para llamadas externas (asume que debe sincronizar).
     */
    public void agregarCurso(Curso c) {
        agregarCurso(c, true);
    }

    /**
     * Quita el curso de la lista y sincroniza el lado del curso (dejar profesor en null).
     * @param c El curso a eliminar.
     * @param sincronizarCurso Indica si debe llamar a c.setProfesor (true para llamadas externas, false para recursión).
     */
    public void eliminarCurso(Curso c, boolean sincronizarCurso) {
        if (c != null && cursos.remove(c)) {
            if (sincronizarCurso) {
                // Sincronizar: Romper el vínculo en el lado del curso
                c.setProfesor(null);
            }
        }
    }

    /**
     * Sobrecarga para llamadas externas (asume que debe sincronizar).
     */
    public void eliminarCurso(Curso c) {
        eliminarCurso(c, true);
    }

    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("  - No dicta cursos actualmente.");
            return;
        }
        cursos.forEach(c -> System.out.printf("  - %s: %s\n", c.getCodigo(), c.getNombre()));
    }

    public void mostrarInfo() {
        System.out.printf("Profesor [%s]: %s (%s) - Dicta %d cursos.\n", 
            id, nombre, especialidad, cursos.size());
    }

    // Getters
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public List<Curso> getCursos() { return cursos; }
    
    // Métodos para evitar duplicados en listas de la Universidad
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profesor profesor = (Profesor) o;
        return Objects.equals(id, profesor.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}