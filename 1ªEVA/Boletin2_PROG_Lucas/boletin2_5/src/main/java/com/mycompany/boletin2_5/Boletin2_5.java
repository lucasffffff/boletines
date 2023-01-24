/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.boletin2_5;
import java.util.Scanner;

/**
 * Este programa convierte una distancia en millas marinas a metros.
 *
 * @author lucas
 */
public class Boletin2_5 {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer desde la consola
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario que ingrese la distancia en millas marinas
        System.out.println("introduzca la distancia en millas marinas:");
        double millas = sc.nextDouble();

        // Convertir la distancia a metros y mostrar el resultado
        double metros = millas * 1852;
        System.out.println("La distancia introducida en metros es de: " + metros);
    }
}

