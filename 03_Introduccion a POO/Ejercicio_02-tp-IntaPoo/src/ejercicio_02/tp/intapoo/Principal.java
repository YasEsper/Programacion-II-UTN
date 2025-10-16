/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_02.tp.intapoo;

public class Principal {

    public static void main(String[] args) {
        Mascota m = new Mascota();
        m.nombre = "Yang";
        m.especie = "Gato";
        m.edad = 5;

        System.out.println("Información inicial:");
        m.mostrarInfo();

        m.cumplirAnios();

        System.out.println("Edad cumpliendo años de la mascota:");
        m.mostrarEdad();

    }

}
