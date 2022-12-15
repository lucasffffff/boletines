/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.boletin7_4;

/**
 *
 * @author lucas
 */
import java.util.Scanner;

public class Boletin7_4 {

    /**
     * Este código pide el nombre y el peso de dos personas, y determina cuál de
     * ellas pesa más.
     *
     * @param args
     */
    public static void main(String[] args) {
        double peso1;
        double peso2;

        Scanner obx = new Scanner(System.in);
        System.out.println("Ingresa el peso de la primera persona:");
        peso1 = obx.nextDouble();
        Scanner obx2 = new Scanner(System.in);
        System.out.println("Ingresa el peso de la segunda persona:");
        peso2 = obx2.nextDouble();

        Condicional obx4 = new Condicional();
        obx4.calcularDiferencia(peso1, peso2);

        Condicional obx5 = new Condicional();
        obx5.peso(peso1, peso2);

    }

}
