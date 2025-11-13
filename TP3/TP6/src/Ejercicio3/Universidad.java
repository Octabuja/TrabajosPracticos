/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void agregarProfesor(Profesor p) {
        if (!profesores.contains(p)) {
            profesores.add(p);
        } else {
            System.out.println("ADVERTENCIA: Profesor con ID " + p.getId() + " ya existe.");
        }
    }

    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
        } else {
            System.out.println("ADVERTENCIA: Curso con código " + c.+ " ya existe.");
        }
    }

    public Profesor buscarProfesorPorId(String id) {
        Optional<Profesor> result = profesores.stream()
            .filter(p -> p.getId().equals(id))
            .findFirst();
        return result.orElse(null);
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        Optional<Curso> result = cursos.stream()
            .filter(c -> c.getCodigo().equals(codigo))
            .findFirst();
        return result.orElse(null);
    }

    /**
     * Coordina la asignación usando la lógica de sincronización de Curso.setProfesor().
     */
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso == null) {
            System.out.println("ERROR: Curso con código " + codigoCurso + " no encontrado.");
            return;
        }
        if (profesor == null) {
            System.out.println("ERROR: Profesor con ID " + idProfesor + " no encontrado.");
            return;
        }

        // Usamos el método setProfesor del curso, que maneja la sincronización.
        curso.setProfesor(profesor);
        System.out.printf("ASIGNACIÓN: Curso %s asignado a Profesor %s.\n", curso.getNombre(), profesor.getNombre());
    }

    public void listarProfesores() {
        System.out.println("\n--- LISTA DE PROFESORES ---");
        profesores.forEach(Profesor::mostrarInfo);
    }

    public void listarCursos() {
        System.out.println("\n--- LISTA DE CURSOS ---");
        cursos.forEach(Curso::mostrarInfo);
    }

    /**
     * Elimina un curso. Debe romper la relación con su profesor.
     */
    public void eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            // Romper la relación llamando a setProfesor(null)
            curso.setProfesor(null); 
            
            // Remover el curso de la lista general
            cursos.remove(curso);
            System.out.println("ELIMINACIÓN: Curso " + codigo + " eliminado y desvinculado.");
        } else {
            System.out.println("ERROR: Curso con código " + codigo + " no encontrado para eliminar.");
        }
    }

    /**
     * Elimina un profesor. Antes de remover, debe desvincular todos los cursos que dictaba.
     */
    public void eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null) {
            // Desvincular cursos: crear una copia de la lista para evitar ConcurrentModificationException
            List<Curso> cursosADesvincular = new ArrayList<>(profesor.getCursos());
            
            for (Curso curso : cursosADesvincular) {
                // Al llamar a setProfesor(null) del curso, el profesor se quita automáticamente de su lista interna.
                curso.setProfesor(null); 
            }
            
            // Remover el profesor de la lista general
            profesores.remove(profesor);
            System.out.println("ELIMINACIÓN: Profesor " + profesor.getNombre() + " eliminado y sus cursos desvinculados.");
        } else {
            System.out.println("ERROR: Profesor con ID " + id + " no encontrado para eliminar.");
        }
    }

    public void mostrarReporteCursosPorProfesor() {
        System.out.println("\n--- REPORTE: Cantidad de Cursos por Profesor ---");
        profesores.forEach(p -> System.out.printf("%s: %d cursos\n", p.getNombre(), p.getCursos().size()));
    }
}