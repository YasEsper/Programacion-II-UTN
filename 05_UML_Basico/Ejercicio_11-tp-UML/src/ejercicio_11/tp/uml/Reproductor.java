/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_11.tp.uml;

class Reproductor {

    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo: " + cancion.getTitulo());
        if (cancion.getArtista() != null) {
            System.out.println("Artista: " + cancion.getArtista().getNombre());
        }
    }

}
