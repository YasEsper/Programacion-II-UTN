/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_14.tp.uml;

public class Principal {

    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Corto BAO ", 8);
        EditorVideo editor = new EditorVideo();

        proyecto.mostrarInfo();
        editor.exportar("MP4", proyecto);
    }

}
