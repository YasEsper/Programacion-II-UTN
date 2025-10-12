/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_3_tp.estructuras;

//Escribe un programa en Java que solicite al usuario su edad y clasifique su etapa de vida.
import java.util.Scanner;

// Menor 12 "niño"- Entre 12 y 17 años "Adolescente"- Entre 18 y 59 años "Adulto" - 60 años o mass "Adulto mayor"
public class Ejercicio_3_tpEstructuras {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario ingrese su edad.
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        // Determinacion de la clasificacion segun el rango de edad.
        if (edad < 12) {
            System.out.println("Eres un Niño.");
        } else if (edad >= 12 && edad <= 17) {
            System.out.println("Eres un Adolescente.");
        } else if (edad >= 18 && edad <= 59) {
            System.out.println("Eres un Adulto.");
        } else {
            System.out.println("Eres un Adulto mayor.");
        }

    }

}
