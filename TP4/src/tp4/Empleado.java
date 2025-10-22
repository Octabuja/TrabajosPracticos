/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;


public class Empleado {
    
     // Atributos privados (encapsulamiento)
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    //️ Atributo estático: contador de empleados
    private static int totalEmpleados = 0;

    //️ Constructor que recibe todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++; // Incrementa el contador global
    }

    //️ Constructor sobrecargado (solo nombre y puesto)
    public Empleado(String nombre, String puesto) {
        totalEmpleados++;
        this.id = totalEmpleados; // Asigna ID automático
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 50000; // Salario por defecto
    }

    // Métodos sobrecargados para actualizar el salario

    // Aumentar salario por porcentaje
    public void actualizarSalario(double porcentaje) {
        if (porcentaje > 0) {
            this.salario += this.salario * (porcentaje / 100);
        }
    }

    // Aumentar salario por cantidad fija
    public void actualizarSalario(int cantidadFija) {
        if (cantidadFija > 0) {
            this.salario += cantidadFija;
        }
    }

    //  Método toString para mostrar datos legibles
    @Override
    public String toString() {
        return "Empleado ID: " + id +
               "\nNombre: " + nombre +
               "\nPuesto: " + puesto +
               "\nSalario: $" + salario + "\n";
    }

    // ️ Método estático para mostrar total de empleados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    //  Getters y Setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        }
    }
}
