/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.boletin7_5;

/**
 *
 * @author lucas
 */
import java.util.Scanner;

public class Boletin7_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el primer número: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.println("Ingresa el tercer número: ");
        int num3 = scanner.nextInt();
        // Si el primer número es mayor que el segundo y el tercero:
        if (num1 > num2 && num1 > num3) {
            System.out.println("El mayor número es: " + num1);
            // Si el segundo número es mayor que el primero y el tercero:
        } else if (num2 > num1 && num2 > num3) {
            // Muestro el segundo número:
            System.out.println("El número mayor es: " + num2);
            // Si el tercer número es mayor que el primero y el segundo:
        } else {
            System.out.println("El número mayor es: " + num3);
        }
    }
}
