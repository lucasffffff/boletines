/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.boletin8_7;

/**
 *
 * @author lucas
 */
import java.util.Scanner;

public class Boletin8_7 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Creo tres objetos de la clase Metodos, uno para cada figura geométrica.
        Metodos rectangulo = new Metodos();
        Metodos triangulo = new Metodos();
        Metodos circulo = new Metodos();

        // Muestro un mensaje para elegir un ejercicio.
        System.out.println("Selecciona un ejercicio:");
        int ejercicio = sc.nextInt();

        // Utilizo un switch-case para identificar la opción seleccionada.
        switch (ejercicio) {
            case 1 -> {
                // Calculo el área de un rectángulo y muestro el resultado.
                double areaRectangulo = rectangulo.areaRectangulo(10, 6);
                System.out.println("El área del rectángulo da: " + areaRectangulo);
            }
            case 2 -> {
                // Calculo el área de un triángulo y muestro el resultado.
                double areaTriangulo = triangulo.areaTriangulo(5, 10);
                System.out.println("El área del triángulo da: " + areaTriangulo);
            }
            case 3 -> {
                // Se calcula el área de un círculo y se muestra el resultado por pantalla.
                double areaCirculo = circulo.areaCirculo(8);
                System.out.println("El área del círculo da: " + areaCirculo);
            }
            default -> // Si el número introducido no está dentro de las opciones válidas, da
                // error.
                System.out.println("Opción incorrecto");
        }
    }
}
