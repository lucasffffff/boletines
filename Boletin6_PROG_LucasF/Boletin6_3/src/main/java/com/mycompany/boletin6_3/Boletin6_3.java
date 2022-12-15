/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.boletin6_3;

/**
 *
 * @author lucas
 */
public class Boletin6_3 {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        System.out.println("Radio círculo: " + circulo.getRadio());
        System.out.println("Área círculo: " + circulo.calcularArea());
        System.out.println("Longitud circunferencia: " + circulo.calcularLonxitude());
    }
}

