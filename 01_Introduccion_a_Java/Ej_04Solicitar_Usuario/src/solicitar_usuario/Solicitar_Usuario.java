/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solicitar_usuario;

//Escribe un programa que solicite al usuario ingresar su nombre y edad, y luego los muestre en pantalla. Usa Scanner

import java.util.Scanner;

public class Solicitar_Usuario {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//Guarda dato ingresado por usurio

        System.out.print("Ingrese su nombre: ");//Solicitamos por pantalla nombre
        String nombre = input.nextLine();//Permite escanear lo ingresado por el usuiario en este caso una cadena de caracteres (nextLine)

        System.out.print("Ingrese su edad: ");//Solicitamos por pantalla dato edad
        int edad = input.nextInt();//Permite escanear lo ingresado por el usuiario en este caso un entero (nextInt)

        // Imprime en pantalla cadena de caracteres concatenada a los datos
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
    
