/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.boletin7_2;

/**
 *
 * @author lucas
 */
import java.util.Scanner;

public class Boletin7_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el primer número: ");
        short num1 = scanner.nextShort();
        System.out.println("Ingresa el segundo número: ");
        short num2 = scanner.nextShort();
        // Si el primer número es mayor o igual al segundo:
        if (num1 >= num2) {
            //Muestro la resta:
            System.out.println("La resta es: " + (num1 - num2));
            // Si el primer número es menor que el segundo:  
        } else {
            // Muestro la suma
            System.out.println("La suma es: " + (num1 + num2));
        }
    }
}
