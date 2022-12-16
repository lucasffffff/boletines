/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.boletin8_6;

/**
 *
 * @author lucas
 */
import java.util.Scanner;

public class Boletin8_6 {

    public static void main(String[] args) {
        // Creo un objeto Scanner:
        Scanner scan = new Scanner(System.in);

        // Pido el nombre del artículo y las ventas anuales al usuario:
        System.out.print("Ingresa el nombre del artículo: ");
        String nombreArticulo = scan.nextLine();
        System.out.print("Ingresa las ventas anuales: ");
        int ventasAnuales = scan.nextInt();

        // Ifs para mostrar que tipo de artículo es según las ventas anuales:
        String tipoArticulo;
        if (ventasAnuales <= 100) {
            tipoArticulo = "baixo";
        } else if (ventasAnuales <= 500) {
            tipoArticulo = "medio";
        } else if (ventasAnuales <= 1000) {
            tipoArticulo = "alto";
        } else {
            tipoArticulo = "primeira necesidade";
        }
        System.out.println("El artículo " + nombreArticulo + " es " + tipoArticulo + " en ventas");
    }
}
