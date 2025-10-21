/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_4.tp.uml;

public class Principal {
        
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Nación", 301234567);
        TarjetaDeCredito tarjetaDeCredito = new TarjetaDeCredito(452174613, "17/05/2027" );
        Cliente cliente = new Cliente("Amira Yasmin  Elizabeth Esper ", 35496535);
        
        tarjetaDeCredito.setCliente(cliente);
        tarjetaDeCredito.setBanco(banco);
        cliente.setTarjetaDeCredito(tarjetaDeCredito);
     
        tarjetaDeCredito.mostrarInfo();
        cliente.mostrarInfo();
        banco.mostrarInfo();
    }
    
}
