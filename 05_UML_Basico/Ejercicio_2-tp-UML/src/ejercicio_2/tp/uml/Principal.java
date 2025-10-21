/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2.tp.uml;

public class Principal {

    public static void main(String[] args) {
        Bateria bateria = new Bateria("Batería", 80);
        Celular celular = new Celular(351427875, "Iphone", "16 pro max", bateria);
        Usuario usuario = new Usuario("Esper, Amira Yasmin", 35496535);

        usuario.setCelular(celular);

        celular.mostrarInfo();
        bateria.mostrarInfo();
        usuario.mostrarInfo();
    }
}
        
    
    

