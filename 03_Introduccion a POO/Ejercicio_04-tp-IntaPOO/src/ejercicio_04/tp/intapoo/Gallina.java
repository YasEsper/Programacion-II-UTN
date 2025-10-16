/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_04.tp.intapoo;

public class Gallina {
 // Atributos gallinas
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    // Getters
    public int getIdGallina() {
        return idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    // Setters
    public void setIdGallina(int id) {
        idGallina = id;
    }

    public void setEdad(int e) {
        edad = e;
    }

    public void setHuevosPuestos(int h) {
        huevosPuestos = h;
    }

    // Método para poner huevo
    public void ponerHuevo() {
        huevosPuestos++;
    }

    // Método para envejecer
    public void envejecer() {
        edad++;
    }

    // Mostrar estado actual
    public void mostrarEstado() {
        System.out.println("ID: " + getIdGallina());
        System.out.println("Edad: " + getEdad() + " años");
        System.out.println("Huevos puestos: " + getHuevosPuestos());
        System.out.println("---------------------------");
    }


   

}
