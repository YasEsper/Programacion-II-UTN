/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_13.tp.uml;

class CodigoQR {

    private String valor;
    private Usuario usuario;

    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }

    public String getValor() {
        return valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void mostrarInfo() {
        System.out.println("Código QR: " + valor);
        if (usuario != null) {
            System.out.println("Generado para: " + usuario.getNombre() + " (" + usuario.getEmail() + ")");
        }
    }

}
