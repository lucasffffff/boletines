/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boletin8_7;

/**
 *
 * @author lucas
 */
public class Metodos {
    // Este es un método que calcula el área de un rectángulo dado su base y altura.
    public double areaRectangulo(double base, double altura) {
        // Función Math.abs() para eliminar el signo negativo si la base o altura lo tuvieran:
        return Math.abs(base * altura);
    }
    // Este es un método que calcula el área del triángulo dado su base y altura.
    public double areaTriangulo(double base, double altura) {
        return Math.abs(base * altura / 2);
    }

    // Este es un método que calcula el área del círculo dado su radio.
    public double areaCirculo(double r) {
        // Función Math.pow() para elevar al cuadrado:
        return Math.abs(Math.PI * Math.pow(r, 2));
    }
}

