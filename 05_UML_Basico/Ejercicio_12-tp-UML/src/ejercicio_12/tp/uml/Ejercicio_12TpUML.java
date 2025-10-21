/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_12.tp.uml;


public class Ejercicio_12TpUML {

    
    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("Amira Yasmin Elozabeth Esper", "20-35496535-9");
        Impuesto impuesto = new Impuesto(12500.00, contribuyente);
        Calculadora calculadora = new Calculadora();
        
        contribuyente.mostrarInfo();
        impuesto.mostrarInfo();
        calculadora.calcular(impuesto);

    }
    
}
