/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_13.tp.uml;

public class Principal {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Amira Yasmin Esper", "amira.esper85@gmail.com");
        GeneradorQR generador = new GeneradorQR();

        usuario.mostrarInfo();
        generador.generar("QR-2025-ARG-001", usuario);
    }

}
