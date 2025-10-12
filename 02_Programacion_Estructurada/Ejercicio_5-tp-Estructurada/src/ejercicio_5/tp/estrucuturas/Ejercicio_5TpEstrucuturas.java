/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_5.tp.estrucuturas;

//Escribe un programa que solicite números al usuario y sume solo los números pares. 
import java.util.Scanner;

//El ciclo debe continuar hasta que el usuario ingrese el número 0, momento en el que se debe mostrar la suma total de los pares ingresados.
public class Ejercicio_5TpEstrucuturas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int suma = 0;

        //Solicitamos numero al usuario y guardamos en variable numero.
        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = scanner.nextInt();

            // Si es par y distinto de 0, se suma.
            if (numero != 0 && numero % 2 == 0) {
                suma += numero;
            }
            // Condicion para que se repita hasta que el numero ingresado sea 0.   
        } while (numero != 0);

        // Salida
        System.out.println("La suma de los números pares es: " + suma);

    }

}
