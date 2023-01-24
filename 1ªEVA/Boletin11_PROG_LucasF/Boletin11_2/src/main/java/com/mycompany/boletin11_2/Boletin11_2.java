/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.boletin11_2;

/**
 *
 * @author lucas
 */
import java.lang.Math;

public class Boletin11_2 {

    public static void main(String[] args) {
        //Declaro las variables de la suma y el producto:
        long suma = 0;
        double producto = 1;

        for (int i = 10; i <= 90; i++) {
            suma += i;
            producto *= i;
        }

        System.out.println("La suma de los números comprendidos entre 10 y 90 es " + suma + " y su producto es " + producto + ".");
    }
}
