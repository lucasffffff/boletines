/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.boletin2_4;

/**
 *
 * @author lucas
 */
import java.util.Scanner;

public class Boletin2_4 {
    /**
     * Este programa en Java lee dos números ingresados por el usuario y calcula
     * la suma, la resta, el producto y el cociente de esos números. Luego,
     * muestra los resultados por pantalla. Si el segundo número es cero, se
     * avisa al usuario de que no es posible calcular la división.
     */
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer desde la consola
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario que ingrese los números
        System.out.println("Introduzca el primer numero:");
        double num1 = sc.nextDouble();
        System.out.println("Introduzca el segundo numero:");
        double num2 = sc.nextDouble();

        // Calcular la suma y mostrar el resultado
        double sum = num1 + num2;
        System.out.println("La suma da como resultado: " + sum);

        // Calcular la resta y mostrar el resultado
        double resta = num1 - num2;
        System.out.println("La resta da como  resultado: " + resta);

        // Calcular el producto y mostrar el resultado
        double multi = num1 * num2;
        System.out.println("la multiplicación da como resultado: " + multi);

        // Comprobar si es posible dividir num1 entre num2 y, en caso afirmativo,
        // calcular el cociente y mostrar el resultado
        if (num2 == 0) {
            System.out.println("No es posible la división entre 0.");
        } else {
            double divi = num1 / num2;
            System.out.println("La división da como resultado: " + divi);
        }
    }
}
