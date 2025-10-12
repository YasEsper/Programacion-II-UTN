/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_11_tp.estructuras;

//Declara una variable global Ejemplo de entrada/salida: = 0.10. 
import java.util.Scanner;

//Luego, crea un método calcularDescuentoEspecial(double precio) que use la variable global para calcular el descuento especial del 10%.
//Dentro del método, declara una variable local descuento. 
//Aplicado, almacena el valor del descuento y muestra el precio final con descuento.
public class Ejercicio_11_tpEstructuras {
    // Variable global
    static double descuentoGlobal = 0.10;

    // Método  calculo y muestra el descuento
    public static void calcularDescuentoEspecial(double precio) {

// variable local
        double descuentoAplicado = precio * descuentoGlobal;
        double precioFinal = precio - descuentoAplicado;

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada del usuario
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        // Llamada al método
        calcularDescuentoEspecial(precio);

    }

}
