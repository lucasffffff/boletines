/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boletin5;

/**
 *
 * @author lucas
 */
public class Consumo {
    // Atributos:

    private int km;
    private int litros;
    private int vMed;
    private double pGas;

    // Constructor por defecto:
    public Consumo() {
        km = 0;
        litros = 0;
        vMed = 0;
        pGas = 0.0;
    }

    // Constructor con parámetros:
    public Consumo(int km, int litros, int vMed, double pGas) {
        this.km = km;
        this.litros = litros;
        this.vMed = vMed;
        this.pGas = pGas;
    }

    // Método obtener tiempo empleado en el viaje
    public int getTempo() {
        return km / vMed;
    }

    // Método para obtener el consumo medio de combustible:
    public double consumoMedio() {
        return (100.0 * litros) / km;
    }

    // Método para obtener consumo medio en €:
    public double consumoEuros() {
        return (100.0 * pGas * litros) / km;
    }

    // Método para modificar el valor de los kilómetros:
    public void setKms(int km) {
        this.km = km;
    }

    // Método para modificar el valor de los litros
    public void setLitros(int litros) {
        this.litros = litros;
    }

    // Método para modificar el valor de velocidad media.
    public void setvMed(int vMed) {
        this.vMed = vMed;
    }

    // Método para modificar el valor de pGas
    public void setPGas(double pGas) {
        this.pGas = pGas;
    }
    public int vMed() {
    return vMed;
    }
    public int getvMed() {
        return vMed;
    }

}
