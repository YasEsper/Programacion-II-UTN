/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_03.tp.intapoo;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Libro l = new Libro();

        // Asignar valores a libro
        l.setTitulo("Una breve historia de casi todo");
        l.setAutor("Bill Bryson");
        l.setAñoPublicacion(2003);

        // Mostramos informacion del libro inicial.
        System.out.println("Información inicial:");
        l.mostrarInfo();

        // Solicitamos nuevo año de publicacion.
        System.out.print("Ingrese un nuevo año de publicación: ");
        int nuevoAño = input.nextInt();

        // Probamos si modifica 
        l.setAñoPublicacion(nuevoAño);

        // Mostrar información final
        System.out.println("Información final:");
        l.mostrarInfo();
    }

}
