/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_1_tp.estrucutras;
//Escribe un programa en Java que solicite al usuario un año y determine si es bisiesto. 
//Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea divisible por 400.

import java.util.Scanner;

public class Ejercicio_1_tpEstrucutras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario ingrese in año.
        System.out.print("Ingrese un año: ");
        int año = scanner.nextInt();

        //Verificamos si es año es bisiesto. 
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println("El año " + año + " Es bisiesto.");
        } else {
            System.out.println("El año " + año + " no es bisiesto.");
        }

    }

}
