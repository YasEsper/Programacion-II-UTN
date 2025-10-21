/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_3.tp.uml;

public class Principal {

    public static void main(String[] args) {
        Editorial editorial = new Editorial("Salamandra", "Argentina");
        Libro libro = new Libro("HARRY POTTER CALIZ DE FUEGO", "ROWLING J.K", "9788418174599", editorial);
        Libreria libreria = new Libreria("El Mundo del Libro", "Obispo Trejo 4");

        libreria.setLibro(libro);

        editorial.mostrarInfo();
        libro.mostrarInfo();
        libreria.mostrarInfo();

    }

}
