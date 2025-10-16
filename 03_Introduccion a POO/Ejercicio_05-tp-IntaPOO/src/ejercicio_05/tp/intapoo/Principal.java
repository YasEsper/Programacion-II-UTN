/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_05.tp.intapoo;

public class Principal {

    public static void main(String[] args) {
        NaveEspacial nave1 = new NaveEspacial();

        // Asignamos atributos nombre y combustible inicila
        nave1.setNombre("Armagedon");
        nave1.setCombustible(50);
       
        // Mostrar estado inicial de la nave.
        System.out.println("Estado inicial:");
        nave1.mostrarEstado();

        // Avanzar sin recargar 
        nave1.avanzar(30); 

        // Recargar combustible 50 inicial + 40 de recarga = 90
        nave1.recargarCombustible(40); 

        // Avanzar correctamente
        nave1.avanzar(20); // consume 40

        // Mostrar estado final de la nave.
        System.out.println("Estado final:");
        nave1.mostrarEstado();
    }

}

