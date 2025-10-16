/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_02.tp.intapoo;

public class Mascota {

    String nombre;
    String especie;
    int edad;

    // Metodo para mostrar informacion general de la mascota
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }
    
    //Metodo para mostrar solo edad de la mascota
    public void mostrarEdad() {
        System.out.println("Edad: " + edad + " años");
    }
    
    // Metodo mascota Cumple años
    public void cumplirAnios() {
        edad++;
    }

}
