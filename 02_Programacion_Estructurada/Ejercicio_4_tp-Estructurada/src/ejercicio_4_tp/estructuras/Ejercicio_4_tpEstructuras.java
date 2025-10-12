/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_4_tp.estructuras;

// Escribe un programa que solicite al usuario el precio de un producto y su categoría (A, B o C).
import java.util.Scanner;

// Y aplique descuento por categoria cat a: 10% cat b: 15% desc y cat c 20% desc.
// El programa debe mostar el precio original del producto 
public class Ejercicio_4_tpEstructuras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario ingrece precio y categoria del producto. 
        System.out.print("Por favor, ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        String categoria = scanner.next();

        double descuento = 0;

        // Determinamos a que categoria pertenece el producto.
        if (categoria.equalsIgnoreCase("A")) {
            descuento = 10;
        } else if (categoria.equalsIgnoreCase("B")) {
            descuento = 15;
        } else if (categoria.equalsIgnoreCase("C")) {
            descuento = 20;
        } else {
            System.out.println("Categoría inválida.");
            scanner.close();
            return;
        }

        // Cálculo del precio final
        double montoDescuento = precio * descuento / 100;
        double precioFinal = precio - montoDescuento;

        // Salida
        System.out.println("Descuento aplicado: " + descuento + "%");
        System.out.println("Precio final: " + precioFinal);

    }

}
