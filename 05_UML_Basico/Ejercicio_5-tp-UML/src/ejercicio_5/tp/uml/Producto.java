/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_5.tp.uml;

/**
 *
 * @author yases
 */
class Producto {

    private String nombre;
    private double precio;
    private Proveedor proveedor;
    private Pedido pedido;

    public Producto(String nombre, double precio, Proveedor proveedor) {
        this.nombre = nombre;
        this.precio = precio;
        this.proveedor = proveedor;
    }

    // Getter y Setter de nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter de precio
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Getter y Setter de proveedor
    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    // Getter y Setter de pedido (relación bidireccional)
    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
        if (pedido != null && pedido.getProducto() != this) {
            pedido.setProducto(this);
        }
    }

    // Mostrar información
    public void mostrarInfo() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: $" + precio);
        if (proveedor != null) {
            System.out.println("Proveedor: " + proveedor.getNombre() + " (CUIT: " + proveedor.getCuit() + ")");
        }
    }

}
