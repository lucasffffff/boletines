/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin16;

/**
 *
 * @author lucas
 */
public class Boletin16 {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Pepe", "Fernandez", "45454545F");
        CuentaCorriente cuenta1 = new CuentaCorriente(persona1, 123456);
        cuenta1.ingresar(1000);
        cuenta1.actualizarSaldo();
        System.out.println(cuenta1);

        Persona persona2 = new Persona("Juan", "Estevez", "54545454B");
        CuentaAhorro cuenta2 = new CuentaAhorro(persona2, 636521, 2, 600);
        cuenta2.ingresar(1000);
        cuenta2.actualizarSaldo();
        System.out.println(cuenta2);
        cuenta2.setInteres(3);
        cuenta2.actualizarSaldo();
        System.out.println(cuenta2);
    }
}
