/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_7.tp.estructura;

import java.util.Scanner;

public class Ejercicio_7TpEstructura {
//Escribe un programa que solicite al usuario una nota entre 0 y 10. 
//Si el usuario ingresa un número fuera de este rango, debe seguir pidiéndole la nota hasta que ingrese un valor válido.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nota;

        // Bucle de validación
        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = scanner.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }

        } while (nota < 0 || nota > 10);

        // Confirmación
        System.out.println("Nota guardada correctamente.");
    }

}
