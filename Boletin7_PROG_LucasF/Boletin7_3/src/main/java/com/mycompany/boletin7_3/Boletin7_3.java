/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.boletin7_3;

/**
 *
 * @author lucas
 */
import java.util.Scanner;

public class Boletin7_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num = scanner.nextInt();
        // Si es positivo:
        if (num > 0) {
            // Muestro el signo +
            System.out.println("+");
            // Si es negativo:
        } else if (num < 0) {
            // Muestro el signo -
            System.out.println("-");
            // Si es cero: 
        } else {
            // Muestro "0"
            System.out.println("0");
        }
    }
}
