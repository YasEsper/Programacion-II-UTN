/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso_practico.tp.poo;


public class Principal {


    public static void main(String[] args) {
        
        // Instanciacion con constructor completo.
        Empleado e1 = new Empleado(1, "Sebastian Santolliani", "Desarollador web", 1500.0);

        // Instanciacion con constructor parcial.
        Empleado e2 = new Empleado("Luis Gómez", "Soporte");

        // Aplicación de métodos sobrecargados
        e1.actualizarSalario(10); // aumento del 10%
        e2.actualizarSalario(500); // aumento fijo de $500

        // Mostrar información
        System.out.println(e1);
        System.out.println(e2);

        // Mostrar total de empleados
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());


        
    }
    
}
