/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_05.tp.intapoo;

public class NaveEspacial {

    // Atributos Nave Espacial.
    private String nombre;
    private int combustible;
    private final int LIMITE_COMBUSTIBLE = 100;

    // Setters
    public void setNombre(String n) {
        nombre = n;
    }

    public void setCombustible(int c) {
        if (c >= 0 && c <= LIMITE_COMBUSTIBLE) {
            combustible = c;
        } else {
            System.out.println("Combustible fuera de rango (0–100).");
        }
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getCombustible() {
        return combustible;
    }

    // Método despegar
    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println("La nave ha despegado.");
        } else {
            System.out.println("No hay suficiente combustible para despegar.");
        }
    }

    // Método avanzar
    public void avanzar(int distancia) {
        int consumo = distancia * 2; // cada unidad de distancia consume 2 de combustible. distancia = 30 comb. nec. = 60
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println("La nave avanzó " + distancia + " unidades.");
        } else {
            System.out.println("Combustible insuficiente para avanzar " + distancia + " unidades.");
        }
    }

    // Método recargar combustible
    public void recargarCombustible(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser positiva.");
        } else if (combustible + cantidad > LIMITE_COMBUSTIBLE) {
            System.out.println("No se puede superar el límite de " + LIMITE_COMBUSTIBLE + " unidades.");
        } else {
            combustible += cantidad;
            System.out.println("Combustible recargado: +" + cantidad);
        }
    }

    // Mostrar estado
    public void mostrarEstado() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Combustible actual: " + getCombustible() + "/" + LIMITE_COMBUSTIBLE);
        System.out.println("---------------------------");
    }
}
