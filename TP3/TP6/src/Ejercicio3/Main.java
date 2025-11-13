/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        // 1. Inicialización
        Universidad uni = new Universidad("Universidad Tech");

        // 1. Crear al menos 3 profesores y 5 cursos.
        Profesor p1 = new Profesor("P101", "Dr. López", "Ingeniería de Software");
        Profesor p2 = new Profesor("P102", "Ing. García", "Matemática Aplicada");
        Profesor p3 = new Profesor("P103", "Lic. Romero", "Diseño UX/UI");
        Profesor p4_extra = new Profesor("P104", "Dra. Mora", "Base de Datos");

        Curso c1 = new Curso("C001", "Programación Orientada a Objetos");
        Curso c2 = new Curso("C002", "Cálculo I");
        Curso c3 = new Curso("C003", "Arquitectura de Software");
        Curso c4 = new Curso("C004", "Introducción al Diseño");
        Curso c5 = new Curso("C005", "Base de Datos Avanzadas");

        // 2. Agregar profesores y cursos a la universidad.
        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);
        uni.agregarProfesor(p4_extra);
        
        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // 3. Asignar profesores a cursos.
        System.out.println("\n=============================================");
        System.out.println("3. Asignaciones Iniciales");
        System.out.println("=============================================");
        uni.asignarProfesorACurso("C001", "P101"); // POO -> López
        uni.asignarProfesorACurso("C002", "P102"); // Cálculo -> García
        uni.asignarProfesorACurso("C003", "P101"); // Arquitectura -> López
        uni.asignarProfesorACurso("C004", "P103"); // Diseño -> Romero
        uni.asignarProfesorACurso("C005", "P104"); // DB -> Mora

        // 4. Listar cursos con su profesor y profesores con sus cursos.
        System.out.println("\n=============================================");
        System.out.println("4. Verificación Inicial de Relaciones");
        System.out.println("=============================================");
        uni.listarCursos();
        uni.listarProfesores();

        // 5. Cambiar el profesor de un curso y verificar sincronización.
        System.out.println("\n=============================================");
        System.out.println("5. Cambio de Profesor (Sincronización)");
        System.out.println("=============================================");
        System.out.println(">>> ANTES: POO es dictado por López (P101) <<<");
        System.out.println("Cursos de López (P101) antes del cambio:");
        p1.listarCursos();
        
        // Asignar C001 (POO) de P101 (López) a P103 (Romero). setProfesor() rompe el vínculo con López.
        uni.asignarProfesorACurso("C001", "P103");
        
        System.out.println("\n>>> DESPUÉS: POO es dictado por Romero (P103) <<<");
        System.out.println("Curso C001:");
        c1.mostrarInfo();
        System.out.println("\nCursos de López (P101) después del cambio:");
        p1.listarCursos(); // Debe haber perdido C001
        System.out.println("Cursos de Romero (P103) después del cambio:");
        p3.listarCursos(); // Debe haber ganado C001

        // 6. Remover un curso y confirmar que ya no aparece en la lista del profesor.
        System.out.println("\n=============================================");
        System.out.println("6. Remoción de Curso (C004) y Desvinculación");
        System.out.println("=============================================");
        System.out.println("Cursos de Romero (P103) antes de eliminar C004:");
        p3.listarCursos(); // C004 y C001

        uni.eliminarCurso("C004"); // C004 estaba con Romero (P103)
        
        System.out.println("\nCursos de Romero (P103) después de eliminar C004:");
        p3.listarCursos(); // Solo debe quedar C001

        // 7. Remover un profesor y dejar profesor = null en los cursos.
        System.out.println("\n=============================================");
        System.out.println("7. Remoción de Profesor (P104 - Mora)");
        System.out.println("=============================================");
        System.out.println("Curso C005 antes de eliminar P104:");
        c5.mostrarInfo(); // Debe mostrar a Mora
        
        uni.eliminarProfesor("P104"); // Eliminar a Mora (P104) que dictaba C005
        
        System.out.println("\nCurso C005 después de eliminar P104:");
        c5.mostrarInfo(); // Debe mostrar "Sin asignar"
        
        System.out.println("\nVerificación final de Profesores (P104 debe haber desaparecido):");
        uni.listarProfesores();

        // 8. Mostrar un reporte: cantidad de cursos por profesor.
        System.out.println("\n=============================================");
        System.out.println("8. Reporte Final de Cursos por Profesor");
        System.out.println("=============================================");
        uni.mostrarReporteCursosPorProfesor();
    }
}