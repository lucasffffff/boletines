/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.boletin11_3;

/**
 *
 * @author lucas
 */
import java.util.Scanner;

public class Boletin11_3 {

    public static void main(String[] args) {
        // Declaro de variables para base y altura
        double base, altura; 
        Scanner scan = new Scanner(System.in);

        // Pido la base y la altura del rectángulo:
        System.out.print("Ingrese la base del rectángulo: ");
        base = scan.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        altura = scan.nextDouble();

        // Compruebo que la base y la altura son positivas:
        if (base <= 0 || altura <= 0) {
            System.out.println("La base y la altura del rectángulo deben ser positivas.");
            return; // Salimos del programa
        }

        // Calculo el área del rectángulo:
        double area = base * altura;
        System.out.println("El área del rectángulo es: " + area);
    }
}
