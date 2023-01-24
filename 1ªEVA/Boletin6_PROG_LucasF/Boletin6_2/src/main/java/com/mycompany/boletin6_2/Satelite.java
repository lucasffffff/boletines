/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boletin6_2;

/**
 *
 * @author lucas
 */

public class Satelite {
    private double meridiano;
    private double paralelo;
    private double distanciaTerra;

    public Satelite() {
        meridiano = paralelo = distanciaTerra = 0.0;
    }

    public Satelite(double m, double p, double d) {
        meridiano = m;
        paralelo = p;
        distanciaTerra = d;
    }

    public void verPosicion() {
        System.out.println("El satélite se encuentra en el paralelo " + paralelo + " meridiano " + meridiano + " a una distancia de la Tierra " + distanciaTerra);
    }
}


