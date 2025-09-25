/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solicitar_numeros;

import java.util.Scanner;

//Escribe un programa que solicite dos números enteros y realice las siguientes operaciones:
//a.	Suma
//b.	Resta
//c.	Multiplicación
//d.	División 
//Muestra los resultados en la consola.


public class Solicitar_Numeros {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//Guarda dato ingresado por el ususario

System.out.print("Ingrese el primer número: "); // Mensaje en pantalla pedido de ingreso dato
int num1 = input.nextInt();// Perimte extraer dato entero 

System.out.print("Ingrese el segundo número: ");// Mensaje en pantalla pedido de ingreso dato
int num2 = input.nextInt();// Permite extraer otro dato entero 

// Se impime en pantalla el resultado de las operaciones 
System.out.println("Suma: " + (num1 + num2)); 
System.out.println("Resta: " + (num1 - num2)); 
System.out.println("Multiplicación: " + (num1 * num2));
System.out.println("División: " + (num1 / num2));
    }
    
}
