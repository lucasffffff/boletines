/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.boletin3_4;

/**
 *
 * @author lucas
 */
import java.util.Scanner;

public class Boletin3_4 {
    /* 
    Programa que pide una cantidad en euros, y luego calcula el desglose de esta
    cantidad en billetes y monedas.
     */
    public static void main(String[] args) {
        // Solicito una cantidad en euros:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cantidad en euros: ");
        int cantidad = scanner.nextInt();

        // Calculo la cantidad en billetes y monedas:
        int numeroBilletes100 = cantidad / 100;
        int numeroBilletes20 = (cantidad % 100) / 20;
        int numeroBilletes5 = ((cantidad % 100) % 20) / 5;
        int numeroMonedas1 = (((cantidad % 100) % 20) % 5) / 1;

        // Muestro el resultado
        System.out.println("Total de efectivo:");
        System.out.println(numeroBilletes100 + " billetes de 100€");
        System.out.println(numeroBilletes20 + " billetes de 20€");
        System.out.println(numeroBilletes5 + " billetes de 5€");
        System.out.println(numeroMonedas1 + " monedas de 1€");
    }
}
