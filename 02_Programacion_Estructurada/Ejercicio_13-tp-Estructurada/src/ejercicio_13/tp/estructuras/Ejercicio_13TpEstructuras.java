/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_13.tp.estructuras;

public class Ejercicio_13TpEstructuras {
// Función recursiva para imprimir precios
    public static void imprimirPrecios(double[] precios, int indice) {
        if (indice < precios.length) {
            System.out.println("Precio: $" + precios[indice]);
            imprimirPrecios(precios, indice + 1); // llamada recursiva

      }
    }


    
    public static void main(String[] args) {
        // Declaración e inicialización del array
        double[] precios = {199.99, 299.5, 399.0, 199.99, 199.99, 129.99, 399.0};

        // Mostrar precios originales
        System.out.println("Precios originales:");
        imprimirPrecios(precios, 0);

        // Modificar un precio específico (por ejemplo, el último)
        precios[6] = 499.0;

        // Mostrar precios modificados
        System.out.println("\nPrecios modificados:");
        imprimirPrecios(precios, 0);


    }
    
}
