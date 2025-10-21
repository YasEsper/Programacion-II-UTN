/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_12.tp.uml;

class Impuesto {

    private double monto;
    private Contribuyente contribuyente;

    public Impuesto(double monto, Contribuyente contribuyente) {
        this.monto = monto;
        this.contribuyente = contribuyente;
    }

    public double getMonto() {
        return monto;
    }

    public Contribuyente getContribuyente() {
        return contribuyente;
    }

    public void mostrarInfo() {
        System.out.println("Monto del impuesto: $" + monto);
        if (contribuyente != null) {
            System.out.println("Contribuyente: " + contribuyente.getNombre() + " (CUI: " + contribuyente.getCui() + ")");
        }
    }

}
