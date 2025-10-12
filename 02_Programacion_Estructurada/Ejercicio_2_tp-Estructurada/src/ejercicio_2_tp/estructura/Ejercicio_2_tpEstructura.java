/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_tp.estructura;

// Escribe un programa en Java que pida al usuario tres números enteros y determine cuál es el mayor.
import java.util.Scanner;

public class Ejercicio_2_tpEstructura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario ingrese tres numeros.
        System.out.print("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingrese el tercer numero: ");
        int num3 = scanner.nextInt();

        // Determinacion del mayopr numero.
        int mayor;

        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
        } else if (num2 >= num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }

        //Muestramos el resultado en pantalla.
        System.out.println("El mayor es:" + mayor);

    }

}
