/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.boletin7_1;

/**
 *
 * @author lucas
 */
import java.util.Scanner; // Importamos la clase Scanner para leer un número ingresado por el usuario

public class Boletin7_1 {

    public static void main(String[] args) {
        // Creo el scanner:
        Scanner scanner = new Scanner(System.in);
        // Pido un número:
        System.out.println("Ingresa un número: ");
        // Leo el número:
        int num = scanner.nextInt();
        // Si es positivo:
        if (num > 0) {
            // Muestro por consola si el número es positivo:
            System.out.println(num + " es positivo");
        }
    }
}
