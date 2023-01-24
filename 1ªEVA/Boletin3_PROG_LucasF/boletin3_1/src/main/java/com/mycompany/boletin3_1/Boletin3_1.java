/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.boletin3_1;

/**
 *
 * @author lucas
 */
import java.util.Scanner;

public class Boletin3_1 {

    /**
     * Este programa en Java calcula el porcentaje descontado en una compra. Se
     * pide al usuario que ingrese el precio de la tarifa y el precio pagado y
     * se utiliza la fórmula correspondiente para calcular el porcentaje
     * descontado.
     */
    public static void main(String[] args) {
        // Creo un objeto Scanner para leer desde la consola:
        Scanner sc = new Scanner(System.in);

        // Pido al usuario que ingrese el precio de la tarifa y el precio pagado:
        System.out.println("Introduzca el precio de la tarifa:");
        double precioTarifa = sc.nextDouble();
        System.out.println("Introduzca el precio pagado:");
        double precioPagado = sc.nextDouble();

        // Calculo el porcentaje descontado y muestro el resultado:
        double porcentajeDescontado = (1 - precioPagado / precioTarifa) * 100;
        System.out.println("El porcentaje descontado es de: " + porcentajeDescontado + "%");
    }
}
