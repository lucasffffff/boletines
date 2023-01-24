/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.boletin11_5;

/**
 *
 * @author lucas
 */
import java.util.Scanner;

public class Boletin11_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ganan1000a1750 = 0; // trabajadores que ganan entre 1000 y 1750€
        int gananMenos1000 = 0; // trabajadores que ganan menos de 1000€
        int totalTrabajadores = 0; // total de trabajadores
        double salario = 1; // variable salario trabajador

        // Bucle while que se ejecuta cuando el salario sea mayor que 0:
        while (salario > 0) {
            // Pido por consola el salario del trabajador
            System.out.println("Escribe el salario del trabajador. 0 si acabaste: ");
            salario = sc.nextDouble();

            // Si el salario es mayor que 0, aumentamos el contador de trabajadores y vemos en que rango de sueldo entra.
            if (salario > 0) {
                totalTrabajadores++;
                if (salario >= 1000 && salario <= 1750) {
                    ganan1000a1750++;
                } else if (salario < 1000) {
                    gananMenos1000++;
                }
            }
        }

        // Porcentaje que ganan menos de 1000€
        double porcentajeMenos1000 = (double) gananMenos1000 / totalTrabajadores * 100;

        System.out.println("Hay " + ganan1000a1750 + " que ganan entre 1000 y 1750€ ");
        System.out.println("Un " + porcentajeMenos1000 + " % " + "gana menos de 1000€");
    }
}
