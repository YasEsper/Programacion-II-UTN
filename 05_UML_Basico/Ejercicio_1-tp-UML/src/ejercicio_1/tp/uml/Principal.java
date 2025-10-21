/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_1.tp.uml;

public class Principal {

    public static void main(String[] args) {
        Titular titular = new Titular("Esper, Amira Yasmin Elizabeth", "35496535");

        Pasaporte pasaporte = new Pasaporte("X123456", "15/08/2020", "3x3", "JPEG", titular);
        
        pasaporte.mostrar();
        titular.mostrar();
    }
}

    
    

