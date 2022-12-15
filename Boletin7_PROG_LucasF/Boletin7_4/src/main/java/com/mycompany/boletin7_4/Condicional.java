/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boletin7_4;

/**
 *
 * @author lucas
 */
public class Condicional {
    private double diferencia;
    public void peso(double peso1, double peso2) {
        if (peso1 < peso2) {
            System.out.println("La segunda persona pesa más");
        } else {
            System.out.println("La primera persona pesa más");
        }
    }
    public void calcularDiferencia(double peso1, double peso2) {
        diferencia = Math.abs(peso1 - peso2);
        System.out.println("La diferencia de peso es de: " + diferencia + " kg");
    }
}
