/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.boletin3_5;

/**
 *
 * @author lucas
 */

public class Boletin3_5 {
  public static void main(String[] args) {
    // Declaro tdas las variables:
    double soldoFixo = 1000;
    double importeTotalVendas = 10000;
    double comision = 0.05;
    double quilometraxe = 2;
    double kmDesplazamiento = 100;
    double dietas = 30;
    double diasDesplazamiento = 10;
    double irpf = 0.18;
    double retencionSeguridadeSocial = 36;

    // Calculo el salario bruto:
    double salarioBruto = soldoFixo + importeTotalVendas * comision + quilometraxe * kmDesplazamiento + dietas * diasDesplazamiento;

    // Calculo el salario líquido:
    double salarioLiquido = salarioBruto - salarioBruto * irpf - retencionSeguridadeSocial;

    // Muestro el salario líquido y bruto en consola:
    System.out.println("Salario bruto: " + salarioBruto);
    System.out.println("Salario líquido: " + salarioLiquido);
  }
}

