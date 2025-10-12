/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_12_tp.estructuras;

public class Ejercicio_12_tpEstructuras {

    public static void main(String[] args) {
        // Declaración e inicialización del array
        double[] precios = {199.99, 299.5, 149.75, 399.99};

        // Mostrar precios originales
        System.out.println("Precios originales:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }

        // Modificación de precios (ejemplo: aplicar descuento del 10%)
        for (int i = 0; i < precios.length; i++) {
            precios[i] = precios[i] * 0.90; // aplica 10% de descuento
        }

        // Mostrar precios modificados
        System.out.println("\nPrecios modificados:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
    }

}
