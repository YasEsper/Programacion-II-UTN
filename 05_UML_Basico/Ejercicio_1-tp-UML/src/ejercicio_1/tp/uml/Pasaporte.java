/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1.tp.uml;

class Pasaporte { 
    
    private String numero;
    private String fechaEmision;
    private Foto foto;
    private Titular titular;

    public Pasaporte(String numero, String fechaEmision, String imagen, String formato, Titular titular) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formato); 
        this.titular = titular;
        
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }

    public Titular getTitular() {
        return titular;
    }

    public void mostrar() {
        System.out.println("Pasaporte Nº: " + numero);
        System.out.println("Fecha de emisión: " + fechaEmision);
        System.out.println("Foto: " + foto.getImagen() + " (" + foto.getFormato() + ")");
        if (titular != null) {
            System.out.println("Titular: " + titular.getNombre() + " - DNI: " + titular.getDni());
        }
    }



}
        
    
    


