/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_04.tp.intapoo;

public class Principal {

    public static void main(String[] args) {
        //Creacion de objetos 
        Gallina g1 = new Gallina();
        Gallina g2 = new Gallina();

        // Asignar IDs gallinas
        g1.setIdGallina(101);
        g2.setIdGallina(102);

        // Mostrar estado 
        System.out.println("Estado de las gallinas:");
        g1.mostrarEstado();
        g2.mostrarEstado();

        // Simular acciones gallinas
        g1.envejecer();
        g1.ponerHuevo();
        g1.ponerHuevo();

        g2.envejecer();
        g2.envejecer();
        g2.ponerHuevo();

        // Mostrar estado final
        System.out.println("Estado de las gallinas:");
        g1.mostrarEstado();
        g2.mostrarEstado();
        
    }

}


