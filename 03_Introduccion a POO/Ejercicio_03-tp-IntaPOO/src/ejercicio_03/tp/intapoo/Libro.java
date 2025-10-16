/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_03.tp.intapoo;

public class Libro {

    private String titulo;
    private String autor;
    private int añoPublicacion;

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    // Setters
    public void setTitulo(String t) {
        titulo = t;
    }

    public void setAutor(String a) {
        autor = a;
    }

    public void setAñoPublicacion(int año) {
        if (año >= 1450 && año <= 2025) {
            añoPublicacion = año;
        } else {
            System.out.println("⚠️ Año inválido. Debe estar entre 1450 y 2025.");
        }
    }

    // Metodo para mostrar informacion 
    public void mostrarInfo() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Año de publicación: " + getAñoPublicacion());

    }

}
