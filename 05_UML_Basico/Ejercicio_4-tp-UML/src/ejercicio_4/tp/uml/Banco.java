/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_4.tp.uml;

/**
 *
 * @author yases
 */
class Banco {
    private String nombre;
    private int cuit;

    public Banco(String nombre, int cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }
    
    public void mostrarInfo(){
        System.out.println("Banco: "+nombre);
        System.out.println("CUIT: "+cuit);
    }
}
