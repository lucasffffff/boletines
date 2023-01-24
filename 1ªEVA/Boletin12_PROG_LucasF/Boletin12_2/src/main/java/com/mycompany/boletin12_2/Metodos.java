/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boletin12_2;

/**
 *
 * @author lucas
 */
import javax.swing.JOptionPane;

public class Metodos {
    
    private int numero1;
    private final int numero2 = (int) (Math.random() * 50 + 1);
    private int distancia;
    private final int muyLejos = 20;
    private final int lejos = 10;
    private final int cerca = 5;
    private final int muyCerca = 1;

    public void juegoNums() {
        // Pido un número:
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Jugador 1, pon un número del 1 al 50:"));
        // Calculamos la distancia entre el número introducido y el número a adivinar
        distancia = Math.abs(numero1 - numero2);
        // Compruebo la distancia:
        if (distancia > muyLejos) {
            JOptionPane.showMessageDialog(null, "Muy lejos");
        } else if (distancia >= lejos && distancia <= muyLejos) {
            JOptionPane.showMessageDialog(null, "Lejos");
        } else if (distancia > cerca && distancia < lejos) {
            JOptionPane.showMessageDialog(null, "Cerca");
        } else if (distancia <= cerca && distancia >= muyCerca) {
            JOptionPane.showMessageDialog(null, "Muy cerca");
        } else if (distancia == 0) {
            // Si el introducido correcto, termino el juego
            JOptionPane.showMessageDialog(null, "¡Acertaste!");
        }
    }
}
