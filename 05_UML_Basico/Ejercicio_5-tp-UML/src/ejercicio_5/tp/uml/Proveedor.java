/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_5.tp.uml;

class Proveedor {

    private String nombre;
    private String cuit;

    public Proveedor(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCuit() {
        return cuit;
    }

    public void mostrarInfo() {
        System.out.println("Proveedor: " + nombre);
        System.out.println("CUIT: " + cuit);
    }
}
