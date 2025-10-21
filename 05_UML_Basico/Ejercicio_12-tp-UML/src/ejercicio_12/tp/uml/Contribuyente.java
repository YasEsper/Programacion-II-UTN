/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_12.tp.uml;

class Contribuyente {

    private String nombre;
    private String cui;

    public Contribuyente(String nombre, String cui) {
        this.nombre = nombre;
        this.cui = cui;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCui() {
        return cui;
    }

    public void mostrarInfo() {
        System.out.println("Contribuyente: " + nombre);
        System.out.println("CUI: " + cui);
    }
}
