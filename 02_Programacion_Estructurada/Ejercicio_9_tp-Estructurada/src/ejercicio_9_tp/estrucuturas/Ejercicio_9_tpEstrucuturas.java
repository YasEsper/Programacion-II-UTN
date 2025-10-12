/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_9_tp.estrucuturas;
//Composición de funciones para calcular costo de envío y total de compra.
//a-Calcula el costo de envío basado en la zona de envío (Nacional o Internacional) y el peso del paquete.
//b-Calcular el costo de producto mas envio.

import java.util.Scanner;



public class Ejercicio_9_tpEstrucuturas {
// Funcion calculo de costo de envio.

    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * 10;
        } else {
            System.out.println("Zona inválida.");
            return -1; // valor de error
        }
    }
// Función calculo de compra.

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextDouble();

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = scanner.next();

        // Cálculo del costo de envío
        double costoEnvio = calcularCostoEnvio(peso, zona);

        // Validación
        if (costoEnvio == -1) {
            System.out.println("No se pudo calcular el total por zona inválida.");
        } else {
            // Cálculo del total
            double total = calcularTotalCompra(precioProducto, costoEnvio);

            // Salida
            System.out.println("El costo de envío es: " + costoEnvio);
            System.out.println("El total a pagar es: " + total);

        }
    }
}
