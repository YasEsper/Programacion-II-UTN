/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package division_sol_inc;

import java.util.Scanner;


public class Division_Sol_inc {

   
    public static void main(String[] args) {
  
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = input.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = input.nextInt();

        int divisionEntera = num1 / num2;
        double divisionDecimal = (double) num1 / num2;  // Cambiamos la variable que ingreso como int a double

        System.out.println("División entera: " + divisionEntera);
        System.out.printf("División decimal: %.2f\n", divisionDecimal); // Mostramos numero decimal en dos cifras
    }
}
  