/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_01.tp.intapoo;

public class Estudiante {

    //Atributos del obj estudiante.
    String nombre;
    String apellido;
    String curso;
    double calificacion;

    // Mostramos en pantalla nombre y apellido. 
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + " - Apellido: " + apellido);
        System.out.println("Curso: " + curso);
    }

    public void mostrarCalificacion() {
        System.out.println("Calificacion:" + calificacion);
    }

    //Metodo para Subir calificacion
    public void subirCalificacion(double puntos) {
        calificacion += puntos;
    }
    //Metrodo para Bajar Calificacion

    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
    }

}
