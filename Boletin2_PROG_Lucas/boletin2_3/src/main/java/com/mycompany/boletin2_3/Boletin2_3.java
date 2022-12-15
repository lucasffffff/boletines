/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.boletin2_3;

/**
 *
 * @author lucas
 */
import java.util.Scanner;

public class Boletin2_3 {
    /**
     * Este código permite convertir una cantidad dada en euros a dólares,
     * utilizando el precio del dólar introducido por el usuario.Para ello, se
 utiliza la clase Scanner para leer la cantidad de euros que se desean
 cambiar y el precio del dólar. Luego, se realiza la conversión y se
 muestra el resultado en pantalla.
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de euros que desea convertir: ");
        double euros = sc.nextDouble();
        System.out.println("Introduzca el valor actual del dólar: ");
        double dolar = sc.nextDouble();
        double convert = euros * dolar;
        System.out.println("Tienes un total de " + convert + " dólares.");
    }
}
