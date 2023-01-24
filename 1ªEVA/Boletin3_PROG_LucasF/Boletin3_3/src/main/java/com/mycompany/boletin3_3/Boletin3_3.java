/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.boletin3_3;

/**
 *
 * @author lucas
 */
import java.util.Scanner;

public class Boletin3_3 {

    public static void main(String[] args) {
        // Creo un objeto Scanner para leer desde consola:
        Scanner sc = new Scanner(System.in);

        // Pido al usuario que ingrese las cantidades de cada billete y moneda:
        System.out.println("Introduzca la cantidad de billetes de 100€:");
        int billete_100 = sc.nextInt();
        System.out.println("Introduzca la cantidad de billetes de 20€:");
        int billete_20 = sc.nextInt();
        System.out.println("Introduzca la cantidad de billetes de 5€:");
        int billete_5 = sc.nextInt();
        System.out.println("Introduzca la cantidad de monedas de 1€:");
        int moneda_1 = sc.nextInt();

        // Calculo la cantidad total en euros:
        int euros = billete_100 * 100 + billete_20 * 20 + billete_5 * 5 + moneda_1;
        System.out.println("La cantidad total en euros es de: " + euros + "€");
    }
}


