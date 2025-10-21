/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_3.tp.uml;

class Libreria {

    private String nombre;
    private String direccion;
    private Libro libro;

    public Libreria(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Libro getLibro() {
        return libro;
    }

    public void mostrarInfo() {
        System.out.println("Librería: " + nombre);
        System.out.println("Dirección: " + direccion);
        if (libro != null) {
            System.out.println("Libro en stock: " + libro.getTitulo() + " de " + libro.getAutor());
        }
    }

}
