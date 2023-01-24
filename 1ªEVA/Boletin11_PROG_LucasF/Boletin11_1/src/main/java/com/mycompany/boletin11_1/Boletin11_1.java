/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.boletin11_1;

/**
 *
 * @author lucas
 */
import java.util.Scanner;

public class Boletin11_1 {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Variables para contar la cantidad de números negativos, positivos y
        // ceros.
        int negativos = 0;
        int positivos = 0;
        int ceros = 0;

        // Solicito introducir 10 números.
        System.out.println("Introduce 10 números:");
        for (int i = 0; i < 10; i++) {
            int numero = sc.nextInt();

            if (numero < 0) {
                negativos++;
            } else if (numero > 0) {
                positivos++;
            } else {
                ceros++;
            }
        }
        System.out.println("Hay " + negativos + " números negativos, " + positivos + " números positivos y " + ceros + " ceros.");
    }
}
