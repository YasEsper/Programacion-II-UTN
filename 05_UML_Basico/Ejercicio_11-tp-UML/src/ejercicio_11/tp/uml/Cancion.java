/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_11.tp.uml;

class Cancion {

    private String titulo;
    private Artista artista;

    public Cancion(String titulo, Artista artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    public void mostrarInfo() {
        System.out.println("Canción: " + titulo);
        if (artista != null) {
            System.out.println("Interpretada por: " + artista.getNombre() + " (" + artista.getGenero() + ")");
        }
    }
}

    

