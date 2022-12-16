/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.boletin11_4;

/**
 *
 * @author lucas
 */
import java.util.Scanner;

public class Boletin11_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Variable para almacenar el resultado de la multiplicación:
        int por = 0; 
        // Declaro una variable para seguir o salir del programa:
        int opcion = 1; 

        // Bucle que se ejecuta cuando la opción no es 0:
        while (opcion != 0) {
            // Pido un número por consola:
            System.out.println("Dame un número:");
            int n = sc.nextInt();

            // Imprimo la tabla de multiplicar del número recibido:
            for (int i = 1; i < 11; i++) {
                por = n * i;
                System.out.println(n + " * " + i + " = " + por);
            }

            System.out.println("Pulsa 0 para salir y otro para continuar:");
            opcion = sc.nextInt();
        }
    }
}
