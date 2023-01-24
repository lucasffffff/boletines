/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.boletin6_2;

/**
 *
 * @author lucas
 */
public class Boletin6_2 {
    public static void main(String[] args) {
        Satelite satelite = new Satelite();
        satelite.verPosicion();

        Satelite satelite2 = new Satelite(20, 30, 40);
        satelite2.verPosicion();
    }
}
