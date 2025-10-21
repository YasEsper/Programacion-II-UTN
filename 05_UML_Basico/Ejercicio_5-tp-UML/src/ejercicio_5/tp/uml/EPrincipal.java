/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_5.tp.uml;


public class EPrincipal {

    public static void main(String[] args) {
        Proveedor proveedor = new Proveedor("Distribuidora Venex", "30-12345678-9");
        Producto producto = new Producto("Notebook Hp victus 18", 850000.00, proveedor);
        Pedido pedido = new Pedido(1001, "19/10/2025");

        pedido.setProducto(producto);

        proveedor.mostrarInfo();
        producto.mostrarInfo();
        pedido.mostrarInfo();
    }


}
