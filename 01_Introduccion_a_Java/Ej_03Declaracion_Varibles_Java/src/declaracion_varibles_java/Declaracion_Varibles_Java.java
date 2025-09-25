/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package declaracion_varibles_java;

/**
 *
 * @author yases
 */
public class Declaracion_Varibles_Java {

    
//    3.	Crea un programa que declare las siguientes variables con valores asignados:
//a.	String nombre
//b.	int edad
//c.	double altura
//d.	boolean estudiante
//Imprime los valores en pantalla usando System.out.println().

     
    public static void main(String[] args) {
        //Declaracion y asignacion de variable 
        String nombre = "Amira";    
        int edad ; // Declaracion 
        edad = 34 ; // Asignacion 
        double altura = 1.68;       
        boolean estudiante = true;  

       // Imprime en pantalla 
        System.out.println(nombre); // Solo el nombre asignado a la varible
        System.out.println("Edad: " + edad); //Imprime en pantalla Edad concatenado con el operasdor "+"
        System.out.println("Altura: " + altura);
        System.out.println("Estudiante: " + estudiante);

    }
    
}
