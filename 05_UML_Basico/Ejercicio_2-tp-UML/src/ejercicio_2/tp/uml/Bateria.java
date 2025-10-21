/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_2.tp.uml;

class Bateria {

    private String modelo;
    private int porcentaje;

    public Bateria(String modelo, int capacidad) {
        this.modelo = modelo;
        this.porcentaje = capacidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return porcentaje;
    }

    public void setCapacidad(int capacidad) {
        this.porcentaje = capacidad;
    }

    public void mostrarInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Capacidad: " + porcentaje + "%");

    }

}
