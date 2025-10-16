/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_01.tp.intapoo;

public class Principal {

    public static void main(String[] args) {
        Estudiante e = new Estudiante();

        //Asiganamos valores a los atributos
        e.nombre = "Amira Yasmin Elizabeth";
        e.apellido = "Esper";
        e.calificacion = 7.5;
        e.curso = "Programacion II";

        // Mostrar informacion.
        e.mostrarInformacion();

        // Mostarar subir y bajar nota
        e.subirCalificacion(1.0);
        System.out.println("Calificacion subida:");
        e.mostrarCalificacion();
        e.bajarCalificacion(0.5);
        System.out.println("Calificaciones bajada:");
        e.mostrarCalificacion();
    }

}
