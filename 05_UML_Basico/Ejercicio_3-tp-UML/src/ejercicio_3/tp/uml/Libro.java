/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_3.tp.uml;

class Libro {

    private String titulo;
    private String autor;
    private String isbn;
    private Editorial editorial;

    public Libro(String titulo, String autor, String isbn, Editorial editorial) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        if (editorial != null) {
            System.out.println("Publicado por: " + editorial.getNombre() + " (" + editorial.getPais() + ")");
        }
    }

}
