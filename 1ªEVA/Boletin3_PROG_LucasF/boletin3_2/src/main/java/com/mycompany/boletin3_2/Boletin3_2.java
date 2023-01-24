/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.boletin3_2;

/**
 *
 * @author lucas
 */
import java.util.Scanner;

public class Boletin3_2 {
    /**
     * Este programa en Java recibe como entrada una temperatura en grados
     * centígrados y calcula su equivalente en grados Fahrenheit y grados Kelvin.
     * @param args
     */
    public static void main(String[] args) {
        // Creo un objeto Scanner para leer desde la consola:
        Scanner sc = new Scanner(System.in);

        // Pido al usuario que ingrese la temperatura en grados centígrados:
        System.out.println("Introduzca la temperatura en grados centígrados:");
        double centigrados = sc.nextDouble();

        // Calculo la temperatura en grados Fahrenheit y Kelvin y muestro resultados:
        double fahrenheit = 32 + centigrados * 9 / 5;
        System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit);
        double kelvin = centigrados + 273.15;
        System.out.println("La temperatura en grados Kelvin es: " + kelvin);
    }
}
