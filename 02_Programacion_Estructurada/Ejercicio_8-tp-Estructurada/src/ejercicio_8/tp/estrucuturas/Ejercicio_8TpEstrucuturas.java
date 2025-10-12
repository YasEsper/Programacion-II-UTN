/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_8.tp.estrucuturas;

import java.util.Scanner;

public class Ejercicio_8TpEstrucuturas {

    //Funcines calcular precio y declaracion de variables 
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double impuestoAplicado = precioBase * (impuesto / 100);
        double descuentoAplicado = precioBase * (descuento / 100);
        return precioBase + impuestoAplicado - descuentoAplicado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario ingrese precio y porcentaje 
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = scanner.nextDouble();

        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = scanner.nextDouble();

        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = scanner.nextDouble();

        // Llamada a la función.
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);

        // Salida
        System.out.println("El precio final del producto es: " + precioFinal);

    }

}
