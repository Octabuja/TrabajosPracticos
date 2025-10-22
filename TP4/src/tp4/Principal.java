/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4;


public class Principal {

    public static void main(String[] args) {
        
        //Crear empleados usando ambos constructores
        Empleado e1 = new Empleado(1, "Juan Pérez", "Gerente", 120000);
        Empleado e2 = new Empleado("María López", "Analista");

        //  Probar métodos sobrecargados actualizarSalario
        e1.actualizarSalario(10); // +10%
        e2.actualizarSalario(5000); // +5000 fijos

        //  Mostrar empleados
        System.out.println(e1);
        System.out.println(e2);

        //  Mostrar total de empleados creados
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }
    }
    

