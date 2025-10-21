/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_5.tp.uml;

class Pedido {

    private int numero;
    private String fecha;
    private Producto producto;

    public Pedido(int numero, String fecha) {
        this.numero = numero;
        this.fecha = fecha;

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
        if (producto != null && producto.getPedido() != this) {
            producto.setPedido(this);
        }
    }

    public void mostrarInfo() {
        System.out.println("Pedido N°: " + numero);
        System.out.println("Fecha: " + fecha);
        if (producto != null) {
            System.out.println("Producto solicitado: " + producto.getNombre() + " [$" + producto.getPrecio() + "]");
        }
    }

}
