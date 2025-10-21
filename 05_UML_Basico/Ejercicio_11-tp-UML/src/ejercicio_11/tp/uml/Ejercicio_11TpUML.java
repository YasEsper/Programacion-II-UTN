
package ejercicio_11.tp.uml;


public class Ejercicio_11TpUML {

    
    public static void main(String[] args) {
        Artista artista = new Artista("Avril Lavigne", "Pop Punk");
        Cancion cancion = new Cancion("I’m With You", artista);
        Reproductor reproductor = new Reproductor();

        artista.mostrarInfo();
        cancion.mostrarInfo();
        reproductor.reproducir(cancion); 
    }
    
}
