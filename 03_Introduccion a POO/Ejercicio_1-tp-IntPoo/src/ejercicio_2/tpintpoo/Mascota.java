/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejercicio_2.tpintpoo;

/**
 *
 * @author yases
 */
public class Mascota {

    String nombre;
    String especie;
    int edad;

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + " - Especie: " + especie + " - Edad: " + edad + " años");
    }

    public void cumplirAnios() {
        edad += 1;
    }

}
