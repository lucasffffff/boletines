/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boletin6_3;

/**
 *
 * @author lucas
 */
public class Circulo {
    private double radio;
    private static final double PI = 3.14;

    public Circulo() {
        radio = 0;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return PI * Math.pow(radio, 2);
    }

    public double calcularLonxitude() {
        return 2 * PI * radio;
    }
}

