/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.boletin5;

/**
 *
 * @author lucas
 */
public class Boletin5 {
  public static void main(String[] args) {
    // Crea un objeto de tipo Consumo sin parámetros
    Consumo consumo1 = new Consumo();

    // Establece los valores de litros y pGas del objeto
    consumo1.setLitros(50);
    consumo1.setPGas(1.57);

    // Crea un objeto de tipo Consumo con todos los parámetros
    Consumo consumo2 = new Consumo(100, 50, 60, 1.57);

    // Muestra el consumo medio del objeto consumo2
    System.out.println(consumo2.consumoMedio());

    // Modifica el valor de litros del objeto consumo2
    consumo2.setLitros(60);

    // Muestra la velocidad media del objeto consumo2
    System.out.println(consumo2.vMed());
  }
}


