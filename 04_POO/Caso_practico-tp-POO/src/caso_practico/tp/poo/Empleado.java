/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso_practico.tp.poo;

public class Empleado {
    // Atributos privados del obj.
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    // Atributo estatico para contar empleados.
    private static int totalEmpleados = 0;

    // Constructor completo.
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    // Constructor parcial con id automatico y salario por defecto.
    public Empleado(String nombre, String puesto) {
        this(++totalEmpleados, nombre, puesto, 1000.0); // salario base
    }

    // Método sobrecargado: aumento por porcentaje.
    public void actualizarSalario(double porcentaje) {
        if (porcentaje > 0) {
            this.salario += this.salario * (porcentaje / 100);
        }
    }

    // Método sobrecargado: aumento fijo.
    public void actualizarSalario(int aumentoFijo) {
        if (aumentoFijo > 0) {
            this.salario += aumentoFijo;
        }
    }

    // Método toString para mostrar datos legibles.
    @Override
    public String toString() {
        return "Empleado [ID=" + id + ", Nombre=" + nombre + ", Puesto=" + puesto + ", Salario=$" + salario + "]";
    }

    // Método estático para mostrar total de empleados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        }
    }


    
}
