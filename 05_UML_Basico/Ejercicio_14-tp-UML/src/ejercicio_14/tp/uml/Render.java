/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_14.tp.uml;

class Render {
    private String formato;
    private Proyecto proyecto;

    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }

    public String getFormato() {
        return formato;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void mostrarInfo() {
        System.out.println("Render en formato: " + formato);
        if (proyecto != null) {
            System.out.println("Proyecto exportado: " + proyecto.getNombre() + " (" + proyecto.getDuracionMin() + " min)");
        }
    } 
}
