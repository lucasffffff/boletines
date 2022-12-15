/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.boletin6_1;

/**
 *
 * @author lucas
 */
public class Boletin6_1 {
    public static void main(String[] args) {
        Coche coche = new Coche();
        System.out.println("Velocidad inicial: " + coche.getVelocidade());

        coche.acelerar(20);
        System.out.println("Velocidad después de acelerar: " + coche.getVelocidade());

        coche.frenar(10);
        System.out.println("Velocidad después de frenar: " + coche.getVelocidade());
    }
}

